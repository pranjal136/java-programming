/*
 * Change the private variables to public and then default and observe the output.
 */

public class Customer {
	/*private String customerId;  // cannot be accessed in tester class without getter setter method.
	private String customerName;
	private long contactNumber;
	private String address; */
	
	/*String customerId;  // can be accessed directly in another class by making object
	String customerName;
	long contactNumber;
	String address; */
	
	public String customerId; // can be accessed in another class 
	public String customerName;
	public long contactNumber;
	public String address;
	
}

/* # Tester Class */

public class Tester {
	public static void main(String args[]) {
		Customer customer = new Customer();
		customer.customerId = "C101";
		customer.customerName = "Jack";
		customer.contactNumber = 9870345687L;
		customer.address = "D089, St. Louis Street, Springfield";
		System.out.println("Displaying customer details");
		System.out.println("Customer Id : " + customer.customerId);
		System.out.println("Customer Name : " + customer.customerName);
		System.out.println("Contact Number : " + customer.contactNumber);
		System.out.println("Address : " + customer.address);
	}

}
