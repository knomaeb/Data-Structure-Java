package datastructurealgo.arrays;

import java.util.Arrays;

public class ValidAnagram {
    // brute force
    public static boolean isAnagram1(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

//    After optimization
    public static boolean isAnagram2(String s, String t) {
        // Check for null inputs or different lengths
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Initialize a frequency array for 26 lowercase English letters
        int[] charCounts = new int[26];

        // Increment counts for characters in 's' and decrement for 't'
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "naman";
        String t = "naman";
        boolean result = isAnagram1(s, t); // time complexity : O(nlogn), space complexity O(N)
        boolean result2 = isAnagram2(s, t); // time complexity : O(n), space complexity O(1)
        System.out.println(result);
        System.out.println(result2);
    }
}
