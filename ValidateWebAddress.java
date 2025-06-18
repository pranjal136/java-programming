/*
 * Validate the web address based on the below conditions using regular 
 * expression in the checkWebAddressValidity() method.
* The web address should start with http or https
* http or https should be followed by ://
* The web address may have 'www.'
* The web address can be alphanumeric
* After . (except the . after www), the web address should contain either "com" or "org" or "net"
* Return true if the web address is valid, else return false.
Test the functionalities using the main method of the Tester class.
 */

class Tester {

    public static boolean checkWebAddressValidity(String webAddress) {
        //Implement your code here and change the return value accordingly
        String regex = "^https?://(www\\.)?[a-zA-Z0-9]+\\.(com|org|net)$";
        return webAddress.matches(regex);
    }
      
    public static void main(String[] args) {
        
        //Change the value of webAddress for testing your code with different web addresses
        String webAddress = "http://www.company.com";
        System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    }
}
