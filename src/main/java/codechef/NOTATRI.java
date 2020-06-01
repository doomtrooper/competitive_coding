package codechef;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by kuliza-265 on 10/3/17.
 */
public class NOTATRI {

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        while (true){
            int n = Reader.nextInt();
            if (n<=0) break;
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = Reader.nextInt();
            }
            Arrays.sort(arr);
            int count = 0,i=0,j=0,k=0;
            for (i=n-1;i>1;i--){
                k=0;
                j=i-1;
                while (j>k){
                    if (arr[i]>arr[j]+arr[k]){
                        count+=j-k;
                        k++;
                    }else {
                        j--;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
