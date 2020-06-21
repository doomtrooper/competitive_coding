package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstandLastPositionElementSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        printArray(searchRange(nums, 9));
    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        int[] result = {-1, -1};
        if (nums.length==0) return result;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                // find the range
                int temp = mid;
                while (temp >= 0 && nums[temp] == target) temp--;
                result[0] = temp + 1;
                temp = mid;
                while (temp < nums.length && nums[temp] == target) temp++;
                result[1] = temp - 1;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }
}

