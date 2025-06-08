/* Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. 
Apart from the cost per plate of food, customers are also charged for home delivery 
based on the distance in kms from the restaurant to the delivery point. 
The delivery charges are as mentioned below:
* first 3Km = $0
* Next 3Km = $1
* Remaining Kms = $2

Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.
*/

import java.util.Scanner;

public class FoodCornerBillCalculator {
    public static int calculateBill(char foodType, int quantity, int distance) {
        // Validate inputs
        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            return -1;
        }

        // Calculate food cost
        int foodCostPerPlate = (foodType == 'V') ? 12 : 15;
        int foodCost = foodCostPerPlate * quantity;

        // Calculate delivery charge
        int deliveryCharge = 0;
        if (distance <= 3) {
            deliveryCharge = 0;
        } else if (distance <= 6) {
            deliveryCharge = (distance - 3) * 1;
        } else {
            deliveryCharge = (3 * 1) + ((distance - 6) * 2);
        }

        return foodCost + deliveryCharge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter food type (V for Vegetarian / N for Non-Vegetarian): ");
        char foodType = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter quantity (number of plates): ");
        int quantity = scanner.nextInt();

        System.out.print("Enter distance in kms: ");
        int distance = scanner.nextInt();

        // Calculate and display bill
        int billAmount = calculateBill(foodType, quantity, distance);
        System.out.println("Bill Amount: " + billAmount);

        scanner.close();
    }
}
