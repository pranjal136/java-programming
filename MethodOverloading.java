/*
 * The Bill class is used to find the price of items for calculation. 
 * Implement a class Bill based on the class diagram and description given below.
The details of the items are given below.
Method Description

- findPrice(int itemId)
* Find and return the price based on the itemId using the table given above.
* If the itemId passed to method is invalid, return the price as 0.

- findPrice(String brandName, String itemType, int size)
* Find and return the price based on the brandName, itemType and size using the table given above.
* If any invalid details are passed to the method, return the price as 0.
Test the functionalities using the provided Tester class.
 */

class Bill{
    //Implement your code here
    
    public double findPrice(int itemId) {
        switch(itemId) {
            case 1001:
                return 25;
            case 1002:
                return 20;
            case 1003:
                return 23;
            case 1004:
                return 18;
            default:
                return 0;
        }
    }

    public double findPrice(String brandName, String itemType, int size) {
        if (brandName.equalsIgnoreCase("Puma")) {
            if (itemType.equalsIgnoreCase("T-shirt") && (size == 34 || size == 36)) {
                return 25;
            } else if (itemType.equalsIgnoreCase("Skirt") && (size == 38 || size == 40)) {
                return 20;
            }
        } else if (brandName.equalsIgnoreCase("Reebok")) {
            if (itemType.equalsIgnoreCase("T-shirt") && (size == 34 || size == 36)) {
                return 23;
            } else if (itemType.equalsIgnoreCase("Skirt") && (size == 38 || size == 40)) {
                return 18;
            }
        }
        return 0;
    }
}

/* # Tester Class */
class Tester {

	public static void main(String[] args) {
		
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}
	
}
