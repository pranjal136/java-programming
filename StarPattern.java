/*
 * Implement a program to display the below pattern.

*****

****

***

**

*
 */

public class StarPattern {
    public static void main(String[] args) {
        // Outer loop for number of rows
        for (int i = 5; i >= 1; i--) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
