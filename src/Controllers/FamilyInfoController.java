package Controllers;

public class FamilyInfoController extends StudentController {
	private String motherJob;
	private String motherName;
	private String fatherJob;
	private String fatherName;
	
	public String getMotherJob() {
		return motherJob;
	}
	public void setMotherJob(String motherJob) {
		this.motherJob = motherJob;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherJob() {
		return fatherJob;
	}
	public void setFatherJob(String fatherJob) {
		this.fatherJob = fatherJob;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	
}
