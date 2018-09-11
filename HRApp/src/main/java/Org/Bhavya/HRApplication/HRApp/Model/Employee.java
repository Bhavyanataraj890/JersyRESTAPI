package Org.Bhavya.HRApplication.HRApp.Model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String EmpName;
	private String EmpId;
	private String DUnit;
	private Contact ContactDetails;
	private Address AddrDetails;
	private List<Link> links = new ArrayList<>();
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getDUnit() {
		return DUnit;
	}
	public void setDUnit(String dUnit) {
		DUnit = dUnit;
	}
	public Employee() {
		super();
	}
	public Employee(String empName, String empId, String dUnit, Contact contactDetails, Address addrDetails) {
		super();
		EmpName = empName;
		EmpId = empId;
		DUnit = dUnit;
		ContactDetails = contactDetails;
		AddrDetails = addrDetails;
	}
	public Contact getContactDetails() {
		return ContactDetails;
	}
	public void setContactDetails(Contact contactDetails) {
		ContactDetails = contactDetails;
	}
	public Address getAddrDetails() {
		return AddrDetails;
	}
	public void setAddrDetails(Address addrDetails) {
		AddrDetails = addrDetails;
	}
	
	public void addLink(String url, String rel)
	{
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}
	
	
}
