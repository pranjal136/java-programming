/* 
Observe the code given below. The object of child class is getting created by passing parameters 
  to the child class constructor but the variables get initialized using the parent class constructor.
  */
class Employee {
	int employeeId;
	String employeeName;

	// Parameterized constructor
	Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void display() {
		System.out.println("Employee details");
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
	}
}

class Manager extends Employee {
	private String designation;

	Manager(int employeeId, String employeeName, String designation) {
		super(employeeId, employeeName);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

class Tester {
	public static void main(String[] args) {
		Manager obj = new Manager(101, "John", "Lead");
		obj.display();
		System.out.println("Designation: " + obj.getDesignation());
	}
}
