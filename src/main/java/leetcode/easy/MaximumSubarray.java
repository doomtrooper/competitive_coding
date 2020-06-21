package leetcode.easy;

import java.io.*;
import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] array = {-2,-3,3};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int[] nums) {
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
            if (curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}

