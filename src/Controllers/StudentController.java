package Controllers;

public class StudentController extends AccountController {
	private String firstName;
	private String lastName;
	private int TC;
	private short age;
	private char gender;
	private FamilyInfoController familyInfoController;
	private ContactController contactController;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getTC() {
		return TC;
	}

	public void setTC(int tC) {
		TC = tC;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public FamilyInfoController getFamilyInfoController() {
		return familyInfoController;
	}

	public void setFamilyInfoController(FamilyInfoController familyInfoController) {
		this.familyInfoController = familyInfoController;
	}

	public ContactController getContactController() {
		return contactController;
	}

	public void setContactController(ContactController contactController) {
		this.contactController = contactController;
	}
	
	
}
