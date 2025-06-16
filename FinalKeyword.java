/*
 * An educational institution provides stipends for post-graduate students every year. 
 * For calculating the stipend, the institution has fixed a base amount of $100 
 * which is provided to all the students. The students who perform exceptionally well 
 * during the academics get an extra amount based on their performance.
You need to help the institution in developing an application for calculating 
the stipend by implementing the class based on the class diagram and description given below.

Method Description:- 

- calculateTotalStipend()
* Calculate and return the total stipend amount based on the aggregate marks of the student 
* using the below table.                                                                                                                                                     
| Aggregate Marks Range | Bonus Stipend Amount |
| --------------------- | -------------------- |
| **≥ 85 and < 90**     | **\$10**             |
| **≥ 90 and < 95**     | **\$15**             |
| **≥ 95 and ≤ 100**    | **\$20**             |

Note: STIPEND is a final variable.
Implement the getter and setter methods appropriately.
Test the functionalities using the provided Tester class. 
 */

class Student{
    //Implement your code here
    private final int STIPEND = 100; // Fixed base stipend
    private int studentId;
    private int aggregateMarks;

    // Getter for STIPEND
    public int getSTIPEND() {
        return STIPEND;
    }

    // Getter and setter for studentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter and setter for aggregateMarks
    public int getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    // Calculate total stipend
    public double calculateTotalStipend() {
        int bonus = 0;
        if (aggregateMarks >= 85 && aggregateMarks < 90) {
            bonus = 10;
        } else if (aggregateMarks >= 90 && aggregateMarks < 95) {
            bonus = 15;
        } else if (aggregateMarks >= 95 && aggregateMarks <= 100) {
            bonus = 20;
        }
        return STIPEND + bonus;
    }
}
/* Tester Class */
class Tester {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}

}
