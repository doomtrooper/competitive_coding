package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class Greedy {
    public static void main(String[] args) throws Exception {
        int[] arr = {-1, -2, -3, -4, -5};
        System.out.println(maxprod(toList(arr)));
    }

    private static int maxprod(ArrayList<Integer> list){
        Collections.sort(list);
        int n = list.size();
        int max1 = list.get(0)*list.get(1);
        int max2 = list.get(n-2)*list.get(n-1);
        int n3 = max1>max2?list.get(n-1):list.get(n-3);
        return Math.max(max1,max2)*n3;
    }

    private static ArrayList<Integer> toList(int[] arr){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
