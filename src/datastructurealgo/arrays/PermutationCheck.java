package datastructurealgo.arrays;

import java.util.Arrays;
import java.util.List;

class PermutationCheck {

    /**
     * Checks if one string is a permutation of the other.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return true if str1 is a permutation of str2, false otherwise.
     */
    public static boolean isPermutation(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false; // Or throw an exception, depending on requirements.
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    /**
     * Checks if one string is a permutation of the other, using a character count.
     * This method is generally more efficient than sorting, especially for large strings.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return true if str1 is a permutation of str2, false otherwise.
     */
    public static boolean isPermutationCharacterCount(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCounts = new int[128]; // Assuming ASCII characters

        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            charCounts[str2.charAt(i)]--;
            if (charCounts[str2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        String str3 = "abcd";
        String str4 = "abce";

        System.out.println("'" + str1 + "' and '" + str2 + "' are permutations: " + isPermutation(str1, str2)); // true
        System.out.println("'" + str1 + "' and '" + str3 + "' are permutations: " + isPermutation(str1, str3)); // false
        System.out.println("'" + str3 + "' and '" + str4 + "' are permutations: " + isPermutation(str3, str4)); // false

        System.out.println("Character Count Method:");
        System.out.println("'" + str1 + "' and '" + str2 + "' are permutations: " + isPermutationCharacterCount(str1, str2)); // true
        System.out.println("'" + str1 + "' and '" + str3 + "' are permutations: " + isPermutationCharacterCount(str1, str3)); // false
        System.out.println("'" + str3 + "' and '" + str4 + "' are permutations: " + isPermutationCharacterCount(str3, str4)); // false
    }
}
