package leetcode.medium;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
        System.out.println(uniquePaths(7, 3));
        System.out.println(uniquePaths(20, 20));
    }

    public static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] memo = new int[m + 1][n + 1];
        memo[m][n] = -1;
        memo[m - 1][n] = 1;
        memo[m][n - 1] = 1;
        memo[m - 1][n - 1] = 2;
        uniquePathsUtil(1, 1, m, n, memo);
        return memo[1][1];
    }

    private static int uniquePathsUtil(int curRow, int curCol, int M, int N, int[][] memo) {
        if (curRow > M || curCol > N) return 0;
        if (memo[curRow][curCol] == 0) {
            memo[curRow][curCol] = uniquePathsUtil(curRow + 1, curCol, M, N, memo)
                    + uniquePathsUtil(curRow, curCol + 1, M, N, memo);
        }
        return memo[curRow][curCol];
    }
}

