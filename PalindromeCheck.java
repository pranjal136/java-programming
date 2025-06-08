/*
 * Implement a program to check whether a given number is a palindrome.

Palindrome is a sequence that reads the same backwards as forwards.

E.g.: 121, 1331, 2332, 78900987, 123456654321,  etc.
 */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is NOT a palindrome.");
        }
        
        sc.close();
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        // Check if original and reversed are the same
        return original == reversed;
    }
}
