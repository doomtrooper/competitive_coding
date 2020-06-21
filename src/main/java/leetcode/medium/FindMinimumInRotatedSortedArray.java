package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] array = {11};
        System.out.println(findMin(array));
    }

    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (checkIfPivot(mid, nums)) return nums[mid];
            if (nums[mid] > nums[high]) low = mid + 1;
            else high = mid - 1;
        }
        return nums[low];
    }

    private static boolean checkIfPivot(int mid, int[] nums) {
        if (nums[(mid + 1) % nums.length] > nums[mid]
                && nums[(mid - 1 + nums.length) % nums.length] > nums[mid])
            return true;
        return false;
    }
}

