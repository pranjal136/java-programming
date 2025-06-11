public class Employee {
	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;

	// Getter and Setter for employeeId
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	// Getter and Setter for employeeName
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	// Getter and Setter for salary
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// Getter for bonus (optional, if you want to access it externally)
	public int getBonus() {
		return bonus;
	}

	// Getter and Setter for jobLevel
	public int getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}

	// Method to calculate total salary
	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}

/* # Tester Class */
public class Tester {

	public static void main(String args[]) {

		Employee employee = new Employee();

		employee.setEmployeeId("C101");
		employee.setEmployeeName("Steve");
		employee.setSalary(650);
		employee.setJobLevel(4);

		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getSalary());
	}
}


