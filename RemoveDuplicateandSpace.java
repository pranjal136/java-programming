/*
Complete the removeDuplicatesandSpaces() method given in the Tester class.

Method Description

removeDuplicatesandSpaces(String str)

Remove all the duplicate characters and white spaces from the string passed to the method and return the modified string.
Test the functionalities using the main() method of the Tester class. 
  */

import java.util.HashSet;

class Tester {
    public static String removeDuplicatesandSpaces(String str) {
        // Use a set to store already seen characters
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (ch != ' ' && !seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String args[]) {
        String str = "object oriented programming";
        System.out.println(removeDuplicatesandSpaces(str));  // Expected output: "objectrindpamag"
    }
}
