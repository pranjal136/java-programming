/*
 * Specific rules are followed by a company to set the product name, product Id and shipment tracker Id.
* You need to validate them using regular expressions as mentioned below in the Shipment class.
* Validate the product name in the checkProductNameValidity() method based on the below conditions.
* Product name should contain minimum 2 words and maximum 3 words separated by spaces
* The words in the product name should contain only alphabets
* Return true if the product name is valid, else return false.
* Validate the product Id in the checkProductIdValidity() method based on the below conditions.
* The length of the product Id should be between 2 and 20 (both inclusive)
* The product Id can be alphanumeric
* Return true if the product Id is valid, else return false.
* Validate the shipment tracker id in the checkTrackerIdValidity() method based on the below conditions.
* Shipment tracker Id should be in the below format
	<<1 upper case alphabet >>:<<4 upper case alphabets>>:<<3 lower case alphabets >>:<<2 digits>>
* Return true if the shipment tracker Id is valid, else return false.
Test the functionalities using the main method of the Tester class.
 */

class Shipment{
	
    public boolean checkProductNameValidity(String productName) {
	    //Implement your code here and change the return value accordingly
        // Regex: 2 or 3 words, each with only alphabets, separated by a single space
        String regex = "^([A-Za-z]+\\s){1,2}[A-Za-z]+$";
        return productName.matches(regex);
	}
	
	public boolean checkProductIdValidity(String productId) {
	    //Implement your code here and change the return value accordingly
        // Regex: Alphanumeric and length between 2 and 20
        String regex = "^[A-Za-z0-9]{2,20}$";
        return productId.matches(regex);
	}
	
	public boolean checkTrackerIdValidity(String trackerId) {
	    //Implement your code here and change the return value accordingly
        // Format: 1 uppercase : 4 uppercase : 3 lowercase : 2 digits
        String regex = "^[A-Z]:[A-Z]{4}:[a-z]{3}:[0-9]{2}$";
        return trackerId.matches(regex);
	}
	
}
/* # Tester Class */
class Tester {
      
    public static void main(String[] args) {
            
        Shipment shipment = new Shipment();
        
        //Change the values for testing your code with different values
        
        String productName = "Digital Camera";
        System.out.println("The product name is "+ (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));

        String productId = "DC1911";
        System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));

        String trackerId = "D:CMDC:cmd:23";
        System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
    
    }
}






