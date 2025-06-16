/*
 * Anchor College offers both graduate and postgraduate programs. 
 * The college stores the names of the students, their test scores and the final result for each student. 
 * Each student has to take 4 tests in total. You need to create an application for the 
 * college by implementing the classes based on the class diagram and description given below.

Method Description:- 

- Student
# Student(String studentName)
* Initialize the instance variable studentName with the value passed to the constructor 
* and other instance variables to the default values.
# setTestScore(int testNumber, int testScore)
* Set the value of the testScore in the appropriate position of testScores array based on the testNumber.
* Implement the getter and setter methods appropriately.

- UndergraduateStudent
# UndergraduateStudent(String studentName)
* Initialize the instance variable studentName with the value passed to the constructor 
* and other instance variables to the default values.
# generateResult()
* Implement the abstract method of Student class by setting the value of testResult based on the below details.                                                                                                                                                                              
 
- GraduateStudent
# GraduateStudent(String studentName)
* Initialize the instance variable studentName with the value passed to the constructor 
* and other instance variables to the default values.
# generateResult()
* Implement the abstract method of Student class by setting the value of testResult based on the below details.                                                                                                                                                                             
 
Test the functionalities using the provided Tester class.
 */
abstract class Student{
    //Implement your code here
    private String studentName;
    private int[] testScores;
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
        testScores = new int[4]; // 4 tests
    }
    abstract public void generateResult();

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getTestScores() {
        return testScores;
    }
    public void setTestScore(int testNumber, int testScore){
        this.testScores[testNumber] = testScore;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}

class UndergraduateStudent extends Student{
    //Implment your code here
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    public void generateResult() {
        int[] testScores = super.getTestScores();
        int total = 0;
        for (int i=0;i<testScores.length; i++) {
            total += testScores[i];
        }
        double average = total / testScores.length;
        if (average >= 60) {
            super.setTestResult("Pass");
        } else if(average < 60) {
            super.setTestResult("Fail");
        }
    }
}

class GraduateStudent extends Student{
    //Implment your code here
    public GraduateStudent(String studentName) {
        super(studentName);
    }

    public void generateResult() {
        int[] testScores = super.getTestScores();
        int total = 0;
        for (int i=0;i<testScores.length;i++) {
            total += testScores[i];
        }
        double average = total / testScores.length;
        if (average >= 70) {
            super.setTestResult("Pass");
        } else if(average < 70) {
            super.setTestResult("Fail");
        }
    }
}
/* # Tester Class */
class Tester {

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
        UndergraduateStudent ug2 = new UndergraduateStudent("Alice");
        ug2.setTestScore(0, 45);
        ug2.setTestScore(1, 50);
        ug2.setTestScore(2, 55);
        ug2.setTestScore(3, 49);
        ug2.generateResult();
        System.out.println("\nStudent name: " + ug2.getStudentName());
        System.out.println("Result: " + ug2.getTestResult());
    }
}
