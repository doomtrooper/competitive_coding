package leetcode.hard;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {2, 1, 0, 3, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height.length < 3) return 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            if (i == 0) leftMax[i] = 0;
            else leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }
        for (int i = height.length - 1; i >= 0; i--) {
            if (i == height.length - 1) rightMax[i] = 0;
            else rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }
        int waterTrapped = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int diff = Math.min(leftMax[i], rightMax[i]);
            if (diff > height[i]) waterTrapped += diff-height[i];
        }
        return waterTrapped;
    }
}

