package gfg;

/**
 * Created by kuliza-265 on 25/3/17.
 */
public class DFSMaxRegion {
    public static void main(String[] args){
        int[][] arr = new int[][]{ {0, 0, 1, 1, 0},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1}};

        System.out.println(findMaxRegion(arr,4,5));
    }


    private static int findMaxRegion(int[][] arr,int row, int column) {
        boolean[][] visited = new boolean[row][column];
        int max = 0;
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (arr[i][j]==1 && !visited[i][j]){
                    Integer count = 0;
                    count = DFS(arr,i,j,visited,count,row,column);
                    max = Math.max(max, count);
                }else {
                    visited[i][j] = true;
                }
            }
        }
        return max;
    }

    private static int DFS(int[][] arr, int row, int column, boolean[][] visited, Integer count, int ROW_MAX, int COL_MAX) {
        int rowNbr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int colNbr[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        visited[row][column] = true;
        count++;
        for (int i =0;i<rowNbr.length;i++){
            if (checkelElement(arr,row+rowNbr[i],column+colNbr[i],visited,ROW_MAX,COL_MAX)){
                count = DFS(arr, row+rowNbr[i],column+colNbr[i], visited, count, ROW_MAX, COL_MAX);
            }
        }
        return count;
    }

    private static boolean checkelElement(int[][] arr, int i, int j, boolean[][] visited, int row_max, int col_max) {
        return i<row_max&&j<col_max&&i>=0&&j>=0&&arr[i][j]==1&&!visited[i][j];
    }
}
