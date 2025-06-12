/*
Complete the reverseEachWord() method given in the Tester class.

Method Description

reverseEachWord(String str)

Reverse each word in the string passed to the method without changing the order of the words and return the modified string.
Test the functionalities using the main() method of the Tester class.

Note: There should not be any extra blank/white space(s) in the output string.
  */

class Tester {
    public static String reverseEachWord(String str){
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse().toString()).append(" ");
        }
        
        return result.toString().trim(); // Remove trailing space
    }

    public static void main(String args[]){
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str)); // Output: "lla swoc tae ssarg"
    }
}
