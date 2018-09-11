package Org.Bhavya.HRApplication.HRApp.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import org.springframework.stereotype.Component;

import Org.Bhavya.HRApplication.HRApp.Database.EmployeeDatabase;
import Org.Bhavya.HRApplication.HRApp.Exception.EmployeeNotFoundException;
import Org.Bhavya.HRApplication.HRApp.Model.Address;
import Org.Bhavya.HRApplication.HRApp.Model.Contact;
import Org.Bhavya.HRApplication.HRApp.Model.Employee;
import Org.Bhavya.HRApplication.HRApp.Resource.EmployeeResources;
@Component
public class EmployeeService {
private Map<String, Employee> employees = EmployeeDatabase.getEmps();
	
	public EmployeeService()
	{
		Address a1 = new Address("House1", "Street1", "AB115AL", "Pune", "Maharastra");
		Address a2 = new Address("House2", "Street2", "AB115AM", "Pune", "Maharastra");
		Address a3 = new Address("House3", "Street3", "AB115AN", "Pune", "Maharastra");
		Address a4 = new Address("House4", "Street4", "AB115AL", "Mumbai", "Maharastra");
		Address a5 = new Address("House5", "Street5", "AB115AO", "Mumbai", "Maharastra");
		Address a6 = new Address("House6", "Street6", "AB115AL", "Bangalore", "Karnataka");
		Address a7 = new Address("House7", "Street7", "AB115AY", "Bangalore", "Karnataka");
		Address a8 = new Address("House8", "Street8", "AB115AZ", "Chennai", "TN");
		Address a9 = new Address("House9", "Street9", "AB115AX", "Pune", "Maharastra");
		Address a10 = new Address("House10", "Street10", "AB115AV", "Pune", "Maharastra");
		
		Contact c1 = new Contact("0800099999", "9100099999", "ABC@gmail.com");
		Contact c2 = new Contact("0800099998", "9100099998", "DEF@gmail.com");
		Contact c3 = new Contact("0800099997", "9100099997", "GHI@gmail.com");
		Contact c4 = new Contact("0800099996", "9100099996", "TYU@gmail.com");
		Contact c5 = new Contact("0800099995", "9100099995", "OPK@gmail.com");
		Contact c6 = new Contact("0800099994", "9100099994", "QGV@gmail.com");
		Contact c7 = new Contact("0800099993", "9100099993", "PLM@gmail.com");
		Contact c8 = new Contact("0800099992", "9100099992", "OMK@gmail.com");
		Contact c9 = new Contact("0800099991", "9100099991", "PLK@gmail.com");
		Contact c10 = new Contact("0800099990", "9100099990", "AOL@gmail.com");
		
		Employee e1 = new Employee("Emp1", "101", "FSADM", c1, a1);
		Employee e2 = new Employee("Emp2", "102", "FSADM", c2, a2);
		Employee e3 = new Employee("Emp3", "103", "MFG", c3, a3);
		Employee e4 = new Employee("Emp4", "104", "FSADM", c4, a4);
		Employee e5 = new Employee("Emp5", "105", "CICS", c5, a5);
		Employee e6 = new Employee("Emp6", "106", "FSADM", c6, a6);
		Employee e7 = new Employee("Emp7", "107", "MFG", c7, a7);
		Employee e8 = new Employee("Emp8", "108", "FSADM", c8, a8);
		Employee e9 = new Employee("Emp9", "109", "FSADM", c9, a9);
		Employee e10 = new Employee("Emp10", "110", "CICS", c10, a10);
		
		employees.put(e1.getEmpId(), e1);
		employees.put(e2.getEmpId(), e2);
		employees.put(e3.getEmpId(), e3);
		employees.put(e4.getEmpId(), e4);
		employees.put(e5.getEmpId(), e5);
		employees.put(e6.getEmpId(), e6);
		employees.put(e7.getEmpId(), e7);
		employees.put(e8.getEmpId(), e8);
		employees.put(e9.getEmpId(), e9);
		employees.put(e10.getEmpId(), e10);

		
	}
	
	
	
	public List<Employee> getAllEmployees()
	{
	 return new ArrayList<Employee>(employees.values());
	
	}
	
	public Map<String, Contact> getSpecifcEmployees()
	{
		List<Employee> EmpSpec = new ArrayList<>(employees.values());
		List<Employee> em = EmpSpec.stream().filter(p->p.getAddrDetails().getCity() == "Pune" || p.getAddrDetails().getCity() == "Mumbai" ).collect(Collectors.toList());	

		Map<String, Contact> map1 = new HashMap<>();
		for(Employee e: em)
		{
		 map1.put(e.getEmpName(), e.getContactDetails());
		}

		return  map1;
	}
	
	public Employee getEmployee(String eid)
	{
		Employee emp = employees.get(eid);
		if (emp == null) {
			throw new EmployeeNotFoundException("Employee Id" + eid + "Not Found");
		}
			return emp;
	}
	public Employee addEmployee(Employee emp)
	{
		employees.put(emp.getEmpId(), emp);
		return emp;
	}
	
	public Employee updateEmployee(Employee emp)
	{
		if(emp.getEmpId() == null)
			return null;
		
		employees.put(emp.getEmpId(), emp);
		return emp;
	}
	
	public Employee removeEmployee(String eid)
	{
		return employees.remove(eid);
	}
	
	
}
