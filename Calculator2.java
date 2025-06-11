public class Calculator {

    // Instance variable
    public int num;

    // Method to calculate and return the sum of digits
    public int sumOfDigits() {
        int sum = 0;
        int temp = Math.abs(num);  // Handle negative numbers

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return sum;
    }
}
/* # Tester Class */
public class Tester {

    public static void main(String args[]) {

        Calculator calculator = new Calculator();

        // Assign a value to the member variable num of Calculator class
        calculator.num = 1234;

        // Invoke the method sumOfDigits of Calculator class and display the output
        System.out.println(calculator.sumOfDigits());
    }
}
