package Org.Bhavya.HRApplication.HRApp.Model;

public class Address {
	
	private String AddrLine1;
	private String AddrLine2;
	private String Pincode;
	private String City;
	private String State;
	public String getAddrLine1() {
		return AddrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		AddrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return AddrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		AddrLine2 = addrLine2;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Address(String addrLine1, String addrLine2, String pincode, String city, String state) {
		super();
		AddrLine1 = addrLine1;
		AddrLine2 = addrLine2;
		Pincode = pincode;
		City = city;
		State = state;
	}
	public Address() {

	}
	

}

