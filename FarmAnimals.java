/*
 * Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and 
 * legs of the chickens and rabbits in a farm, identify and display the number of chickens and 
 * rabbits in the farm.

If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.
 */

import java.util.Scanner;

public class FarmAnimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: total heads and legs
        System.out.print("Enter total number of heads: ");
        int heads = sc.nextInt();

        System.out.print("Enter total number of legs: ");
        int legs = sc.nextInt();

        // Let x be number of chickens and y be number of rabbits
        // chickens have 2 legs, rabbits have 4 legs
        boolean found = false;

        for (int chickens = 0; chickens <= heads; chickens++) {
            int rabbits = heads - chickens;
            int totalLegs = chickens * 2 + rabbits * 4;

            if (totalLegs == legs) {
                System.out.println("Number of chickens: " + chickens);
                System.out.println("Number of rabbits: " + rabbits);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No valid solution for the given number of heads and legs.");
        }

        sc.close();
    }
}
