public class Calculator {
	public double findAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3.0;
        return Math.round(average * 100.0) / 100.0;
    }

}

/* #Tester Class */
import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double avg = calc.findAverage(num1, num2, num3);
        System.out.println("Average: " + avg);

        scanner.close();
	}

}
