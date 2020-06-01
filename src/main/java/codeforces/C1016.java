package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class C1016 {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        int n = sc.i();
        long[][] glades = new long[n][2];
        for (int i = 0; i < n; i++) {
            glades[i][0] = sc.l();
        }
        for (int i = 0; i < n; i++) {
            glades[i][1] = sc.l();
        }
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        out.println(getMaxWeightMushroom(glades, n));
    }

    private static long getMaxWeightMushroom(long[][] glades, int n) {
        int[] row = {0, -1, 0, 1}, col = {-1,0,1, 0};
        boolean[][] visited = new boolean[n][2];
        return getMaxWeightMushroomUtil(glades, 0, 0, 0,0);
    }

    private static long getMaxWeightMushroomUtil(long[][] glades, int row, int col, int time, long curWeight) {
        int[] rowSet = {0, -1, 0, 1}, colSet = {-1,0,1, 0};
        for (int i = 0; i < rowSet.length; i++) {

        }
        return 0;
    }


    static class Reader
    {
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public Reader() { this(System.in); }public Reader(InputStream is) { mIs = is;}
        public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];}
        public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;}
        public String s(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();}
        public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;}
        public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;}
        public double d() throws IOException {return Double.parseDouble(s()) ;}
        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; }
        public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; }
        public int[] arr(int n){int[] ret = new int[n];for (int i = 0; i < n; i++) {ret[i] = i();}return ret;}
    }

}
