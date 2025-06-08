/*
 * Implement a program to find out whether a number is divisible by the sum of its digits. 

Display appropriate messages.
*/
import java.util.Scanner;

public class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate sum of digits
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Check divisibility
        if (sum == 0) {
            System.out.println("Sum of digits is 0. Cannot divide by 0.");
        } else if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is divisible by the sum of its digits (" + sum + ").");
        } else {
            System.out.println(originalNumber + " is NOT divisible by the sum of its digits (" + sum + ").");
        }

        scanner.close();
    }
}

