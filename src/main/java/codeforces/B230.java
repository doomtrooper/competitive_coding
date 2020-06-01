package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class B230 {

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
        int n = sc.i();
        boolean[] seive = calculateSeive(1000000);
        for (int i = 0; i < n; i++) {
            double t = sc.d();
            if (t <= 3) out.println("NO");
            else if (isPerfect(t) && !seive[(int) Math.sqrt(t)]) out.println("YES");
            else out.println("NO");
        }
        out.close();
    }

    private static boolean[] calculateSeive(int num) {
        boolean[] arr = new boolean[num + 1];
        List<Integer> primes = new ArrayList<Integer>();
        arr[0] = true;
        arr[1] = true;
        for (int i = 0; i * i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = i * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }
        return arr;
    }

    private static boolean isPerfect(double num) {
        double sqrt = Math.sqrt(num);
        double floor = Math.floor(sqrt);
        return sqrt - floor == 0;
    }

    private static boolean isTPrime(double num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 && num % 3 == 0) return false;
        for (int i = 5; i * i < num; i += 6) {
            if (num % i == 0 && num % (i + 2) == 0) return false;
        }
        return true;
    }
}
