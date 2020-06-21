package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/count-servers-that-communicate
public class CountServersThatCommunicate {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}, {1, 0, 0, 1, 1}, {0, 0, 1, 1, 0}};
        //int[][] grid = {{1, 1, 1, 0, 0, 1}, {1, 1, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 1}};
        System.out.println(countServers(grid));
    }

    public static int countServers(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    int temp = dfs(grid, i, j, visited);
                    count += temp == 1 ? 0 : temp;
                }
            }
        }
        return count;
    }

    private static int dfs(int[][] grid, int row, int col, boolean[][] visited) {
        visited[row][col] = true;
        grid[row][col] = -1;
        int count = 1;
        for (int i = row + 1; i < grid.length; i++) {
            if (isValid(grid, i, col, visited)) {
                count += dfs(grid, i, col, visited);
            } else {
                visited[i][col] = true;
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            if (isValid(grid, i, col, visited)) {
                count += dfs(grid, i, col, visited);
            } else {
                visited[i][col] = true;
            }
        }
        for (int i = col + 1; i < grid[0].length; i++) {
            if (isValid(grid, row, i, visited)) {
                count += dfs(grid, row, i, visited);
            } else {
                visited[row][i] = true;
            }
        }
        for (int i = col - 1; i >= 0; i--) {
            if (isValid(grid, row, i, visited)) {
                count += dfs(grid, row, i, visited);
            } else {
                visited[row][i] = true;
            }
        }
        return count;
    }

    private static boolean isValid(int[][] grid, int row, int col, boolean[][] visited) {
        if (row < 0 || row >= grid.length) return false;
        if (col < 0 || col >= grid[0].length) return false;
        if (grid[row][col] == 0) return false;
        return !visited[row][col];
    }
}

