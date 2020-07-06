package leetcode.medium;

import java.util.Arrays;

//https://leetcode.com/problems/house-robber-ii/
public class HouseRobberII {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2, 3, 2}));
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(rob(new int[]{2, 7}));
        System.out.println(rob(new int[]{21, 7, 7, 21}));
        System.out.println(rob(new int[]{6, 6, 4, 8, 4, 3, 3, 10}));
        System.out.println(rob(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int result1 = robUtil(Arrays.copyOfRange(nums, 0, nums.length - 1));
        int result2 = robUtil(Arrays.copyOfRange(nums, 1, nums.length));
        return Math.max(result1, result2);
    }

    public static int robUtil(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }
        return dp[nums.length];
    }
}

