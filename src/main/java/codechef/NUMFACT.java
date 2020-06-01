package codechef;

import java.util.*;

/**
 * Created by kuliza-265 on 21/3/17.
 */
class NUMFACT {

    static int m =(int)1e6+1;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean[] primes = new boolean[m];
        Arrays.fill(primes,true);
        generatePrimes(primes);
        while (t-->0){
            int n = in.nextInt();
            Map<Integer,Integer> factors = new HashMap<>();
            for (int i=0;i<n;i++){
                int x = in.nextInt();
                findPrimeFactors(x , primes, factors);
            }
            long total = 1;
            for (Map.Entry<Integer, Integer> entry : factors.entrySet()) {
                total*=(entry.getValue()+1);
            }
            System.out.println(total);
        }
    }

    private static void findPrimeFactors(int num, boolean[] primes, Map<Integer, Integer> factors) {
        int maxLoop =num;
        for (int i = 2; i <= maxLoop; i++) {
            if (primes[i] && num%i==0) {
                factors.put(i, factors.get(i) != null ? factors.get(i) + 1 : 1);
                num/=i;
                i--;
            }
        }
    }

    private static void generatePrimes(boolean[] primes) {
        primes[0] = false;
        primes[1] = false;
        for (int i=2;i<primes.length;i++){
            if (isPrime(i)) {
                for (int j = i*i;j<primes.length && j>0;j+=i){
                    primes[j]=false;
                }
            }
        }
    }

    private static boolean isPrime(int prime){
        for (int i = 2; i<=Math.sqrt(prime);i++){
            if (prime%i==0) return false;
        }
        return true;
    }
}


