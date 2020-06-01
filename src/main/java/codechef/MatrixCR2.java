package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Created by nischal.k on 02/10/16.
 */
class MatrixCR2 {


    public static void main(String[] args) throws Exception {

        Reader.init(System.in);
        int n = Reader.nextInt();
        long ans = printPattern(n);
        System.out.println(ans);
//            Scanner sc = new Scanner(System.in);
//            String s;
//            try {
//                while (!(s = sc.nextLine()).equals("")) {
//                    System.out.println(solution(s));
//                }
//            }catch (Exception e) {
//                return;
//            }
//        Reader.init(System.in);
//        int n =Reader.nextInt();
//        int[] ar= new int[n];
//        for (int i = 0; i <n; i++) {
//            ar[i]=Reader.nextInt();
//        }
//        int k = Reader.nextInt();
//        int sol = countSubarrays(ar, ar.length,k);
//        long sol = beautifulSubarrays(ar, k);
//        int sol = bruteCountSubarrays(ar, ar.length, k);
//        System.out.println(sol);
//        System.out.println(solSet.size());
    }


    static int modulo =1000000000+7;
    static long printPattern(int n) {
        long total = nCrModp(n*n, n+2, modulo);
        long c= nCrModp(n*(n-1), 2,modulo);
        long sub=((c*4)%modulo-(subVal9(n)))%modulo;
        long total4=(4*total)%modulo;
        long subNFac= (longfact(n)*sub)%modulo;
        return  (((((total4-subNFac)%modulo))/4)+modulo)%modulo;
    }

    static long longfact(int n) {
        long val= 1;
        for (int i = 2; i <= n; i++) {
            val = (val*i)%modulo;
        }
        return val%modulo;
    }

    static long subVal9(int n) {
        return (n*(n-1))%modulo;
    }

    // Returns nCr % p
    static long nCrModp(long n, int r, long p)
    {
        // The array C is going to store last
        // row of pascal triangle at the end.
        // And last entry of last row is nCr
        long C[]=new long[r+1];
        Arrays.fill(C,0);

        C[0] = 1; // Top row of Pascal Triangle

        // One by constructs remaining rows of Pascal
        // Triangle from top to bottom
        for (int i = 1; i <= n; i++)
        {
            // Fill entries of current row using previous
            // row values
            for (int j = Math.min(i, r); j > 0; j--)

                // nCj = (n-1)Cj + (n-1)C(j-1);
                C[j] = (C[j] + C[j-1])%p;
        }
        return C[r];
    }




    static class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        /**
         * call this method to initialize reader for InputStream
         */
        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");

        }

        /**
         * get next word
         */
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
//            TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}


