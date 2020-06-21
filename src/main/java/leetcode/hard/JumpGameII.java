package leetcode.hard;

import java.util.*;

//https://leetcode.com/problems/jump-game-ii/
public class JumpGameII {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(jump2(arr));
    }
    
    public static int jump2(int[] nums) {
        int[] stepCount = new int[nums.length];
        Arrays.fill(stepCount, Integer.MAX_VALUE);
        int maxCount = 0;
        stepCount[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = maxCount + 1; j <= i + nums[i]; j++) {
                if (j < nums.length) stepCount[j] = Math.min(stepCount[i] + 1, stepCount[j]);
            }
            if (maxCount < nums[i] + i) maxCount = i + nums[i];
            if (maxCount >= nums.length) break;
        }
        return stepCount[nums.length - 1];
    }
}

