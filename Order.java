public class Order {
	    // Instance variables
	    int orderId;
	    String orderedFoods;
	    double totalPrice;
	    String status;

	    // Method to calculate total price with 5% service charge
	    public double calculateTotalPrice(int unitPrice) {
	        totalPrice = unitPrice + (0.05 * unitPrice);  // Apply 5% service charge
	        return totalPrice;
	    }
}
/* Tester Class */
public class OrderTester {
	public static void main(String[] args) {
        // Create Order object
        Order order = new Order();

        // Initialize instance variables
        order.orderId = 101;
        order.orderedFoods = "Spinach Alfredo Pasta";
        order.status = "Ordered";

        // Calculate total price
        int unitPrice = 33;  // Example base price
        order.calculateTotalPrice(unitPrice);

        // Display order details
        System.out.println("Order Details");
        System.out.println("Order Id: " + order.orderId);
        System.out.println("Ordered Food: " + order.orderedFoods);
        System.out.println("Order Status: " + order.status);
        System.out.println("Total Price: " + order.totalPrice);
    }

}
