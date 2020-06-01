package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Created by kuliza-265 on 10/3/17.
 */
class MAXDIFF {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int t = Reader.nextInt();
        while (t>0){
            t--;
            int n = Reader.nextInt(), k= Reader.nextInt();
            int[] arr = new int[n];
            for (int i =0;i <n;i++){
                arr[i] = Reader.nextInt();
            }
            Arrays.sort(arr);
            int sum1=0,sum2 = 0,sum=0;
            for (int i =0;i<n;i++){
                sum +=arr[i];
                if (i<k) sum1 +=arr[i];
                if (i>=n-k)sum2+=arr[i];
            }
            System.out.println(Math.max(Math.abs(sum1-(sum-sum1)),Math.abs(sum2-(sum-sum2)))+"");
        }
    }
}



