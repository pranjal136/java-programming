/*
 * Create a new class Food in the Java project SwiftFood with the details given below.
foodName: String
cuisine: String
foodType: String
quantityAvailable: int
unitPrice: double

Test the functionalities using the Tester class.
 */

public class Food {
	    private String foodName;
	    private String cuisine;
	    private String foodType;
	    private int quantityAvailable;
	    private double unitPrice;

	    // Constructor
	    public Food(String foodName, String cuisine, String foodType, int quantityAvailable, double unitPrice) {
	        this.foodName = foodName;
	        this.cuisine = cuisine;
	        this.foodType = foodType;
	        this.quantityAvailable = quantityAvailable;
	        this.unitPrice = unitPrice;
	    }

	    // Getters
	    public String getFoodName() {
	        return foodName;
	    }

	    public String getCuisine() {
	        return cuisine;
	    }

	    public String getFoodType() {
	        return foodType;
	    }

	    public int getQuantityAvailable() {
	        return quantityAvailable;
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    // Setters
	    public void setFoodName(String foodName) {
	        this.foodName = foodName;
	    }

	    public void setCuisine(String cuisine) {
	        this.cuisine = cuisine;
	    }

	    public void setFoodType(String foodType) {
	        this.foodType = foodType;
	    }

	    public void setQuantityAvailable(int quantityAvailable) {
	        this.quantityAvailable = quantityAvailable;
	    }

	    public void setUnitPrice(double unitPrice) {
	        this.unitPrice = unitPrice;
	    }

	    // Method to display food details
	    public void displayFoodDetails() {
	        System.out.println("Food Name: " + foodName);
	        System.out.println("Cuisine: " + cuisine);
	        System.out.println("Food Type: " + foodType);
	        System.out.println("Quantity Available: " + quantityAvailable);
	        System.out.println("Unit Price: $" + unitPrice);
	    }
}

# Tester Class
public class Tester {
	public static void main(String[] args) {
        // Creating a Food object
        Food food1 = new Food("Paneer Tikka", "Indian", "Vegetarian", 10, 150.00);
        Food food2 = new Food("Chicken Biryani", "Indian", "Non-Vegetarian", 5, 220.00);

        // Displaying food details
        System.out.println("---- Food Item 1 ----");
        food1.displayFoodDetails();

        System.out.println("\n---- Food Item 2 ----");
        food2.displayFoodDetails();

        // Update and re-display
        food1.setQuantityAvailable(12);
        System.out.println("\nUpdated Quantity for Food Item 1:");
        food1.displayFoodDetails();
    }

}
