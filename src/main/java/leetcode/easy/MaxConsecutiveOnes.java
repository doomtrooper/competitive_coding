package leetcode.easy;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, curCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxCount = Math.max(maxCount, curCount);
                curCount = 0;
            } else {
                curCount++;
            }
        }
        maxCount = Math.max(maxCount, curCount);
        return maxCount;
    }
}

