/*
 * An e-commerce company wants to start a payment service application for allowing payments 
 * using debit card and credit card. You need to help them in creating the application 
 * by implementing the classes based on the class diagram and description given below.

Method Description:-
- Payment
# Payment(int customerId)
* Initialize the customerId instance variable with the value passed to the constructor
* Implement the getter and setter methods appropriately. 

- DebitCardPayment
# DebitCardPayment(int customerId)
* Initialize the customerId instance variable with the value passed to the constructor.
* Generate the paymentId using the static variable counter. The value of paymentId should 
* start from 'D1000' and the numerical part should be incremented by 1 for the subsequent values. 
* Initialize the counter in static block.
# payBill(double amount) 
* Initialize the serviceTaxPercentage instance variable based on the details given below and 
* calculate the service tax amount.
* Initialize the discountPercentage instance variable based on the details given below and 
* calculate the discount amount.
* Calculate and return the final bill amount.
* Implement the getter and setter methods appropriately. 

- CreditCardPayment
# CreditCardPayment(int customerId)
* Initialize the customerId instance variable with the value passed to the constructor.
* Generate the paymentId using the static variable counter. The value of paymentId should 
* start from 'C1000' and the numerical part should be incremented by 1 for the subsequent values. 
* Initialize the counter in static block.
# payBill(double amount) 
* Initialize the serviceTaxPercentage instance variable based on the details given below and 
* calculate the service tax amount.
* Calculate and return the final bill amount.
* Implement the getter and setter methods appropriately. 

Test the functionalities using the provided Tester class.
 */

abstract class Payment
{
	private int customerId;
	protected String paymentId;
	protected double serviceTaxPercentage;
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	public String getPaymentId() 
	{
		return paymentId;
	}
	public void setPaymentId(String paymentId) 
	{
		this.paymentId = paymentId;
	}
	public double getServiceTaxPercentage() 
	{
		return serviceTaxPercentage;
	}
	public void setServiceTaxPercentage(double serviceTaxPercentage) 
	{
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	public Payment(int customerId) 
	{
		this.customerId=customerId;
	}
	public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment
{
	private static int counter=1000;
	private double discountPercentage;
	public DebitCardPayment(int customerId) 
	{
		super(customerId);
		paymentId="D"+ ++counter;
		this.setPaymentId(paymentId);
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double payBill(double amount) {
		double tax,discount,bill=0.0;
		if(amount<=500) {
			double serviceTaxPercentage=2.5;
			this.setServiceTaxPercentage(serviceTaxPercentage);
			discountPercentage=1;
			discount=(amount*discountPercentage)/100;
			tax=amount+(amount*serviceTaxPercentage/100);
			bill=tax-discount;
		}
		else if(amount>500 && amount<=1000) {
			double serviceTaxPercentage=4;
			this.setServiceTaxPercentage(serviceTaxPercentage);
			discountPercentage=2;
			discount=(amount*discountPercentage)/100;
			tax=amount+(amount*serviceTaxPercentage/100);
			bill=tax-discount;
		}
		else if(amount>1000) {
			double serviceTaxPercentage=5;
			this.setServiceTaxPercentage(serviceTaxPercentage);
			discountPercentage=3;
			discount=(amount*discountPercentage)/100;
			tax=amount+(amount*serviceTaxPercentage/100);
			bill=tax-discount;
		}
		return bill;
	}
}

class CreditCardPayment extends Payment {
	private static int counter = 1000;
	public CreditCardPayment(int customerId) {
		super(customerId);
		paymentId="C"+ ++counter;
		this.setPaymentId(paymentId);
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	public double payBill(double amount) {
		double total = 0.0;
		if(amount<=500) {
			double serviceTaxPercentage=3;
			this.setServiceTaxPercentage(serviceTaxPercentage);
			total=amount+(amount*serviceTaxPercentage/100);
		}
		else if(amount>500 && amount<=1000) {
			double serviceTaxPercentage=5;
			this.setServiceTaxPercentage(serviceTaxPercentage);
			total=amount+(amount*serviceTaxPercentage/100);
		}
		else if(amount>1000) {
			double serviceTaxPercentage=6;
			this.setServiceTaxPercentage(serviceTaxPercentage);
			total=amount+(amount*serviceTaxPercentage/100);
		}
		return total;
	}
}
/* # Tester Class */
class Tester{
    public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
    }
}
