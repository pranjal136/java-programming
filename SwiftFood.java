/*
 * You have already created the Customer and Order classes in the SwiftFood project. 
 * Modify the Customer and Order classes based on the class diagram given below.
 
| **Attributes**  |         |
| --------------- | ------- |
| - customerId    | String  |
| - customerName  | String  |
| - contactNumber | long    |
| - address       | Address |
| **Constructors & Methods**                                                                  | **Return Type** |
| ------------------------------------------------------------------------------------------- | --------------- |
| + Customer()                                                                                |                 |
| + Customer(customerId: String, customerName: String, contactNumber: long, address: Address) |                 |
| + Customer(customerName: String, contactNumber: long, address: Address)                     |                 |
| + getCustomerId()                                                                           | String          |
| + setCustomerId(customerId: String)                                                         | void            |
| + getCustomerName()                                                                         | String          |
| + setCustomerName(customerName: String)                                                     | void            |
| + getContactNumber()                                                                        | long            |
| + setContactNumber(contactNumber: long)                                                     | void            |
| + getAddress()                                                                              | Address         |
| + setAddress(address: Address)                                                              | void            |
| + displayCustomerDetails()                                                                  | void            |
| + payBill(totalPrice: double)                                                               | double          |

 */

public class Customer {
	    private String customerId;
	    private String customerName;
	    private long contactNumber;
	    private Address address;

	    public Customer() {}

	    public Customer(String customerId, String customerName, long contactNumber, Address address) {
	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.contactNumber = contactNumber;
	        this.address = address;
	    }

	    public Customer(String customerName, long contactNumber, Address address) {
	        this.customerName = customerName;
	        this.contactNumber = contactNumber;
	        this.address = address;
	    }

	    public String getCustomerId() {
	        return customerId;
	    }

	    public void setCustomerId(String customerId) {
	        this.customerId = customerId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public long getContactNumber() {
	        return contactNumber;
	    }

	    public void setContactNumber(long contactNumber) {
	        this.contactNumber = contactNumber;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public void displayCustomerDetails() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Contact Number: " + contactNumber);
	        System.out.println("Address: " + address.getFullAddress());
	    }

	    public double payBill(double totalPrice) {
	        return totalPrice;
	    }
}

/* # Order Class */
/*
| **Attributes**   |          |
| ---------------- | -------- |
| - orderIdCounter | int      |
| - orderId        | int      |
| - customer       | Customer |
| - orderedFoods   | Food\[]  |
| - totalPrice     | double   |
| - status         | String   |
| **Constructors & Methods**                         | **Return Type** |
| -------------------------------------------------- | --------------- |
| + Order()                                          |                 |
| + Order(orderedFoods: Food\[], customer: Customer) |                 |
| + getTotalNoOfOrders()                             | int             |
| + getOrderId()                                     | int             |
| + setOrderId(orderId: int)                         | void            |
| + getCustomer()                                    | Customer        |
| + setCustomer(customer: Customer)                  | void            |
| + getOrderedFoods()                                | Food\[]         |
| + setOrderedFoods(orderedFoods: Food\[])           | void            |
| + getTotalPrice()                                  | double          |
| + setTotalPrice(totalPrice: double)                | void            |
| + getStatus()                                      | String          |
| + setStatus(status: String)                        | void            |
| + calculateTotalPrice(paymentMode: String)         | double          |

 */

public class Order {
	    private static int orderIdCounter;
	    private int orderId;
	    private Customer customer;
	    private Food[] orderedFoods;
	    private double totalPrice;
	    private String status;

	    static {
	        orderIdCounter = 100; // starting order id
	    }

	    public Order() {
	        this.orderId = ++orderIdCounter;
	    }

	    public Order(Food[] orderedFoods, Customer customer) {
	        this.orderId = ++orderIdCounter;
	        this.orderedFoods = orderedFoods;
	        this.customer = customer;
	    }

	    public static int getTotalNoOfOrders() {
	        return orderIdCounter - 100;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }

	    public Food[] getOrderedFoods() {
	        return orderedFoods;
	    }

	    public void setOrderedFoods(Food[] orderedFoods) {
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

	    public double calculateTotalPrice(String paymentMode) {
	        double sum = 0;
	        for (Food food : orderedFoods) {
	            sum += food.getPrice();
	        }

	        if (paymentMode.equalsIgnoreCase("Online")) {
	            sum *= 0.95; // 5% discount
	        }

	        this.totalPrice = sum;
	        return totalPrice;
	    }

}

/* # Food Class */
public class Food {
	    private String name;
	    private double price;

	    public Food(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

}

/* # Address Class */
public class Address {
	private String doorNo;
    private String street;
    private String city;
    private String zipCode;

    public Address(String doorNo, String street, String city, String zipCode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return doorNo + ", " + street + ", " + city + " - " + zipCode;
    }

}

/* # Tester Class */
public class Tester {
	public static void main(String[] args) {
        // Step 1: Create Address
        Address address = new Address("12A", "Main Street", "Bangalore", "560001");

        // Step 2: Create Customer
        Customer customer = new Customer("C101", "Ravi Kumar", 9876543210L, address);

        // Step 3: Create Food items
        Food[] foods = new Food[2];
        foods[0] = new Food("Pizza", 250);
        foods[1] = new Food("Pasta", 180);

        // Step 4: Create Order
        Order order = new Order(foods, customer);
        order.setStatus("Placed");

        // Step 5: Calculate total price
        double total = order.calculateTotalPrice("Online"); // Apply 5% discount
        order.setTotalPrice(total);

        // Step 6: Display customer details
        customer.displayCustomerDetails();

        // Step 7: Display order details
        System.out.println("\nOrder ID: " + order.getOrderId());
        System.out.println("Status: " + order.getStatus());
        System.out.println("Total Price (after discount if any): " + total);

        // Step 8: Payment simulation
        double amountPaid = customer.payBill(total);
        System.out.println("Amount Paid: " + amountPaid);
        
        // Step 9: Display total number of orders
        System.out.println("Total Orders Placed: " + Order.getTotalNoOfOrders());
    }

}
