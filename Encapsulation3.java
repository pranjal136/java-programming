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

	    // Display details
	    public void displayFoodDetails() {
	        System.out.println("Food Name: " + foodName);
	        System.out.println("Cuisine: " + cuisine);
	        System.out.println("Food Type: " + foodType);
	        System.out.println("Quantity Available: " + quantityAvailable);
	        System.out.println("Unit Price: ₹" + unitPrice);
	    }
}

/* # Tester Class */


public class Tester2 {
	    public static void main(String[] args) {
	        // Create a Food object using constructor
	        Food food1 = new Food("Paneer Butter Masala", "Indian", "Vegetarian", 15, 180.00);

	        // Display initial food details
	        System.out.println("----- Food Details (Initial) -----");
	        food1.displayFoodDetails();
	        
	        Food food2 = new Food("Chicken Biryani", "Indian", "Non-Vegetarian", 5, 220.00);
	        System.out.println("\n---- Food Item 2 ----");
	        food2.displayFoodDetails();
	        
	        // Update and re-display
	        food1.setQuantityAvailable(12);
	        System.out.println("\nUpdated Quantity for Food Item 1:");
	        food1.displayFoodDetails();


	        // Modify the values using setter methods
	       /* food1.setFoodName("Butter Chicken");
	        food1.setCuisine("Mughlai");
	        food1.setFoodType("Non-Vegetarian");
	        food1.setQuantityAvailable(10);
	        food1.setUnitPrice(220.50);

	        // Display modified food details
	        System.out.println("\n----- Food Details (After Modification) -----");
	        food1.displayFoodDetails(); 

	        // Access values using getter methods
	        System.out.println("\n----- Accessing Individual Fields Using Getters -----");
	        System.out.println("Food Name: " + food1.getFoodName());
	        System.out.println("Cuisine: " + food1.getCuisine());
	        System.out.println("Food Type: " + food1.getFoodType());
	        System.out.println("Quantity Available: " + food1.getQuantityAvailable());
	        System.out.println("Unit Price: ₹" + food1.getUnitPrice()); */
	    } 
}
