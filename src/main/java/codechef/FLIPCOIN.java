package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kuliza-265 on 23/3/17.
 */
class FLIPCOIN {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();
        boolean[] coins = new boolean[n];
        List<Integer> list = new ArrayList<>();
        while (q-->0){
            int op = in.nextInt(), a = in.nextInt(), b = in.nextInt();
            if (op==0){
                for (int i=a;i<=b;i++) {
                    if (list.contains(i)) list.remove(new Integer(i));
                    else list.add(i);
                }
            }else {
                int count=0;
                for (Integer item:list) if (item >=a && item <=b) count++;
                System.out.println(count);
            }
        }
    }
}
