package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by kuliza-265 on 10/3/17.
 */
class MARCHA1 {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt();
        while (n>0){
            n--;
            int noteCount = Reader.nextInt();
            int demand = Reader.nextInt();
            int[] noteArray = new int[noteCount];
            for (int i =0;i<noteCount;i++){
                noteArray[i] = Reader.nextInt();
            }
            int sum = 0;
            for (int i =0;i<Math.pow(2,noteCount);i++){
                sum=0;
                if (demand==0) break;
                for (int j = 0;j<noteCount;j++){
                    if (((i>>j)&1)==0) sum += noteArray[j];
                }
                if (sum==demand) break;
            }
            System.out.println((demand==0 || sum==demand)?"YES":"NO");
        }
    }
}