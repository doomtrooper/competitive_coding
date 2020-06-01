package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class B520 {

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
        int m = sc.i();
        if (m == n) out.println(0);
        else if (m < n) out.println(n - m);
        else {
            int res = calculate(n, m, 0, n / 2);
            out.println(res);
        }
        out.close();
    }

    private static int calculate(int n, int m, int count, int minVal) {
        System.out.println("n: " + n + " count: " + count);
        if (n == m) return count;
        if (n > m) return count + (n - m);
        if (n <= minVal) return Integer.MAX_VALUE;
        return Math.min(calculate(n - 1, m, count + 1, minVal), calculate(n * 2, m, count + 1, minVal));
    }

    private static Node graph(int n, int m) {
        Node node = new Node(n);
        graphUtil(n * 2, m, node);
        graphUtil(n - 1, m, node);
        return node;
    }

    private static void graphUtil(int n, int m, Node node) {
        if (n == m) return;
        if (n > m) return;
        if (n <= n / 2) return;
        if (n > 2 * m) return;
        Node temp = new Node(n);
        node.edges.add(temp);
        graphUtil(n * 2, m, temp);
        graphUtil(n - 1, m, temp);
    }

    static class Node {
        int val;
        List<Node> edges = new ArrayList<>();

        public Node(int val) {
            this.val = val;
        }
    }
}
