/*
 * Implement a program to find and display the least common multiple (LCM) of two whole numbers.
Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number 
that is divisible by both num1 and num2.
 */

import java.util.Scanner;

public class LCMCalculator {

    // Method to find GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find LCM
    public static int findLCM(int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return (num1 * num2) / gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive whole numbers.");
        } else {
            // Calculate LCM
            int lcm = findLCM(num1, num2);
            // Output
            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        }

        scanner.close();
    }
}
