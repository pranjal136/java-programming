/*
 * Jumbo Bus Service provides bus services from New York to various cities 
 * based on different kinds of packages. They want to ensure that appropriate messages are 
 * displayed for users while booking buses. You need to help the Jumbo Bus Service 
 * by developing an application based on the class diagram and description given below.
Method Description

# BusBooking(int bookingId, String destination, String tripPackage)
* Initialize the bookingId, destination and tripPackage instance variables with 
* the values passed to the constructor and initialize the totalAmount instance variable to 0.
# validateCouponCode(String couponCode, int numberOfMembers)
* Validate the couponCode based on the table given below.                                                                                                                     
* If the couponCode is valid, return true, else throw InvalidCouponCodeException 
* with the message "Invalid coupon code".

# bookTrip(String couponCode, int numberOfMembers)
* Check if the destination is valid or not. The valid destinations are given below.                                                                                                                                                                                                                                  
* If the destination is not valid, throw InvalidDestinationException with the message "Invalid destination".
* Check if the tripPackage is either 'Regular' or 'Premium'.
* If the tripPackage is not valid, throw InvalidTripPackageException with the message "Invalid package".
* Check if the couponCode is valid or not by invoking the validateCouponCode() method.
* If all the values are valid, calculate and initialize the totalAmount 
* instance variable based on the table given below.                                                                                                                                                                                                                                    
* Return the message "Booking successful" in case of successful booking.                                          
* Handle all the exceptions and return appropriate messages.
* Implement the getter and setter methods appropriately. 
* Implement the required user defined exception classes.
* Test the functionalities using the provided Tester class.
 */

// Implement user defined exception classes 
class InvalidCouponCodeException extends Exception {
    public InvalidCouponCodeException(String message) {
        super(message);
    }
}

class InvalidDestinationException extends Exception {
    public InvalidDestinationException(String message) {
        super(message);
    }
}

class InvalidTripPackageException extends Exception {
    public InvalidTripPackageException(String message) {
        super(message);
    }
}


class BusBooking{
    //Implement your code here
    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    public BusBooking(int bookingId, String destination, String tripPackage) {
        this.bookingId = bookingId;
        this.destination = destination;
        this.tripPackage = tripPackage;
        this.totalAmount = 0;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripPackage() {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Validate coupon code
    public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException {
        if ((couponCode.equals("BIGBUS") && numberOfMembers >= 10) ||
            (couponCode.equals("MAGICBUS") && numberOfMembers >= 15)) {
            return true;
        } else {
            throw new InvalidCouponCodeException("Invalid coupon code");
        }
    }

    // Book trip
    public String bookTrip(String couponCode, int numberOfMembers) {
        try {
            // Validate destination
            String[] validDestinations = {"Washington DC", "Philadelphia", "Orlando", "Boston", "Atlanta"};
            boolean isValidDestination = false;
            for (String d : validDestinations) {
                if (d.equals(destination)) {
                    isValidDestination = true;
                    break;
                }
            }
            if (!isValidDestination) {
                throw new InvalidDestinationException("Invalid destination");
            }

            // Validate package
            if (!(tripPackage.equals("Regular") || tripPackage.equals("Premium"))) {
                throw new InvalidTripPackageException("Invalid package");
            }

            // Validate coupon
            if (validateCouponCode(couponCode, numberOfMembers)) {
                int pricePerMember = tripPackage.equals("Regular") ? 500 : 800;
                totalAmount = pricePerMember * numberOfMembers;
                return "Booking successful";
            }

        } catch (InvalidDestinationException | InvalidTripPackageException | InvalidCouponCodeException e) {
            return e.getMessage();
        }

        return "Booking failed";
    }
}
/* # Tester Class */
class Tester{
    public static void main(String[] args) {
		BusBooking booking = new BusBooking(101,"Orlando", "Regular");
		String result = booking.bookTrip("BIGBUS", 11);
		if(result.equals("Booking successful")){
			System.out.println(result);
			System.out.println("Total amount for the trip: " + booking.getTotalAmount());
		}
		else{
			System.out.println(result);
			System.out.println("Your booking was not successful, please try again!");
		}
	}
}
