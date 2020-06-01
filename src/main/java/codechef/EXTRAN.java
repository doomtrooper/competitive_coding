package codechef;

import java.util.Arrays;

/**
 * Created by kuliza-265 on 4/3/17.
 */
public class EXTRAN {
    public static void main(String[] args) throws Exception{
        Reader.init(System.in);
        int t = Reader.nextInt();
        for(int x=0; x< t; x++) {
            int n = Reader.nextInt();
            long[] arr = new long[n];
            for (int i = 0;i<n;i++){
                arr[i] = Reader.nextLong();
            }
            Arrays.sort(arr);
            for (int i = 1; i<n;i++){
                if (arr[i]-arr[i-1]==0) {
                    System.out.println(arr[i]);
                    break;
                }
                else if (arr[i]-arr[i-1]>1 && i==1) {
                    System.out.println(arr[i-1]);
                    break;
                }
                else if (arr[i]-arr[i-1]>1 && i==n-1) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
