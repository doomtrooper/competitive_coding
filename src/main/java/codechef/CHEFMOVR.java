package codechef;

import java.util.Scanner;

public class CHEFMOVR {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int d = in.nextInt();
            int avg, sum = 0, temp;
            int[] arr = new int[d];
            for (int i = 0; i < n; i++) {
                temp = in.nextInt();
                arr[i%d] += temp;
                //sum += temp;
            }
            if (sum%n!=0) System.out.println("-1");
            avg = sum/n;
            int i;
            for (i = 0; i < arr.length; i++) {
                if (arr[i]%avg!=0) {
                    System.out.println("-1");
                    break;
                }
            }
            //if (i==arr.length) System
        }
    }
}
