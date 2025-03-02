package datastructurealgo.strings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public static boolean isPermutationOfPalindrome(String str){
        // 1. Preprocessing: Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        // 2. Count character frequencies
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c: str.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0)+1);
        }

        // 3. Check for at most one odd count
        int oddCount = 0;
        for(int count : charCounts.values()){
            if(count%2 != 0){
                oddCount++;
            }
        }

        // 4. Return true if at most one character has an odd count
        return oddCount<=1;
    }

    public static void main(String[] args) {
        String str1 = "Tact Coa";
        String str2 = "aabbccdde";
        String str3 = "aabbccdded";
        String str4 = "abc";
        String str5 = "a";
        String str6 = "";

        System.out.println(STR."\"\{str1}\" is a permutation of a palindrome: \{isPermutationOfPalindrome(str1)}");
        System.out.println(STR."\"\{str2}\" is a permutation of a palindrome: \{isPermutationOfPalindrome(str2)}");
        System.out.println(STR."\"\{str3}\" is a permutation of a palindrome: \{isPermutationOfPalindrome(str3)}");
        System.out.println(STR."\"\{str4}\" is a permutation of a palindrome: \{isPermutationOfPalindrome(str4)}");
        System.out.println(STR."\"\{str5}\" is a permutation of a palindrome: \{isPermutationOfPalindrome(str5)}");
        System.out.println(STR."\"\{str6}\" is a permutation of a palindrome: \{isPermutationOfPalindrome(str6)}");
    }
}
