/*
 * IndianValley University provides education in different courses and has more than 200 faculties 
 * working in various departments. The university wants to calculate the annual salary 
 * for each faculty member. Basic salary is provided for all faculties and an additional 
 * component is paid based on their designation or qualification. 
 * You need to help the university in creating an application for them by 
 * implementing the classes based on the class diagram and description given below.

Method Description:- 
- Faculty
# Faculty(String name, float basicSalary)
* Initialize the name and basicSalary with the values passed to the constructor.
* Set the bonusPercentage and carAllowancePercentage to 4 and 2.5 respectively.
# calculateSalary()
* Calculate and return the total salary of a faculty member by adding all the three components - 
* basicSalary, bonus and car allowance.
* Implement the getter and setter methods appropriately.

- OfficeStaff
# OfficeStaff() 
* Initialize the name, basicSalary and designation with the values passed to the constructor.
# calculateSalary()
* Calculate and return the salary of an office staff by adding an additional pay 
* to the salary based on the designation. Use the details given below for calculating the additional pay. 
* There will be no additional pay for other designations.
* Implement the getter and setter methods appropriately.

- Teacher
# Teacher(String name, float basicSalary, String qualification)
* Initialize the name, basicSalary and qualification with the values passed to the constructor.
# calculateSalary()
* Calculate and return the salary of a teacher by adding an additional pay to the salary 
* based on the qualification. Use the details given below for calculating the additional pay. 
* There will be no additional pay for other qualifications.
* Implement the getter and setter methods appropriately.
Perform case sensitive comparison wherever applicable.

# Hint: Use String.equals() for comparing qualification and designation.
Test the functionalities using the provided Tester class.
 */

class Faculty{
    //Implement your code here
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 4f;
        this.carAllowancePercentage = 2.5f;
    }

    public double calculateSalary() 
    {
        double facultySalary = this.getBasicSalary() * 
          (1 + (this.getBonusPercentage() / 100) + (this.getCarAllowancePercentage() / 100));
        return facultySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
}

class OfficeStaff extends Faculty {
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    @Override
    public double calculateSalary() {
        double additionalPay = super.calculateSalary();
        double staffSalary = 0;

        if (this.getDesignation().equals("Accountant")) {
            staffSalary = additionalPay+10000.0;
        } else if (this.getDesignation().equals("Clerk")) {
            staffSalary = additionalPay+7000.0;
        } else if (this.getDesignation().equals("Peon")) {
            staffSalary = additionalPay+4500.0;
        }
        else{
            staffSalary = additionalPay;
        }
        super.setBasicSalary((float)staffSalary);
        return staffSalary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

class Teacher extends Faculty {
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary() {
        double additionalPay = super.calculateSalary();
        double teacherSalary = 0;

        if (this.getQualification().equals("Doctoral")) {
            teacherSalary = additionalPay+20000.0;
        } 
        else if (this.getQualification().equals("Masters")) {
            teacherSalary = additionalPay+18000.0;
        } 
        else if (this.getQualification().equals("Bachelors")) {
            teacherSalary = additionalPay+15500.0;
        } else if (this.getQualification().equals("Associate")) {
            teacherSalary = additionalPay+10000.0;
        }
        else{
            teacherSalary = additionalPay;
        }
        this.setBasicSalary((float)teacherSalary);
        return teacherSalary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
/* # Tester Class */
class Tester {
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code  
        Teacher t2 = new Teacher("Liam", 28000f, "Doctoral");
        System.out.println("\nName: " + t2.getName());
        System.out.println("Qualification: " + t2.getQualification());
        System.out.println("Total salary: $" + Math.round(t2.calculateSalary() * 100) / 100.0);

	}
}
