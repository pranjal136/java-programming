public class Restaurant {
	// Instance variables
    String restaurantName;
    long restaurantContact;
    String restaurantAddress;
    float rating;

    // Constructor as per the diagram
    public Restaurant(String name, long restaurantContact, String restaurantAddress, float rating) {
        this.restaurantName = name;
        this.restaurantContact = restaurantContact;
        this.restaurantAddress = restaurantAddress;
        this.rating = rating;
    }

    // Method to display restaurant details
    public void displayRestaurantDetails() {
        System.out.println("Restaurant Details");
        System.out.println("******************");
        System.out.println("Restaurant Name : " + restaurantName);
        System.out.println("Restaurant Rating : " + rating);
        System.out.println("Restaurant Contact : " + restaurantContact);
        System.out.println("Restaurant Address : " + restaurantAddress);
    }

}

/* # Tester Class */
public class Tester {
	public static void main(String[] args) {
        // Creating object using the constructor
        Restaurant restaurant = new Restaurant(
            "McDonald's",
            9988676767L,
            "SH1109, Carolina Street, Springfield",
            4.1f
        );

        // Calling method to display details
        restaurant.displayRestaurantDetails();
    }

}

