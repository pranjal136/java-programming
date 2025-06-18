/*
 * Implement a recursive method to generate the nth Fibonacci number.
 * The Fibonacci series consists of the first two numbers as 0 and 1 and 
 * the subsequent numbers are the sum of the previous two numbers. 
 * Implement the logic inside findFibonacci() method.
Fibonacci numbers – 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, … 
Test the functionalities using the main method of the Tester class.
 */

class Tester {
    
    public static int findFibonacci(int n) {
        //Implement your code here and change the return value accordingly
        // Base cases
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            // Recursive case
            return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String args[]) {
        int n = 7;
        if(n>=0)
            System.out.println(findFibonacci(n));
        else
            System.out.println("Please enter a valid value for n");
    }
}
