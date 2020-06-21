package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/jump-game-iii/
public class JumpGameIII {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 1, 2};
        System.out.println(canReach(arr, 2));
    }

    public static boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return canReachUtils(arr, start, visited);
    }

    private static boolean canReachUtils(int[] arr, int current, boolean[] visited) {
        if (current >= arr.length || current < 0 || visited[current]) return false;
        visited[current] = true;
        if (arr[current] == 0) return true;
        return canReachUtils(arr, current + arr[current], visited) || canReachUtils(arr, current - arr[current], visited);
    }
}

