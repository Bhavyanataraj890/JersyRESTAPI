package Org.Bhavya.HRApplication.HRApp.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;

import Org.Bhavya.HRApplication.HRApp.Model.Contact;
import Org.Bhavya.HRApplication.HRApp.Model.Employee;
import Org.Bhavya.HRApplication.HRApp.Service.EmployeeService;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("employees")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResources {
	@Autowired
	EmployeeService eService;
	

	@GET
	public List<Employee> getEmployee(@Context UriInfo uriInfo)
	{
		
				List<Employee> emp = eService.getAllEmployees();
				for(Employee e : emp)
				{
				String url = uriInfo
				.getBaseUriBuilder()
				.path(EmployeeResources.class)
				.path(e.getEmpId())
				.build()
				.toString();
				e.addLink(url, "self");
				}
				
				return emp;
	}
	
	@GET
	@Path("/Specifc")
	public Map<String, Contact> getEmployeeSpec()
	{
		return eService.getSpecifcEmployees();
	}	
	
	@GET
	@Path("/{empId}")
	public Employee getEmployee(@PathParam("empId") String empId, @Context UriInfo uriInfo)
	{
		
		Employee emp = eService.getEmployee(empId);
		String url = uriInfo
		.getBaseUriBuilder()
		.path(EmployeeResources.class)
		.path(emp.getEmpId())
		.build()
		.toString();
		emp.addLink(url, "self");
		return emp;
		
	}
	
	@POST
	public Employee addEmployee(Employee emp)
	{
		return eService.addEmployee(emp);
	}
	
	@PUT
	@Path("/{empId}")
	public Employee updateEmployee(@PathParam("empId") String empId, Employee emp)
	{
		emp.setEmpId(empId);
		return eService.updateEmployee(emp);
	}
	
	
	@DELETE
	@Path("/{empId}")
	public void deleteEmployee(@PathParam("empId") String empId)
	{
		eService.removeEmployee(empId);	
	}
	
	
}
