public class Order {
	// Instance variables
    int orderId;
    String orderedFoods;
    double totalPrice;
    String status;

    // Default constructor
    public Order() {
        status = "Ordered";
    }

    // Parameterized constructor
    public Order(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered";
    }

    // Method to calculate total price with 5% service charge
    public double calculateTotalPrice(int unitPrice) {
        totalPrice = unitPrice + (0.05 * unitPrice);
        return totalPrice;
    }

}

/* # Tester Class */
public class Tester {
	public static void main(String[] args) {
        // Object created with default constructor
        Order order1 = new Order();
        System.out.println("Status of order 1: " + order1.status);

        // Object created with parameterized constructor
        Order order2 = new Order(1001, "Garlic Shrimp");
        System.out.println("Status of order 2: " + order2.status);
        System.out.println("Id of order 2: " + order2.orderId);
        System.out.println("Items ordered in order 2: " + order2.orderedFoods);
    }

}
