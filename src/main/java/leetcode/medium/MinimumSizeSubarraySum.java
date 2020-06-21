package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/minimum-size-subarray-sum
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] array = {};
        System.out.println(minSubArrayLen(7, array));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int minLength = Integer.MAX_VALUE, curSum = 0, front = 0, rear = 0;
        while (front < nums.length) {
            curSum += nums[front];
            if (curSum >= s) {
                while ((curSum - nums[rear]) >= s) {
                    curSum -= nums[rear++];
                }
                minLength = Math.min(minLength, front - rear);
            }
            front++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength + 1;
    }
}

