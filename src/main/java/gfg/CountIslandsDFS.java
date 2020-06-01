package gfg;

import jdk.nashorn.internal.ir.IfNode;

import java.util.*;

/**
 * Created by kuliza-265 on 26/3/17.
 */
public class CountIslandsDFS {
    public static void main(String[] args){
        int[][] arr = new int[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1} };

        //
        // System.out.println(findIslandsCount(arr,5,5));
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-1);
        int[] arr2 = new int[] {3,30,34,5,9};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<arr2.length;i++) list.add(arr2[i]);
        //System.out.println(largestNumber(list));
    }

    private static boolean findWord(String word, char[][] charArray){
        int rowNbr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int colNbr[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        int ROW_MAX = charArray.length;
        int COL_MAX = charArray[0].length;
        for (int i = 0;i<charArray.length;i++){
            for (int j = 0;j<charArray[0].length;j++){
                if (charArray[i][j]==word.toCharArray()[0]){
                    for (int k=0; k<rowNbr.length; k++){
                        if (makeWord(charArray,i,j,rowNbr[k],colNbr[k], word.length(), ROW_MAX, COL_MAX).equalsIgnoreCase(word)) return true;
                    }
                }
            }
        }
        return false;
    }

    private static String makeWord(char[][] chars,int row, int col, int rowDir, int colDir, int length, int ROW_MAX, int COL_MAX) {
        StringBuffer buffer = new StringBuffer();
        for (int i=row,j=col;(i>=0 && i<ROW_MAX) && (j>=0 && j<COL_MAX) && buffer.length()<=length;i+=rowDir,j+=colDir){
            buffer.append(chars[i][j]);
        }
        return buffer.toString();
    }

    private static int findIslandsCount(int[][] arr, int row_max, int col_max) {
        boolean[][] visited = new boolean[row_max][col_max];
        int count = 0;
        for (int i=0;i<row_max;i++){
            for (int j = 0 ;j<col_max;j++){
                if (!visited[i][j] && arr[i][j]==1){
                    count++;
                    DFS(arr,i,j,row_max,col_max,visited);
                }else {
                    visited[i][j] = true;
                }
            }
        }
        return count;
    }

    private static void DFS(int[][] arr, int row, int column, int row_max, int col_max, boolean[][] visited) {
        visited[row][column] = true;
        int[] rowPath = {0,0,-1,1};
        int[] colPath = {-1,1,0,0};
        for (int i=0;i<rowPath.length;i++){
            if (checknNeighbour(arr,row+rowPath[i], column+colPath[i], row_max, col_max, visited)){
                DFS(arr, row+rowPath[i], column+colPath[i], row_max, col_max, visited);
            }
        }
    }

    private static boolean checknNeighbour(int[][] arr, int row, int column, int row_max, int col_max, boolean[][] visited) {
        return row>=0&&column>=0&&row<row_max&&column<col_max&&!visited[row][column]&&arr[row][column]==1;
    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> tempResult = new ArrayList<>();
        long maxCount = Integer.MIN_VALUE, countCurrent = 0;
        for (int i=0;i<a.size();i++){
            if (a.get(i)>=0){
                countCurrent+=a.get(i);
                tempResult.add(a.get(i));
            }
            if (a.get(i)<0){
                if (maxCount<countCurrent || (maxCount==countCurrent && tempResult.size()>result.size())){
                    maxCount = countCurrent;
                    result.clear();
                    result.addAll(tempResult);
                }
                countCurrent = 0;
                tempResult.clear();
            }
        }
        if (maxCount<countCurrent || (maxCount==countCurrent && tempResult.size()>result.size())){
            result.clear();
            result.addAll(tempResult);
        }
        return result;
    }

    public static ArrayList<Integer> incrementNumber(ArrayList<Integer> a){
        while (a.get(0)==0 && a.size()>1) a.remove(0);
        if (a.get(a.size()-1)<9){
            a.set(a.size()-1,a.get(a.size()-1)+1);
        }else {
            int i;
            for ( i = a.size() - 1; i >= 0 && a.get(i)==9; i--) {
                a.set(i,0);
                if (i==0) {
                    i++;
                    a.add(0,0);
                }
            }

            a.set(i,a.get(i)+1);
        }
        return a;
    }

    public static int firstMissingPositive(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n; i++) {
            if (a.get(i)<=n && a.get(i)>0 && a.get(i).intValue()!=a.get(a.get(i)-1).intValue()){
                Collections.swap(a,i, a.get(i)-1);
                i--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a.get(i).intValue()!=i+1) return i+1;
        }
        return n+1;
    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for (int i =0,j;i<A.size();){
            j = i+1;
            while (j<A.size() && A.get(j)==A.get(i)) j++;
            if (A.get(i)==A.size()-j) return 1;
            i=j;
        }
        return -1;
    }

    public static String largestNumber(final List<Integer> a) {
        for (int i=0;i<a.size();i++) {
            if (a.get(i)!=0) break;
            if (i==a.size()-1) return "0";
        }
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return compareStrings(String.valueOf(o1), String.valueOf(o2));
            }

            private int compareStrings(String str1, String str2) {
                StringBuilder builder1 = new StringBuilder();
                builder1.append(str1).append(str2);
                StringBuilder builder2 = new StringBuilder();
                builder2.append(str2).append(str1);
                return builder2.toString().compareTo(builder1.toString());
            }
        });
        StringBuilder builder = new StringBuilder();
        for (Integer integer:a) builder.append(String.valueOf(integer));
        return builder.toString();
    }


    private static int compareStrings(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int i =0,j=0;
        while (i<s1.length && j<s2.length){
            if (s1[i]>s2[j]) return -1;
            else if (s1[i]<s2[j]) return 1;
            else if (i==s1.length-1 && j==s2.length-1) return 0;
            else {
                if (i<s1.length-1) i++;
                if (j<s2.length-1) j++;
            }
        }
        return 0;
    }

    /**
     * Definition for an interval.
     * public class Interval {
     *     int start;
     *     int end;
     *     Interval() { start = 0; end = 0; }
     *     Interval(int s, int e) { start = s; end = e; }
     * }
     */
    public class Solution {
        public void insert(ArrayList<Interval> intervals, Interval newInterval) {

        }
    }

    public boolean isStringComparable(char[] s1, char[] s2, int first, int second) {
        if (first >= s1.length && second >= s2.length) return true;
        if (s1[first] == s2[second] || s1[first] == '?') return isStringComparable(s1, s2, first + 1, second + 1);
        if (s1[first] == '*' && first + 1 != s1.length && second + 1 == s2.length) return false;
        return s1[first] == '*' && (isStringComparable(s1, s2, first, second + 1) || isStringComparable(s1, s2, first + 1, second));
    }

}
