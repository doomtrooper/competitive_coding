package leetcode.easy;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/sqrtx/
public class SqrtX {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x < 4) return 1;
        int low = 2, high = x / 2, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            long temp = (long) mid * mid;
            if (temp == x) return mid;
            if (temp > x) high = mid - 1;
            if (temp < x) low = mid + 1;
        }
        return low - 1;
    }
}

