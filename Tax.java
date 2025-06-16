/*
* An e-commerce company has made it mandatory for all the customers to pay tax on 
 * every purchase and also for all the sellers to pay a certain amount of tax 
 * based on their location. You need to help the e-commerce company by implementing an 
 * application for paying tax based on the class diagram and description given below.

Method Description:-

- PurchaseDetails
# Purchase(String purchaseId, String paymentType)
* Initialize the purchaseId and paymentType instance variables using the values passed to the constructor.
# calculateTax(double price) 
* Initialize the value of the taxPercentage instance variable based on the details given below.
Calculate and return the total amount (including the tax amount) that needs to be paid.
Implement the getter and setter methods appropriately.

- Seller
# Seller(String location)
* Initialize the location instance variable using the value passed to the constructor.
# calculateTax(double price) 
* Initialize the value of taxPercentage instance variable based on the details given below.
Calculate and return the tax amount that needs to be paid.
Implement the getter and setter methods appropriately.

Test the functionalities using the provided Tester class.
*/
interface Tax{
    //Implement your code here
    double calculateTax(double price);
}

class PurchaseDetails implements Tax{
    //Implement your code here
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    
    public PurchaseDetails(String purchaseId, String paymentType) {
        this.purchaseId = purchaseId;
        this.paymentType = paymentType;
    }

    public double calculateTax(double price) {
        double total = 0;
        if (this.paymentType.equals("Debit Card")) {
            total = price+(price*0.02);
            this.setTaxPercentage(2);
        } 
        else if (this.paymentType.equals("Credit Card")) {
            total = price+(price*0.03);
            this.setTaxPercentage(3);
        } 
        else {
            total = price+(price*0.04);
            this.setTaxPercentage(4);
        }

        return total;
    }
}

class Seller implements Tax{
    //Implement your code here
    private String location;
    private double taxPercentage;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    
    public Seller(String location) {
        this.location = location;
    }
    
    public double calculateTax(double price) {
        double tax = 0;
        if(this.location.equals("Middle east")) {
            tax=price*0.15;
            this.setTaxPercentage(15);
        }
        else if(this.location.equals("Europe")) {
            tax=price*0.25;
            this.setTaxPercentage(25);
        }
        else if(this.location.equals("Canada")) {
            tax=price*0.22;
            this.setTaxPercentage(22);
        }
        else if(this.location.equals("Japan")) {
            tax=price*0.12;
            this.setTaxPercentage(12);
        }
        return tax;
    }
}
/* # Tester Class */
class Tester{
    public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
	}
}
