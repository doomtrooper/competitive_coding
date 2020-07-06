package leetcode.easy;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs2(3));
        System.out.println(climbStairs2(2));
        System.out.println(climbStairs2(1));
        System.out.println(climbStairs2(45));
    }

    public static int climbStairs2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        if (n > 1) dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return climbStairs(0, n, dp);
    }

    private static int climbStairs(int currentStep, int n, int[] dp) {
        if (currentStep > n) return 0;
        if (currentStep == n) return 1;
        if (dp[currentStep] == 0) {
            dp[currentStep] = climbStairs(currentStep + 1, n, dp)
                    + climbStairs(currentStep + 2, n, dp);
        }
        return dp[currentStep];
    }
}

