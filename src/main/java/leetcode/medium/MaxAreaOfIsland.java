package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/max-area-of-island/
public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 1, 0, 0, 0},
        };

        System.out.println(maxAreaOfIsland(arr));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[] rowDir = {0, 1, 0, -1};
        int[] colDir = {1, 0, -1, 0};
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result = Math.max(result, maxAreaOfIslandDfs(grid, rowDir, colDir, i, j, visited));
                }
            }
        }
        return result;
    }

    private static int maxAreaOfIslandDfs(int[][] grid, int[] rowDir, int[] colDir, int i, int j, boolean[][] visited) {
        if (!isValid(grid, i, j, visited)) return 0;
        visited[i][j] = true;
        int length = 1;
        for (int k = 0; k < rowDir.length; k++) {
            length += maxAreaOfIslandDfs(grid, rowDir, colDir, i + rowDir[k], j + colDir[k], visited);
        }
        return length;
    }

    private static boolean isValid(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length) return false;
        if (j < 0 || j >= grid[0].length) return false;
        if (grid[i][j] == 0) return false;
        if (visited[i][j]) return false;
        return true;
    }

}

