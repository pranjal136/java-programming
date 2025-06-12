/*
Complete the findHighestOccurrence() method given in the Tester class.

Method Description

findHighestOccurrence(String str)

Find the count of the highest occurring character in the string passed to the method and return the count.
Test the functionalities using the main() method of the Tester class. 
*/

import java.util.HashMap;

class Tester {

    public static int findHighestOccurrence(String str){
        // Create a map to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the highest frequency
        int maxCount = 0;
        for (int count : charCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    public static void main(String args[]){
        String str = "success";
        System.out.println(findHighestOccurrence(str)); // Output: 3 (for 's')
    }
}
