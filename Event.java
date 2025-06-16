/*
* A college cultural event "Show Your Talent" is being conducted and the organizing committee 
 * has decided to open online registration for the same. The students can participate in 
 * solo events as well as team events. You need to develop an application for the 
 * online registration by implementing the classes based on the class diagram and description given below.

Method Description:-
- Event 
# Event(String eventName, String participantName)
* Initialize the instance variables eventName and participantName using the values passed to the constructor.
# registerEvent()
* Register participants for the event by setting the registrationFee with the help of the below table.
* For any invalid event, set the registrationFee to 0.
* Implement the appropriate getter and setter methods.

- SoloEvent
# SoloEvent(String eventName, String participantName, int participantNo)
* Initialize the instance variables eventName, participantName and participantNo using the 
* values passed to the constructor.
# registerEvent()
* Register participants for the event by setting the registrationFee with the help of the parent class method.
* Implement the appropriate getter and setter methods.

- TeamEvent
# TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo)
* Initialize the instance variables eventName, participantName, noOfParticipants and teamNo 
* using the values passed to the constructor.
# registerEvent()
* Register participants for the event by setting the registrationFee with the help of the below table. 
* The fee given in the table is for each member. The registrationFee should be calculated by 
* considering the number of members in the team.
* For any invalid event, set the registrationFee to 0.
* Implement the appropriate getter and setter methods.

Test the functionalities using the provided Tester class.
*/
class Event{
    //Implement your code here
    private String eventName;
    private String participantName;
    private double registrationFee;

    public Event(String eventName, String participantName) {
        this.eventName = eventName;
        this.participantName = participantName;
    }
    public void registerEvent() {
        if (this.getEventName().equals("Singing")) {
            this.setRegistrationFee(8);
        } 
        else if (this.getEventName().equals("Dancing")) {
           this.setRegistrationFee(10);
        } 
        else if (this.getEventName().equals("DigitalArt")) {
            this.setRegistrationFee(12);
        } 
        else if (this.getEventName().equals("Acting")) {
            this.setRegistrationFee(15);
        }    
        else {
            this.setRegistrationFee(0); // Invalid event
        }
    }
    
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }
}

class SoloEvent extends Event{
    //Implement your code here
    private int participantNo;

    public SoloEvent(String eventName, String participantName, int participantNo) {
        super(eventName, participantName);
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        super.registerEvent();
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }
    
}

class TeamEvent extends Event{
    //Implement your code here
    private int noOfParticipants;
    private int teamNo;

    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
        super(eventName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    @Override
    public void registerEvent() {
        double fee = 0;
        if(this.getNoOfParticipants()>1){
            if (this.getEventName().equals("Singing")) {
                fee = (double)(this.getNoOfParticipants()*4);
                this.setRegistrationFee(fee);
            }
            else if(this.getEventName().equals("Dancing")){
                fee = (double)(this.getNoOfParticipants()*6);
                this.setRegistrationFee(fee);
            }
            else if(this.getEventName().equals("DigitalArt")){
                fee = (double)(this.getNoOfParticipants()*8);
                this.setRegistrationFee(fee);
            }
            else if(this.getEventName().equals("Acting")){
                fee = (double)(this.getNoOfParticipants()*10);
                this.setRegistrationFee(fee);
            }
            else{
                this.setRegistrationFee(0);
            }
        }
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
}
/* # Tester Class */
class Tester {

      public static void main(String[] args) {
            
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}
