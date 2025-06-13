/*
Find out all the possible permutations of the characters in the string passed to the method findPermutations(). 
Implement the logic inside findPermutations() method and return a string array containing all the permutations.
Assumption: The length of the string will be 3.

E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.
 */

class Tester {
    public static String[] findPermutations(String str) {
        String[] result = new String[6];
        int index = 0;

        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);

        String[] all = {
            "" + a + b + c,
            "" + a + c + b,
            "" + b + a + c,
            "" + b + c + a,
            "" + c + a + b,
            "" + c + b + a
        };

        // Add unique values in the expected order
        for (String s : all) {
            boolean exists = false;
            for (int i = 0; i < index; i++) {
                if (result[i].equals(s)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                result[index++] = s;
            }
        }

        // Fill remaining with null
        while (index < 6) {
            result[index++] = null;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "Eye"; // Try "EYE", "Boy", "AaA", etc.
        String[] permutations = findPermutations(str);
        for (String permutation : permutations) {
            if (permutation != null)
                System.out.println(permutation);
        }
    }
}
