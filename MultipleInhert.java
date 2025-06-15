/*
 * A construction company wants to keep a record of the employees working in it. 
 * There are permanent employees as well as contract employees. 
 * Contract employees work on an hourly basis whereas permanent employees are paid monthly salary. 
 * An application needs to be developed for the company for storing the employee details.

Implement the classes based on the class diagram and description given below.
Method Description 

- Employee
* Employee(int employeeId, String employeeName)
* Initialize the employeeId and employeeName instance variables appropriately 
* with the values passed to the constructor.
* Implement the getter and setter methods appropriately.

- PermanentEmployee
# PermanentEmployee(int empId, String name, double basicPay, double hra, float experience)
* Initialize the employeeId, employeeName, basicPay, hra and experience instance variables 
* appropriately with the values passed to the constructor.
# calculateMonthlySalary()
* Calculate and set the salary of the employee using the formula given below.
* salary = basic pay + hra + variable component
* Variable component is calculated based on the employee's experience according to the table given below.

Note: Set the calculated salary after rounding off using the Math.round(double a) method.
Implement the getter and setter methods appropriately.

- ContractEmployee
# ContractEmployee(int empId, String name, double wage, float hoursWorked)
* Initialize the employeeId, employeeName, wage and hoursWorked instance variables 
* appropriately with the values passed to the constructor.
# calculateSalary()
* Calculate the salary of the employee using the formula given below.
* salary = hoursWorked * wage
* Implement the getter and setter methods appropriately.

Test the functionalities using the provided Tester class. 
 */

class Employee {
      
    //Implement your code here 
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    
}


class PermanentEmployee extends Employee {
      
    //Implement your code here 
    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public void calculateMonthlySalary() {
        float variableComponent = 0f;
        if (this.experience >= 3 && this.experience < 5) {
            variableComponent = 5f;
        } else if (this.experience >= 5 && this.experience < 10) {
            variableComponent = 7f;
        } else if (this.experience >= 10) {
            variableComponent = 12f;
        }
        double salary = (this.basicPay * (variableComponent / 100)) + this.basicPay + this.hra;
    this.setSalary(salary);
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    
}

class ContractEmployee extends Employee {
     
    //Implement your code here 
    private double wage;
    private float hoursWorked;

    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        double salary = wage * hoursWorked;
        setSalary(salary);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
    
}

/* # Tester Class */
class Tester {
      
    public static void main(String[] args) {
      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
	    permanentEmployee.calculateMonthlySalary();
	    System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
	            
	    ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
	    contractEmployee.calculateSalary();
	    System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
	        
	    //Create more objects for testing your code
	    PermanentEmployee senior = new PermanentEmployee(911212, "George", 2500, 150, 10f);
        senior.calculateMonthlySalary();
        System.out.println(senior);

        ContractEmployee hourly = new ContractEmployee(110, "Sophia", 20, 50);
        hourly.calculateSalary();
        System.out.println(hourly);
    }
      
}
