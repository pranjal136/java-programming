/* Implement a program to calculate the product of three positive integer values. However, 
 * if one of the integers is 7, consider only the values to the right of 7 for calculation. 
 * If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7. 
*/

import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three positive integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result;

        if (a == 7) {
            result = b * c;
        } else if (b == 7) {
            result = c;
        } else if (c == 7) {
            result = -1;
        } else {
            result = a * b * c;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
