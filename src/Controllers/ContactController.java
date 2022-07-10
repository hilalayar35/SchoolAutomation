package Controllers;
// Contac class is controller
public class ContactController {
	private String phoneNumber;
	private String address;
	private String mail;
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMail() {
		return mail;
	}
}
