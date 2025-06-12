/*
Implement the class Teacher based on the class diagram and description given below.
Method Description

Teacher(String teacherName, String subject, double salary)

Initialize the values of all the instance variables appropriately with the values passed

Create a Tester class. Create 4 objects of Teacher class. Create an array of type Teacher store the created objects and display the details of the teachers.
  */

public class Teacher {
    // Instance variables
    private String teacherName;
    private String subject;
    private double salary;

    // Constructor
    public Teacher(String teacherName, String subject, double salary) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.salary = salary;
    }

    // Getter and Setter for teacherName
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    // Getter and Setter for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

/* # Tester Class */

public class Tester {
    public static void main(String[] args) {
        // Creating 4 Teacher objects
        Teacher t1 = new Teacher("Alice", "Math", 50000);
        Teacher t2 = new Teacher("Bob", "Science", 55000);
        Teacher t3 = new Teacher("Carol", "English", 52000);
        Teacher t4 = new Teacher("David", "Computer Science", 60000);

        // Storing them in an array
        Teacher[] teachers = {t1, t2, t3, t4};

        // Displaying the details
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getTeacherName());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println("Salary: " + teacher.getSalary());
            System.out.println("------------------------");
        }
    }
}


 
