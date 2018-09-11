package Org.Bhavya.HRApplication.HRApp.Model;

public class Contact {

	private String HomeTeleNo;
	private String MobileNo;
	private String Email;
	public String getHomeTeleNo() {
		return HomeTeleNo;
	}
	public void setHomeTeleNo(String homeTeleNo) {
		HomeTeleNo = homeTeleNo;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Contact() {

	}
	public Contact(String homeTeleNo, String mobileNo, String email) {
		super();
		HomeTeleNo = homeTeleNo;
		MobileNo = mobileNo;
		Email = email;
	}
	
}

