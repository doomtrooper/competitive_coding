package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class C580 {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        Reader sc = new Reader();
        int n = sc.i(), m = sc.i();
        TreeNode[] list = new TreeNode[n];
        for (int i = 0; i < n; i++) list[i] = new TreeNode(sc.i());
        for (int i = 0; i < n - 1; i++) {
            int x = sc.i() - 1, y = sc.i() - 1;
            list[y].nodes.add(list[x]);
            list[x].nodes.add(list[y]);
        }
        removeExtraEdges(list[0]);
        int restaurants = findRestaurantsUtil(list[0], m, 0);
        out.println(restaurants);
        out.flush();
    }

    private static void removeExtraEdges(TreeNode treeNode) {
        for (int i = 0; i < treeNode.nodes.size(); i++) {
            treeNode.nodes.get(i).nodes.remove(treeNode);
            removeExtraEdges(treeNode.nodes.get(i));
        }
    }


    private static int findRestaurantsUtil(TreeNode treeNode, int m, int curCatCount) {
        if (curCatCount > m) return 0;
        if (treeNode.nodes.isEmpty()) {
            curCatCount += treeNode.hasCat;
            return (curCatCount > m) ? 0 : 1;
        }
        int count = 0;
        if (treeNode.hasCat==0) curCatCount = 0;
        else curCatCount++;
        for (int i = 0; i < treeNode.nodes.size(); i++) {
            count += findRestaurantsUtil(treeNode.nodes.get(i), m, curCatCount);
        }
        return count;
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

    static class TreeNode {
        int hasCat;
        ArrayList<TreeNode> nodes = new ArrayList<>();
        TreeNode(int hasCat) {
            this.hasCat = hasCat;
        }
    }
}
