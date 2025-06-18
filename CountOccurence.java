/*
 * Implement a recursive method to count the occurrences of a given substring in a given string. 
 * Implement the logic inside countSubstring() method.
Perform case-sensitive comparison.
Test the functionalities using the main method of the Tester class. ​
 */

class Tester {

    public static int countSubstring(String inputString, String substring, int count) {
        //Implement your code here and change the return value accordingly
        // Base condition: if input string length is less than substring, stop recursion
        if (inputString.length() < substring.length()) {
            return count;
        }

        // Check if the current part of the string starts with the substring
        if (inputString.startsWith(substring)) {
            // If yes, increment count and move the window by 1 character
            return countSubstring(inputString.substring(1), substring, count + 1);
        } else {
            // Else, move the window by 1 character without increasing the count
            return countSubstring(inputString.substring(1), substring, count);
        }
    }
   
    public static void main(String args[]) {
        int count = countSubstring("I felt happy because I saw the others were Happy and because I knew I should feel happy, but I was not really happy","happy", 0);
        System.out.println(count);
    }
}
