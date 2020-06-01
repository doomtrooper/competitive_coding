package codeforces;

import java.io.*;
import java.util.*;

public class C1328 {
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

    public static void main(String[] args) {
        Reader sc = new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        long t = sc.l(), n = 0;
        String x = null;
        StringBuilder aBuilder = new StringBuilder();
        StringBuilder bBuilder = new StringBuilder();
        boolean greater = false;
        char[] arr = null;
        for (int i = 0; i < t; i++) {
            greater = false;
            aBuilder.delete(0, aBuilder.length());
            bBuilder.delete(0, bBuilder.length());
            n = sc.l();
            x = sc.s();
            arr = x.toCharArray();
            for (int j = 0; j < n; j++) {
                if (j == 0){
                    switch (arr[j]){
                        case '0':
                            aBuilder.append('2');
                            bBuilder.append('1');
                            greater = true;
                            break;
                        case '1':
                            aBuilder.append('2');
                            bBuilder.append('2');
                            break;
                        case '2':
                            aBuilder.append('1');
                            bBuilder.append('1');
                            break;
                    }
                }else if (greater){
                    switch (arr[j]){
                        case '0':
                            aBuilder.append('0');
                            bBuilder.append('0');
                            break;
                        case '1':
                            aBuilder.append('0');
                            bBuilder.append('1');
                            greater = true;
                            break;
                        case '2':
                            aBuilder.append('0');
                            bBuilder.append('2');
                            break;
                    }
                }else {
                    switch (arr[j]){
                        case '0':
                            aBuilder.append('0');
                            bBuilder.append('0');
                            break;
                        case '1':
                            aBuilder.append('1');
                            bBuilder.append('0');
                            greater = true;
                            break;
                        case '2':
                            aBuilder.append('1');
                            bBuilder.append('1');
                            break;
                    }
                }
            }
            out.println(aBuilder.toString());
            out.println(bBuilder.toString());
        }
        out.flush();
    }
}

