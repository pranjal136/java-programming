import java.util.Scanner;

public class SumOrDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        if (num1 == num2) {
            System.out.println("The sum is: " + sum);
        } else {
            System.out.println("The double of the sum is: " + (2 * sum));
        }
    }
}
