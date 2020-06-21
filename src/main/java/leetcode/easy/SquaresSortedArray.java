package leetcode.easy;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        sortedSquares(arr);
    }

    public static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int i = 0, j = A.length - 1;
        for (int k = A.length - 1; k >= 0; k--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[k] = A[i];
                i++;
            } else {
                result[k] = A[j];
                j--;
            }
        }
        for (int k = 0; k < result.length; k++) {
            result[k] = (int) Math.pow(result[k], 2);
        }
        return result;
    }

}

