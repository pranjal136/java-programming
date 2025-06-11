/*
Implement the class MovieTicket with the instance variables and methods mentioned below.
Method Description
* MovieTicket (int movieId, int noOfSeats)
* Initialize the member variables movieId and noOfSeats appropriately with the values passed to the constructor.
calculateTotalAmount()

Calculate the total amount to be paid based on the costPerTicket and noOfSeats by applying a 2% tax on the total amount.

The costPerTicket for the movies are provided in the below table. Set the value of costPerTicket instance variable appropriately.
111 - $ 7
112 - $ 8
113 - $ 8.5

Note: Return the total amount calculated after rounding off using the Math.round(double a) method.     
Test the functionalities using the provided Tester class.  
*/
public class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
        setCostPerTicketByMovieId(movieId);
    }

    private void setCostPerTicketByMovieId(int movieId) {
        if (movieId == 111)
            this.costPerTicket = 7.0;
        else if (movieId == 112)
            this.costPerTicket = 8.0;
        else if (movieId == 113)
            this.costPerTicket = 8.5;
        else
            this.costPerTicket = 0.0;
    }

    public double calculateTotalAmount() {
        if (costPerTicket == 0.0 || noOfSeats <= 0)
            return 0;

        double total = noOfSeats * costPerTicket;
        total += total * 0.02; // Add 2% tax
        return Math.round(total);
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
        setCostPerTicketByMovieId(movieId); // Update ticket cost
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
}


public class Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}
