/*
 * Implement a program to check whether a given number is a lucky number.

A lucky number is a number whose sum of squares of every even-positioned digit 
(starting from the second position) is a multiple of 9.

E.g. - 1623 = 62+32 = 45 is a multiple of 9 and hence is a lucky number.
 */

import java.util.Scanner;

public class LuckyNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        
        int sum = 0;

        // Loop through digits, 1-based indexing from left
        for (int i = 0; i < number.length(); i++) {
            if ((i + 1) % 2 == 0) {  // Even-positioned digits
                int digit = Character.getNumericValue(number.charAt(i));
                sum += digit * digit;
            }
        }

        // Check if the sum is divisible by 9
        if (sum % 9 == 0) {
            System.out.println(number + " is a Lucky Number");
        } else {
            System.out.println(number + " is Not a Lucky Number");
        }

        sc.close();
    }
}
