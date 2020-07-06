package gfg;

import codeforces.A1023;

import java.io.*;
import java.util.*;

public class LongestKUniqueSubstring {
    public static void main(String[] args) {
        utility();
    }

    private static void utility() {
        Reader sc = new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.i();
        for (int i = 0; i < t; i++) {
            String s = sc.s();
            int k = sc.i();
            System.out.println(longestKUniqueSubstring(s, k));
        }
        out.flush();
    }

    private static int longestKUniqueSubstring(String s, int k) {
        if (s.length() < 1) return 0;
        int maxLength = -1, front = 0, rear = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (front < s.length()) {
            map.put(s.charAt(front), map.getOrDefault(s.charAt(front), 0) + 1);
            if (map.size() == k) {
                maxLength = Math.max(maxLength, front - rear + 1);
            } else if (map.size() > k) {
                do {
                    char temp = s.charAt(rear++);
                    if (map.get(temp) == 1) map.remove(temp);
                    else map.put(temp, map.get(temp) - 1);
                } while (map.size() > k);
            }
            front++;
        }
        return maxLength;
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

