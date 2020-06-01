package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Character>> in = new ArrayList<>();
        int[][] box = new int[9][10];
        int[][] row = new int[9][10];
        int[][] col = new int[9][10];
        int[] count = new int[9];
        for (int i = 0; i < 9; i++) {
            ArrayList<Character> arr = new ArrayList<>();
            String ch = sc.next();
            char[] c = ch.toCharArray();
            for (int j = 0; j < 9; j++) {
                arr.add(c[j]);
            }
            in.add(arr);
        }
        for (int i = 0; i < in.size(); i++) {
            for (int j = 0; j < in.size(); j++) {
                if (in.get(i).get(j) != '.') {
                    count[i]++;
                    row[i][in.get(i).get(j) - '0'] = 1;
                    col[j][in.get(i).get(j) - '0'] = 1;
                    box[3 * (i / 3) + j / 3][in.get(i).get(j) - 48] = 1;
                }

                //System.out.print(in.get(i).get(j));
            }
            //System.out.println();
        }
        sudokuUtil(in, box, row, col, 0, 0);
        for (int i = 0; i < in.size(); i++) {
            for (int j = 0; j < in.get(i).size(); j++) {

                System.out.print(in.get(i).get(j));
            }
            System.out.println();
        }
    }

    private static boolean sudokuUtil(ArrayList<ArrayList<Character>> in, int[][] box, int[][] row, int[][] col, int j, int k) {
        if (k > 8) return true;
        boolean res;
        while (in.get(j).get(k)!='.'){
            if (k<8) k++;
            else {
                k = 0;
                j++;
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (isValid(box, row, col, j, k, i)) {
                char ch = (char) (i + '0');
                in.get(j).set(k, ch);
                row[j][i] = 1;
                col[k][i] = 1;
                box[3 * (j / 3) + k / 3][i] = 1;
                if (k < 8) {
                    res = sudokuUtil(in, box, row, col, j, k+1);
                } else {
                    res = sudokuUtil(in, box, row, col, j+1, 0);
                }
            } else {
                continue;
            }
            if (!res) {
                in.get(j).set(k, '.');
                row[j][i] = 0;
                col[k][i] = 0;
                box[3 * (j / 3) + k / 3][i] = 0;

            } else {
                return true;
            }

        }

        return false;
    }

    private static boolean isValid(int[][] box, int[][] row, int[][] col, int j, int k, int i) {
        return row[j][i] == 0 && col[k][i] == 0 && box[3 * (j / 3) + k / 3][i] == 0;
    }
}
