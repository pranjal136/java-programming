/*
When two classes are related to each other by aggregation, reference of one class becomes a member of the other class and 
we can access the members of the aggregated class but what about the private members of the class. 
Try the below code to understand how this works.
*/

class Subject {
	private String subjectName;

	Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	
	// Getter for subjectName
	public String getSubjectName() {
		return subjectName;
	}
	
	// Setter (optional, in case you want to change the subject name later)
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}

class Student {
	private int rollNo;
	private String studentName;
	private Subject subject;

	Student(int rollNo, String studentName, Subject subject) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.subject = subject;
	}

	public void displayDetails() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Subject Name: " + subject.subjectName);

		// We cannot directly access the private member of the class Subject
		// To access the private members of aggregated class, we will have to
		// make use of the getter and setter methods

		// Add the getter and setter methods to class Subject and modify the
		// displayDetails method accordingly

	}

	public static void main(String args[]) {
		Subject subject = new Subject("Maths");
		Student student = new Student(101, "Nate", subject);
		student.displayDetails();
	}
}
