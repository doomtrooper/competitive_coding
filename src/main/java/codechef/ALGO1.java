package codechef;

import codeforces.A71;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class ALGO1 {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        Reader sc=new Reader();
        int t=sc.i(), n;
        int head = 0, tail = 0, maxLength = 0;
        long[] arr = new long[10^5];
        long[] arrMin = new long[10^5];
        for (int i = 0; i < t; i++) {
            n = sc.i();
            for (int j = 0; j < n; j++) {
                arr[j] = sc.l();
            }
            calculateMin(arr, arrMin, n);
            head = 0;
            tail = 0;
            maxLength = 0;
            for (int j = 0; j < n && head >= tail; j++) {
                if (arr[tail]>arr[head] &&  head-tail+1 > maxLength)  maxLength = head-tail+1;
                if (head < n-1 && arrMin[head+1]<=arr[tail]) head +=1;
                else {
                    tail += 1;
                    head = Math.max(head, tail);
                }
            }
            out.println(maxLength);
            out.flush();
        }
    }

    private static void calculateMin(long[] arr, long[] arrMin, int n) {
        long min = arr[n];
        for (int i = n-1; i >= 0; i--) {
            if (arr[i]<min) {
                min = arr[i];
                arrMin[i] = min;
            }
        }
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
