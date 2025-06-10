public class ThisCustomer {
	    private String customerId;
	    private String customerName;
	    private long contactNumber;
	    private String address;

	    // Constructor for registered customers
	    public ThisCustomer(String customerId, String customerName, long contactNumber, String address) {
	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.contactNumber = contactNumber;
	        this.address = address;
	    }

	    // Constructor for non-registered customers (no customerId)
	    public ThisCustomer(String customerName, long contactNumber, String address) {
	        this.customerName = customerName;
	        this.contactNumber = contactNumber;
	        this.address = address;
	        this.customerId = null; // Explicitly setting to null
	    }

	    public void displayCustomerDetails() {
	        System.out.println("Displaying customer details");
	        System.out.println("Customer Id : " + customerId);
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Contact Number : " + contactNumber);
	        System.out.println("Address : " + address);
	    }
}
/* # Tester class */
public class ThisTester {
	    public static void main(String[] args) {
	        // Creating a non-registered customer (no ID)
	        ThisCustomer customer = new ThisCustomer("Jacob", 5648394590L, "13th Street, New York");

	        // Displaying customer details
	        customer.displayCustomerDetails();
	    }
	    
}
