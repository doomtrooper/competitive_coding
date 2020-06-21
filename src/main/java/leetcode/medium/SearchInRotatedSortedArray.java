package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] array = {0,0,1,2,2,5,6};
        System.out.println(search(array, 4));
    }

    public static int search(int[] nums, int target) {
        if (nums.length<1) return -1;
        int pivot = findPivot(nums);
        if (nums[pivot] == target) return pivot;
        else {
            return Math.max(binarySearch(nums, target, 0, pivot - 1), binarySearch(nums, target, pivot + 1, nums.length - 1));
        }
    }

    private static int findPivot(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (isPivot(nums, mid)) return mid;
            else if (nums[mid] > nums[high]) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    private static boolean isPivot(int[] nums, int mid) {
        if (nums[(mid + 1) % nums.length] > nums[mid]
                && nums[(mid - 1 + nums.length) % nums.length] > nums[mid])
            return true;
        return false;
    }

    private static int binarySearch(int[] nums, int target, int low, int high) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

