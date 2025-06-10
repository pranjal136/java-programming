public class Calculator {
    // Instance variable
    private int num;

    // Constructor to initialize num
    public Calculator(int num) {
        this.num = num;
    }

    // Method to calculate and return the sum of digits
    public int sumOfDigits() {
        int sum = 0;
        int temp = Math.abs(num); // Handles negative numbers

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }
}

/* #Tester Class */
import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		// Ask user for input
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

		Calculator calculator = new Calculator(inputNumber);

		// Display the sum of digits
        int result = calculator.sumOfDigits();
        System.out.println("Sum of digits: " + result);

        scanner.close();

	}

}

