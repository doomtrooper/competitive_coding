package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by kuliza-265 on 18/3/17.
 */
class PRIME1 {

    private static int MAX = 1000000000;
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int[] primes = new int[(int)Math.sqrt(1000000000)+1];
        generatePrimes(primes);
        int t = Reader.nextInt();
        while (t-->0){
            int lower = Reader.nextInt(), higher = Reader.nextInt();
            printPrimes(lower,higher, primes);
        }
    }

    private static void printPrimes(int lower, int higher, int[] primes) {
        //for (int i = primes[])
    }

    private static void generatePrimes(int[] primes) {
        boolean[] nums = new boolean[MAX];
        Arrays.fill(nums, true);
        for (int i=2;i<=Math.sqrt(MAX);i++){
            if (nums[i]==false) continue;
            for (int j=i;j<MAX;j+=i){
                nums[j] = false;
            }
        }
        for (int i=2,k=0;i<MAX;i++) if (nums[i]) primes[k++] = i;
    }

    private static boolean isPrime(int prime){
        for (int i = 2; i<=Math.sqrt(prime);i++){
            if (prime%i==0) return false;
        }
        return true;
    }
}

class Reader {
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

    static String readLine() throws IOException {
        return reader.readLine();
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
