/*
 * Implement a method to find the reverse of a given number for checking if the number 
 * is palindrome or not. Implement the logic inside findReverse() method.
Test the functionalities using the main method of the Tester class. ​ 
 */

class Tester{
    
    public static int findReverse(int num, int temp){
	    //Implement your code here and change the return value accordingly
        if (num == 0)
            return temp;
        temp = (temp * 10) + (num % 10);
        return findReverse(num / 10, temp);
	}
	
	public static void main(String args[]){
	    int num = 12321;
        int reverseNum = findReverse(num,0);
        if(num == reverseNum)
            System.out.println(num +" is a palindrome!");
        else
            System.out.println(num +" is not a palindrome!");
	}
}
