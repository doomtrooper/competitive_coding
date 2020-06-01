package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by kuliza-265 on 18/3/17.
 */
class SPCANDY {
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int t = Reader.nextInt();
        while (t>0){
            long n = Reader.nextLong(), k = Reader.nextLong();
            t--;
            long student = 0, teacher = 0;
            if (k ==0){
                teacher  = n;
            }else {
                student = n/k;
                teacher = n%k;
            }
            System.out.println(student+" "+teacher);
        }
    }
}




