package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class C519 {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        Reader sc = new Reader();
        int n = sc.i(), m = sc.i();
        int teams = countTeams2(n, m);
        out.println(teams);
        out.flush();
    }

    private static int countTeams2(int xp, int nb) {
        int count = 0;
        while (xp + nb > 2 && xp > 0 && nb > 0) {
            if (xp > nb) {
                xp -= 2;
                nb -= 1;
            } else {
                nb -= 2;
                xp -= 1;
            }
            count++;
        }
        return count;
    }

    private static int countTeams(int xp, int nb) {
        int[][] dp = new int[xp + 1][nb + 1];
        for (int i = 0; i <= xp; i++) Arrays.fill(dp[i], -1);
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[1][1] = 0;
        dp[1][0] = 0;
        return countTeamsUtil(xp, nb, 0, dp);
    }

    private static int countTeamsUtil(int xp, int nb, int count, int[][] dp) {
        if (xp < 1 || nb < 1 || (nb == 1 && xp == 1)) return count;
        if (dp[xp][nb] != -1) return dp[xp][nb];
        dp[xp][nb] = Math.max(countTeamsUtil(xp - 2, nb - 1, count + 1, dp),
                countTeamsUtil(xp - 1, nb - 2, count + 1, dp));
        return dp[xp][nb];
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
