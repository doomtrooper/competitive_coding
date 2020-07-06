package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/unique-paths-ii/
public class UniquePathII {
    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        if (obstacleGrid.length == 1 && obstacleGrid[0].length == 1) return 1;
        boolean obstacleFound = false;
        for (int i = 1; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = 0;
                obstacleFound = true;
            } else {
                obstacleGrid[i][0] = obstacleFound ? 0 : 1;
            }
        }
        obstacleFound = false;
        for (int i = 1; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                obstacleGrid[0][i] = 0;
                obstacleFound = true;
            } else {
                obstacleGrid[0][i] = obstacleFound ? 0 : 1;
            }
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;
                else obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
            }
        }
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}

