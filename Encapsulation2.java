/*
 * You have already created the Order and Food classes in the SwiftFood project. 

Make necessary changes to the Order and Food classes by making all the instance 
variables private and adding getter and setter methods for the instance variables.
 */

public class Order {
	    // Private instance variables
	    private int orderId;
	    private String orderedFoods;
	    private double totalPrice;
	    private String status;

	    // Default constructor
	    public Order() {
	        this.status = "Ordered";
	    }

	    // Parameterized constructor
	    public Order(int orderId, String orderedFoods) {
	        this.orderId = orderId;
	        this.orderedFoods = orderedFoods;
	        this.status = "Ordered";
	    }

	    // Getter and Setter methods
	    public int getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }

	    public String getOrderedFoods() {
	        return orderedFoods;
	    }

	    public void setOrderedFoods(String orderedFoods) {
	        this.orderedFoods = orderedFoods;
	    }

	    public double getTotalPrice() {
	        return totalPrice;
	    }

	    public void setTotalPrice(double totalPrice) {
	        this.totalPrice = totalPrice;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    // Method to calculate total price
	    public double calculateTotalPrice(int unitPrice) {
	        totalPrice = unitPrice + (0.05 * unitPrice);
	        return totalPrice;
	    }
}

/* # Tester Class */

public class Tester {
	public static void main(String[] args) {
        // Create Order object
        Order order = new Order();

        // Initialize instance variables
        order.setOrderId(101);
        order.setOrderedFoods("Spinach Alfredo Pasta");
        order.setStatus("Ordered");
        order.calculateTotalPrice(120);

        System.out.println("Order 1 Details:");
        System.out.println("Order Id: " + order.getOrderId());
        System.out.println("Ordered Food: " + order.getOrderedFoods());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println();

        // Create Order object using parameterized constructor
        Order order2 = new Order(2002, "Garlic Shrimp");
        order2.calculateTotalPrice(250);

        System.out.println("Order 2 Details:");
        System.out.println("Order Id: " + order2.getOrderId());
        System.out.println("Ordered Food: " + order2.getOrderedFoods());
        System.out.println("Order Status: " + order2.getStatus());
        System.out.println("Total Price: " + order2.getTotalPrice());
    }
}

