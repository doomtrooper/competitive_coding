package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
public class LongestSubarrayof1AfterDeletingOneElement {
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1, 1, 0, 1}));
        System.out.println(longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        System.out.println(longestSubarray(new int[]{1, 1, 1}));
        System.out.println(longestSubarray(new int[]{1, 1, 0, 0, 1, 1, 1, 0, 1}));
        System.out.println(longestSubarray(new int[]{0, 0, 0}));
        System.out.println(longestSubarray(new int[]{0, 0, 1}));
        System.out.println(longestSubarray(new int[]{0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1}));
    }

    public static int longestSubarray(int[] nums) {
        if (nums.length == 1) return 0;
        int i = 0, j = 0, k = 1, maxCount = 0;
        while (j < nums.length) {
            if (nums[j] == 0) k--;
            while (k < 0) {
                if (nums[i++] == 0) {
                    k++;
                }
            }
            maxCount = Math.max(maxCount, j - i + 1);
            j++;
        }
        return maxCount - 1;
    }

}

