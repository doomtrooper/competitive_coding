package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;









import java.io.*;
import java.util.*;


public class Sirion975 {
    private static char[] vowel = {'a','e','i','o','u' };
    private static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());

            int out_ = solve(n);
            System.out.println(out_);
            System.out.println("");
        }

        wr.close();
        br.close();
    }
    static int solve(int n){
        long sum = 0;
        for (int i = 0; i < vowel.length; i++) {
            sum = (sum+ (findNum(n, i,1)%mod))%mod;
        }
        return (int)(sum%mod);
    }
    private static long findNum(int n, int last, int index) {
        if (index==n) return 1;
        long count =0 ;
        for (int i = last; i < vowel.length; i++) {
            count += findNum(n, i, index+1);
        }
        return count;
    }


}