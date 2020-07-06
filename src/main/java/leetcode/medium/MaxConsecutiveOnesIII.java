package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1};
        System.out.println(longestOnes(array, 1));
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        System.out.println(longestOnes(new int[]{0}, 1));
    }

    public static int longestOnes(int[] A, int K) {
        int i = 0, j = 0, maxCount = 0;
        while (j < A.length) {
            if (A[j] == 0) K--;
            while (K < 0) {
                if (A[i++] == 0) {
                    K++;
                }
            }
            maxCount = Math.max(maxCount, j - i + 1);
            j++;
        }
        return maxCount;
    }
}

