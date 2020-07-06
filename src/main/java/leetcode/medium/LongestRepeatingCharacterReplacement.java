package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
//        System.out.println(characterReplacement("ABCBAB", 2));
//        System.out.println(characterReplacement("AABABBA", 1));
//        System.out.println(characterReplacement("ABAB", 2));
//        System.out.println(characterReplacement("A", 0));
//        System.out.println(characterReplacement("BAAAAAAAAAB", 10));
//        System.out.println(characterReplacement("ABBBCDB", 2));
        System.out.println(characterReplacement("", 0));
    }

    public static int characterReplacement(String s, int k) {
        int curCharIndex = 0;
        int left = 0, maxCount = 0, mostFrequent = 0;
        int[] frequency = new int[26];
        for (int right = 0; right < s.length(); right++) {
            curCharIndex = (s.charAt(right) - 'A');
            frequency[curCharIndex]++;
            mostFrequent = Math.max(mostFrequent, frequency[curCharIndex]);
            int chartoReplace = (right - left + 1) - mostFrequent;
            if (chartoReplace > k) {
                frequency[s.charAt(left) - 'A']--;
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }

    public static int characterReplacement2(String s, int k) {
        int maxCount = 0;
        for (int i = 'A'; i < 'A' + 26; i++) {
            maxCount = Math.max(maxCount, maxSingleCharWithReplacement(s, (char) i, k));
        }
        return maxCount;
    }

    public static int maxSingleCharWithReplacement(String s, char c, int k) {
        int maxCount = 0, i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(j) != c) {
                k--;
            }
            while (k < 0) {
                if (s.charAt(i) != c) k++;
                i++;
            }
            maxCount = Math.max(maxCount, j - i + 1);
            j++;
        }
        return maxCount;
    }
}

