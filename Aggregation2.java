/*
 * You have already created the Customer class in the SwiftFood project. 
 * The address instance variable is of type String but address itself can be represented as a 
 * combination of doorNo, street, city and zipCode. 

So, create an Address class based on the class diagram given below and make necessary 
changes to the Customer class.
 */

/* # Address Class */
public class Address {
    private String doorNo;
    private String street;
    private String city;
    private int zipcode;

    public Address(String doorNo, String street, String city, int zipcode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}

/* # Customer Class */
public class Customer {
    private String customerId;
    private String customerName;
    private long contactNumber;
    private Address address;  // updated from String to Address

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
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Contact Number: " + contactNumber);
        if (address != null) {
            System.out.println("Address: " + address.getDoorNo() + ", " +
                               address.getStreet() + ", " +
                               address.getCity() + " - " +
                               address.getZipcode());
        } else {
            System.out.println("Address: Not provided");
        }
    }

    public double payBill(double totalPrice) {
        return totalPrice;
    }
}

/* # Tester Class */
public class Tester {
    public static void main(String[] args) {
        // Create Address object
        Address address = new Address("12B", "MG Road", "Bangalore", 560001);

        // Create Customer object using full constructor
        Customer customer = new Customer("C1001", "Rahul Sharma", 9876543210L, address);

        // Display customer details
        customer.displayCustomerDetails();

        // Simulate bill payment
        double amount = customer.payBill(1500.75);
        System.out.println("Amount to be paid: ₹" + amount);
    }
}
