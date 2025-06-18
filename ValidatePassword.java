/*
 * Validate the password based on the below conditions using regular expression in the checkPasswordValidity() method.
The length of the password should be between 8 and 20 characters (both inclusive)
The password must contain minimum one lower case alphabet, one upper case alphabet, 
one digit and one special character
The password can contain only the following special characters.
      !, @, #, $, %, &, *, _

Return true if the password is valid, else return false.
Test the functionalities using the main method of the Tester class. ​
 */

class Tester {
    
    public static boolean checkPasswordValidity(String password) {
        //Implement your code here and change the return value accordingly
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%&*_])[a-zA-Z0-9!@#$%&*_]{8,20}$";
        return password.matches(regex);
    }
    
    public static void main(String[] args) {
        
        //Change the value of password for testing your code with different passwords
        String password = "P@$sW0rd";
        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }
    
}
