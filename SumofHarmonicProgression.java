/*
 *Implement a recursive method to find the sum of the Harmonic Progression given below.  
1+1/2+1/3+1/4+1/5+1/6+…+1/n
Implement the logic inside findHPSum() method. You need to find the sum based on 
the value of num passed to the method.
E.g. - If the value of num is 3, you need to find the sum of 1+1/2+1/3.
Test the functionalities using the main method of the Tester class. ​ 
 */

class Tester {

    public static double findHPSum(int num) {
        //Implement your code here and change the return value accordingly
        // Base case
        if (num == 1)
            return 1.0;
        // Recursive case
        return 1.0 / num + findHPSum(num - 1);
    }
    
    public static void main(String args[]) {
        System.out.println(findHPSum(3));
    }
}
