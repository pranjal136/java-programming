/*
 * Validate the name based on the below conditions using regular expression in the checkNameValidity() method.
* The length of the name should be between 2 and 30 characters (both inclusive)
* The name can contain only alphabets and spaces
* The first character of each word of the name should be an upper case alphabet
* Each word should be separated by a space
* The name should not start or end with a space
* Special characters should not be allowed
* Return true if the name is valid, else return false.

Test the functionalities using the main method of the Tester class.
 */

class Tester {

    public static boolean checkNameValidity(String name) {
        //Implement your code here and change the return value accordingly
        String regex="^([A-Z]{1}[A-Za-z]{1,11})+(?:\\s[A-Z]{1}[A-Za-z]{1,8})?(?:\\s[A-Z]{1}[A-Za-z]{2,8})?$";
        if(name.matches(regex)) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        //Change the value of name for testing your code with different names
        String name = "Roger Federer";
        System.out.println("The name is "+ (checkNameValidity(name) ? "valid!" : "invalid!"));      
    }
}
