package HospitalProject;

public class Nurse {

	private int empNumber;
	private String empName;
	private int numPatients;
	
	
	public int getEmpNumber() {
		return empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public int getNumPatients() {
		return numPatients;
	}
	
	
	public Nurse(int empNumber, String empName, int numPatients) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.numPatients = numPatients;
	}
	
	
	
	@Override
	public String toString() {
		return "Nurse [empNumber=" + empNumber + ", empName=" + empName + ", numPatients=" + numPatients + "]";
	}
	
	
}