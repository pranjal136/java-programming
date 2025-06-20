/*
 * A dance club is conducting auditions to admit interested candidates. 
 * You need to implement a Participant class for the dance club based on the 
 * class diagram and description given below.
Method Description :- 

- Partcipant(String name, long contactNumber, String city)
* Initialize the name, contactNumber and city instance variables appropriately 
* with the values passed to the constructor.
* Generate the registrationId using the static variable counter. 
* The value of registrationId should start from 'D10001' and the numerical part should be 
* incremented by 1 for the subsequent values. Initialize the counter in static block.
* Implement the appropriate getter and setter methods.

Test the functionalities using the provided Tester class. Create two or more Participant 
objects and validate that the values of the member variables are proper.
 */

class Participant {
    //Implement your code here
    // Private static counter for generating registrationId
    private static int counter;
    
    // Instance variables
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;

    // Static block to initialize counter
    static {
        counter = 10001;
    }

    // Constructor
    public Participant(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
        this.registrationId = "D" + counter;
        counter++;
    }

    // Getter for registrationId
    public String getRegistrationId() {
        return registrationId;
    }

    // Static getter and setter for counter
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Participant.counter = counter;
    }

    // Getters and setters for other attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

/* # Tester Class */
class Tester {

	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		Participant participant3 = new Participant("John", 9876543210L, "Chicago");
		
		Participant[] participants = { participant1, participant2, participant3 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}
} 
