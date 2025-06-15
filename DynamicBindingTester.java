/*
 * Dynamic binding also allows the programmer to have generic methods.
Generic methods will have the parent type as the formal argument. 
Such methods accepting the parent type allows working with the objects of it as well as child type.
The code given below shows an example of a generic method accepting the parent reference as the argument.
Execute the code and observe the output.
 */

public class DynamicBindingTester {
		public static void main(String[] args) {
			Employee employee = new Employee();
			Manager manager = new Manager();
			Employee eduEmployee = new Educator();
			Educator managerEdu = new Manager();
			
			displayEmployeeDetails(employee);
			displayEmployeeDetails(manager);
			displayEmployeeDetails(eduEmployee);
			displayEmployeeDetails(managerEdu);
		}
		
		// Employee reference can accept its object and any of the child object 
		public static void displayEmployeeDetails(Employee employee) {
			employee.displayDetails();	// displayDetails invoked will be based on the object received
		}
	}

	class Employee {
		String name = "James Anthony";
		
		public void displayDetails(){
			System.out.println(name+" is an employee");
		}	
	}
	class Educator extends Employee {
		public void displayDetails(){
			System.out.println(name+" is an educator");
		}
	}
	class Manager extends Educator {
		public void displayDetails(){
			System.out.println(name+" is a manager");
		}
}
