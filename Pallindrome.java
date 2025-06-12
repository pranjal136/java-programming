/*
Complete the checkPalindrome() method given in the Tester class.
Method Description
checkPalindrome(String str)
Check whether the string passed to the method is a palindrome or not. 
Return true if the string is palindrome, else return false.

Test the functionalities using the main() method of the Tester class.
*/

class Tester {
    public static boolean checkPalindrome(String str) {
        // Compare characters from both ends moving toward the center
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String args[]) {
        String str = "radar";
        if (checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}
