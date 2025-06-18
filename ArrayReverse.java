/*
 * Implement a recursive method to reverse an array based on the array, the start index 
 * and the end index of the array. Implement the logic inside reverseArray() method.
Test the functionalities using the main method of the Tester class. ​
 */

class Tester {

    public static int[] reverseArray(int numbers[], int startIndex, int endIndex) {
        //Implement your code here and change the return value accordingly
        // Base condition: if start index is greater than or equal to end index, stop recursion
        if (startIndex >= endIndex) {
            return numbers;
        }

        // Swap the elements at startIndex and endIndex
        int temp = numbers[startIndex];
        numbers[startIndex] = numbers[endIndex];
        numbers[endIndex] = temp;

        // Recursive call to reverse the remaining subarray
        return reverseArray(numbers, startIndex + 1, endIndex - 1);
    }
    
    public static void main(String args[]) {
        int numbers[] = new int[] { 1, 2, 3, 4, 5, 6 };

        int reversedNumbers[] = reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reversed array");
        for (int number : reversedNumbers) {
            System.out.println(number);
        }
    }
}
