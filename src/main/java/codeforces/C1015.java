package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.PriorityQueue;

public class C1015 {

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

    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.i(), counter = 0;
        long[] diff = new long[n];
        PriorityQueue<Long> pq = new PriorityQueue<>(n);
        /*long totalSpace = 0, totalCompressSpace = 0,m = sc.l(), a, b;
        for (int i = 0; i < n; i++) {
            a = sc.l();
            b = sc.l();
            pq.add(b-a);
            totalSpace += a;
            totalCompressSpace += b;
        }
        if (totalSpace<=m) out.print("0");
        else if (totalCompressSpace>m) out.print("-1");
        else {
            while (totalSpace>m){
                totalSpace += pq.poll();
                counter++;
            }
            out.print(counter);
        }
        out.flush();*/
        String polyline = "apvmAq~ayMo@Ga@?uDWqBO}@E_AGeAGYCy@E}@IgAEQCu@C_@Ae@Aa@AM?C?S@UDWFG@C@UHYLGBIB[FUDU@A?KAE@UAa@?s@?A?}@?g@?_@CWESCCA[Es@Us@Wc@UYOs@Y[KIAKAKBMBA@]J[FK@I@CAA?A?GAICMEQIIEKEe@UUGSCUAE@WHm@@g@?[?aACYAu@Ao@EUEGAUEQCa@G[KUGIAk@QWKEGGEKMEIOsA_AG";
        decodePoly(polyline);
    }

    private static List<LatLng> decodePoly(String encoded) {
        List<LatLng> poly = new ArrayList<>();
        int index = 0, len = encoded.length();
        int lat = 0, lng = 0;

        while (index < len) {
            int b, shift = 0, result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lat += dlat;

            shift = 0;
            result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lng += dlng;

            LatLng p = new LatLng((((double) lat / 1E5)),
                    (((double) lng / 1E5)));
            poly.add(p);
        }
        for (LatLng latLng : poly) {
            System.out.println(latLng);
        }
        return poly;
    }

    static class LatLng{
        double lat;
        double lng;

        LatLng(double lat, double lng) {
            this.lat = lat;
            this.lng = lng;
        }

        @Override
        public String toString() {
            return lat + ", " + lng;
        }
    }


}
