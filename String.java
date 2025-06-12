/*
Complete the moveSpecialCharacters() method given in the Tester class.

Method Description

moveSpecialCharacters(String str)

Move all the special characters present in the string passed to the method to the end of the string and return the modified string.
Note: Assume that the input string does not have any space.

Test the functionalities using the main() method of the Tester class. 
*/
class Tester {

    public static String moveSpecialCharacters(String str) {
        StringBuilder alphabetsAndDigits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                alphabetsAndDigits.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        return alphabetsAndDigits.toString() + specialChars.toString();
    }

    public static void main(String args[]) {
        String str = "He@#$llo!*&";
        System.out.println(moveSpecialCharacters(str));  // Output: Hello@#$!*&
    }
}
