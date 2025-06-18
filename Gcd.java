/*
 * Implement a recursive method to find the greatest common divisor (GCD) of two numbers. 
 * Implement the logic inside findGCD() method. You can make use of the provided findMax() 
 * and findMin() methods for the implementation.
GCD of two numbers is the largest positive integer that divides each of the numbers.
Test the functionalities using the main method of the Tester class.
 */

class Tester {

    public static int findGCD(int num1, int num2) {
        //Implement your code here and change the return value accordingly
        int max = findMax(num1, num2);
        int min = findMin(num1, num2);

        // Base case
        if (min == 0)
            return max;

        // Recursive case
        return findGCD(min, max % min);
    }
    
    public static int findMax(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public static int findMin(int num1, int num2) {
        return (num1 < num2 ? num1 : num2);
    }

    public static void main(String args[]) {
        System.out.println(findGCD(5, 10));
    }
}
