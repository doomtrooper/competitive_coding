package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class B1 {

    // TODO: 2019-08-15 To be solved....

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        Reader sc = new Reader();
        int n = sc.i();
        for (int i = 0; i < n; i++) {
            String str = sc.s();
            out.println(isRoman(str) ? toAlpha(str) : toRoman(str));
        }
        out.flush();
    }

    private static String toRoman(String str) {
        int i = 0;
        while (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') i++;
        int res = 0, mul = 1;
        for (int j = i - 1; j >= 0; j--) {
            res += mul * (str.charAt(j) - 'A' + 1);
            mul *= 26;
        }
        return "R" + str.substring(i) + 'C' + res;
    }

    private static String toAlpha(String str) {
        int col = Integer.parseInt(str.substring(str.lastIndexOf('C') + 1));
        StringBuilder builder = new StringBuilder();
        while (col > 0) {
            if (col%26==0) builder.append('Z');
            else builder.append((char) (col % 26 + 'A' -1));
            col /= 26;
        }
        builder.reverse().append(str, 1, str.lastIndexOf('C'));
        return builder.toString();
    }

    private static boolean isRoman(String str) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'R') {
                if (str.charAt(i + 1) <= '9' && str.charAt(i + 1) >= '1'){
                    for (int j = i+2; j < str.length(); j++) {
                        if (str.charAt(j)=='C') return true;
                    }
                }
            }
        return false;
    }

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
