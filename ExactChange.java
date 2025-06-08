/*
 * You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z. 
 * The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes. 
 * How many $5 notes and $1 notes will you use?

Implement a program to find out how many $5 notes and $1 notes will be used. 
If an exact change is not possible, then display -1.
 */

import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("$1 notes available = ");
        int oneDollar = scanner.nextInt();

        System.out.print("$5 notes available = ");
        int fiveDollar = scanner.nextInt();

        System.out.print("Purchase amount = ");
        int amount = scanner.nextInt();

        // Try to use maximum $5 notes possible
        int maxFiveUsed = Math.min(amount / 5, fiveDollar);

        while (maxFiveUsed >= 0) {
            int remaining = amount - (maxFiveUsed * 5);
            if (remaining <= oneDollar) {
                System.out.println("$1 notes needed = " + remaining);
                System.out.println("$5 notes needed = " + maxFiveUsed);
                return;
            }
            maxFiveUsed--;
        }

        // Not possible
        System.out.println("-1");
    }
}
