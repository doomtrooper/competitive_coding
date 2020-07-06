package leetcode;

import java.io.*;
import java.util.*;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
        System.out.println(kthFactor(7, 2));
    }

    public static double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE, maxSalary = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < minSalary) minSalary = salary[i];
            if (salary[i] > maxSalary) maxSalary = salary[i];
            sum += salary[i];
        }
        return (double) (sum - minSalary - maxSalary) / (salary.length - 2);
    }

    public static int kthFactor(int n, int k) {
        if (k == 1) return 1;
        int curCount = 1;
        for (int i = 2; i <= n / 2 && curCount < k; i++) {
            if (n % i == 0) {
                if (++curCount == k) return i;
            }
        }
        if (curCount == k - 1) return n;
        return -1;
    }

    public static int longestSubarray(int[] nums) {
        boolean utilized = false;
        int curSum = 0, maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                if (utilized){

                }else{
                    continue;
                }
            }else{
                curSum++;
            }
            maxSum = Math.max(maxSum,curSum);
        }
        return maxSum;
    }
}

