package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * Created by kuliza-265 on 19/3/17.
 */
 class MARBLES {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int t = Reader.nextInt();
        while (t>0){
            t--;
            int n = Reader.nextInt(), k = Reader.nextInt();
            if (k > n/2) {
                k = n - k + 1;
            }
            if (n==k) System.out.println("1");
            else {
                BigInteger integer = BigInteger.ONE;
                for (int i =n-1;i>n-k;i--) {
                    integer = integer.multiply(BigInteger.valueOf(i));
                }
                for (int i=2;i<k;i++) {
                    integer = integer.divide(BigInteger.valueOf(i));
                }
                System.out.println(integer);
            }
        }
    }
}
