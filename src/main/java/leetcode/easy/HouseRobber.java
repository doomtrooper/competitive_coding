package leetcode.easy;

import java.util.*;

//https://leetcode.com/problems/house-robber/
public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob2(new int[]{1, 2, 3, 1}));
        System.out.println(rob2(new int[]{2, 7, 9, 3, 1}));
        System.out.println(rob2(new int[]{2, 7}));
        System.out.println(rob2(new int[]{21, 7, 7, 21}));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return Math.max(robUtil(nums, 1, dp), robUtil(nums, 2, dp));
    }

    private static int robUtil(int[] nums, int curHouse, int[] dp) {
        if (curHouse > nums.length) return 0;
        if (dp[curHouse] == -1) {
            dp[curHouse] = Math.max(robUtil(nums, curHouse + 2, dp)
                    , robUtil(nums, curHouse + 3, dp)) + nums[curHouse - 1];
        }
        return dp[curHouse];
    }

    public static int rob2(int[] nums) {
        if (nums.length==0) return 0;
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            memo[i + 1] = Math.max(memo[i], memo[i - 1] + nums[i]);
        }
        return memo[nums.length];
    }
}

