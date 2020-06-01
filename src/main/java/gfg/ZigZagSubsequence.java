package gfg;

import java.util.Arrays;

/**
 * Created by kuliza-265 on 27/4/17.
 */
public class ZigZagSubsequence {
    public static void main(String[] args){
        int arr[] = { 10, 22, 9, 33, 49, 50, 31, 60 };
        System.out.println(longestCommonSubsequence("AGGTAB","GXTXAYB"));
    }

    private static int largestZigZagPattern(int[] arr) {
        int[] dpInc = new int[arr.length], dpDec = new int[arr.length];
        Arrays.fill(dpDec,1);
        Arrays.fill(dpInc,1);
        for (int i =1;i<arr.length;i++){
            for (int j=0;j<i;j++){

            }
        }
        return 1;
    }

    private static int longestCommonSubsequence(String str1, String str2){
        int[][] dp = new int[str1.length()][str2.length()];
        for (int i=0;i<dp.length;i++)
            for (int j=0;j<dp[0].length;j++)
                dp[i][j] = -1;
        return longestCommonSubsequenceUtil(str1, str2,dp);
    }

    private static int longestCommonSubsequenceUtil(String substring1, String substring2, int[][] dp) {
        if (substring1.isEmpty() || substring2.isEmpty()) return 0;
        if (dp[substring1.length()-1][substring2.length()-1]!=-1) return dp[substring1.length()-1][substring2.length()-1];
        else {
            dp[substring1.length()-1][substring2.length()-1] = substring1.charAt(0)==substring2.charAt(0)
                    ?1+longestCommonSubsequenceUtil(substring1.substring(1), substring2.substring(1),dp)
                    :Math.max(longestCommonSubsequenceUtil(substring1.substring(1),substring2, dp)
                    ,longestCommonSubsequenceUtil(substring1, substring2.substring(1), dp));
        }
        return dp[substring1.length()-1][substring2.length()-1];
    }

    public static int minCostPath(int[][] arr, int rowDest, int colDest){
        int ROW_MAX = arr.length, COL_MAX = arr[0].length;
        int[][] dpPathCost = new int[ROW_MAX][COL_MAX];
        for (int i=0;i<ROW_MAX;i++)   for (int j=0;j<COL_MAX;j++)   dpPathCost[i][j] = -1;
        return minCostPathutil(arr,0,0,ROW_MAX,COL_MAX, dpPathCost, 0, rowDest, colDest);
    }

    private static int minCostPathutil(int[][] arr, int row, int col, int row_max, int col_max, int[][] dpPathCost, int totalCost, int rowDest, int colDest) {
        if (row==rowDest && col == colDest) return totalCost+arr[row][col];
        if (!isValidCell(row, col, row_max, col_max)) return Integer.MAX_VALUE;
        if (dpPathCost[row][col]==-1){
            totalCost+=arr[row][col];
            dpPathCost[row][col] = Math.min(Math.min(minCostPathutil(arr, row+1, col, row_max, col_max, dpPathCost, totalCost, rowDest, colDest)
                                    ,minCostPathutil(arr, row, col+1, row_max, col_max, dpPathCost, totalCost, rowDest, colDest))
                                    ,minCostPathutil(arr, row+1, col+1, row_max, col_max, dpPathCost, totalCost, rowDest, colDest));
        }
        return dpPathCost[row][col];
    }

    private static boolean isValidCell(int row, int col, int row_max, int col_max) {
        return row>=0&&col>=0&&row<row_max&&col<col_max;
    }
}
