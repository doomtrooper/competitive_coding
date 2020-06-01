package codechef;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by anand.p on 5/30/17.
 */
class COINS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            System.out.println(getMaxDollars(in.nextInt()));
        }
    }


    private static long getMaxDollars(int i) {
        HashMap<Long, Long> result = new HashMap<>();
        return getMaxDollarsUtil(i, result);
    }

    private static Long getMaxDollarsUtil(long i, HashMap<Long, Long> dp) {
        if (i<12) return i;
        if (!dp.containsKey(i)){
            dp.put(i,Math.max(getMaxDollarsUtil(i/2, dp)+getMaxDollarsUtil(i/3, dp)+getMaxDollarsUtil(i/4, dp),i));
        }
        return dp.get(i);
    }
}
