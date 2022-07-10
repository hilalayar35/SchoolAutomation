package Controllers;
import java.sql.Date;

public class AccountController {
	private String userName;
	private String password;
	private Date createdOn;
	private Date lastLogin;
	private int tc;
	private StudentController studentController;
	private ContactController contactController;
	private FamilyInfoController familyInfoController;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public int getTc() {
		return tc;
	}
	public void setTc(int tc) {
		this.tc = tc;
	}
	public StudentController getStudentController() {
		return studentController;
	}
	public void setStudentController(StudentController studentController) {
		this.studentController = studentController;
	}
	public ContactController getContactController() {
		return contactController;
	}
	public void setContactController(ContactController contactController) {
		this.contactController = contactController;
	}
	public FamilyInfoController getFamilyInfoController() {
		return familyInfoController;
	}
	public void setFamilyInfoController(FamilyInfoController familyInfoController) {
		this.familyInfoController = familyInfoController;
	}
}
