/*
 * Complete the removeWhiteSpaces() method given in the Tester class.

Method Description

removeWhiteSpaces(String str)

Remove all the white spaces from the string passed to the method and return the modified string.

Test the functionalities using the main() method of the Tester class. 
 */

public class Tester {
	public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
		// Replace all whitespace characters with empty string
        return str.replaceAll("\\s+", "");
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}

}
