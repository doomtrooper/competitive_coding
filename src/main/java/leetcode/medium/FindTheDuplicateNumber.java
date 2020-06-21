package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/find-the-duplicate-number/
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {3,1,3,4,2};
        System.out.println(findDuplicate2(numbers));

    }

    public static int findDuplicate(int[] nums) {
        if (nums.length < 3) return nums[0];
        return 0;
    }

    //This method Complexity O(n*log(n)), also with this approach there is a change in given array required.
    public static int findDuplicate2(int[] nums) {
        if (nums.length < 3) return nums[0];
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == nums[low]) return nums[mid];
            if (nums[mid] - nums[low] >= mid - low) low = mid;
            else high = mid;
        }
        return nums[low];
    }
}

