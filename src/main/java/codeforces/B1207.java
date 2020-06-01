package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class B1207 {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        Reader sc = new Reader();
        int n = sc.i(), m = sc.i();
        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];
        int[] rowDir1 = {-1, 0, 0, -1};
        int[] colDir1 = {-1, -1, 0, 0};
        int[] rowDir2 = {-1, 0, 0, -1};
        int[] colDir2 = {0, 0, 1, 1};
        int[] rowDir3 = {0, 1, 1, 0};
        int[] colDir3 = {-1, -1, 0, 0};
        int[] rowDir4 = {0, 1, 1, 0};
        int[] colDir4 = {0, 0, 1, 1};
        int[][] row = {rowDir1, rowDir2, rowDir3, rowDir4};
        int[][] col = {colDir1, colDir2, colDir3, colDir4};
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                arrA[i][j] = sc.i();
            }
        int count = 0;
        boolean bool = false;
        ArrayList<Pair> pairs = new ArrayList();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arrA[i][j] != arrB[i][j]) {
                    bool = false;
                    for (int k = 0; k < 4; k++) {
                        if (isValid(i, j, row[k], col[k], n, m, arrB, arrA)) {
                            pairs.add(new Pair(i + row[k][0], j + col[k][0]));
                            count++;
                            bool = true;
                            break;
                        }
                    }
                    if (!bool) {
                        out.println(-1);
                        out.flush();
                        return;
                    }
                }
            }
        }
        out.println(count);
        for (int i = 0; i < count; i++) {
            out.printf("%s %s\n",pairs.get(i).x+1, pairs.get(i).y+1);
        }

        out.flush();
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean isValid(int x, int y, int[] rowDir, int[] colDir, int n, int m, int[][] arr, int[][] arrA) {
        for (int i = 0; i < rowDir.length; i++) {
            if (x + rowDir[i] < 0 || x + rowDir[i] >= n) return false;
            if (y + colDir[i] < 0 || y + colDir[i] >= m) return false;
            if (arrA[x + rowDir[i]][y + colDir[i]] != 1) return false;
        }
        for (int i = 0; i < rowDir.length; i++) {
            arr[x + rowDir[i]][y + colDir[i]] = 1;
        }
        return true;
    }

    //public static boolean fillArray(int x, int y, int[] rowDir, int[] colDir, int n, int m, int[][] arr)

    static class Reader {
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar, numChars;

        public Reader() {
            this(System.in);
        }

        public Reader(InputStream is) {
            mIs = is;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String s() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public long l() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int i() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double d() throws IOException {
            return Double.parseDouble(s());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int[] arr(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = i();
            }
            return ret;
        }
    }
}
