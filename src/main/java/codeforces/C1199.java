package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class C1199 {
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

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        Reader sc = new Reader();
        int n = sc.i(), I = sc.i();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.i();
        int maxK = (int) Math.pow(2, (8 * I) / n);
        int k = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) if (arr[i] != arr[i - 1]) k++;
        if (k <= maxK) out.println(0);
        else {
            int counter = 0, countFront = 1, countBack = 1;
            int i = 0, j = arr.length - 1;
            for (; i < arr.length - 1 && arr[i] == arr[i + 1]; i++) countFront++;
            for (; j > 0 && arr[j] == arr[j - 1]; j--) countBack++;
            while (maxK < k && i < j) {
                if (countBack > countFront) {
                    counter += countFront;
                    for (i++, countFront = 1; i < arr.length - 1 && arr[i] == arr[i + 1]; i++) countFront++;
                } else {
                    counter += countBack;
                    for (j--, countBack = 1; j > 0 && arr[j] == arr[j - 1]; j--) countBack++;
                }
                k--;
            }
            out.println(counter);
        }
        out.flush();
    }
}
