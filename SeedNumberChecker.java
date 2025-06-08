/*
 * Implement a program to find out whether a number is a seed of another number.

A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.

E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
 */

import java.util.Scanner;

public class SeedNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number (X): ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number (Y): ");
        int y = scanner.nextInt();

        // Calculate product of digits of x
        int temp = x;
        int digitProduct = 1;
        while (temp > 0) {
            int digit = temp % 10;
            digitProduct *= digit;
            temp /= 10;
        }

        // Calculate x multiplied by product of its digits
        int result = x * digitProduct;

        // Check if it is equal to y
        if (result == y) {
            System.out.println(x + " is a seed of " + y);
        } else {
            System.out.println(x + " is not a seed of " + y);
        }

        scanner.close();
    }
}
