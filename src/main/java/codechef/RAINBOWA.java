package codechef;

import java.util.Scanner;

public class RAINBOWA {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            boolean result = true;
            int cur = 1, max = 0;
            if (n%2==0){
                for (int i=0;i<n/2;i++) {
                    if (arr[i]!=arr[n-i-1]){
                        result = false;
                        break;
                    }
                    if (!(arr[i]==cur || arr[i]==cur+1)) {
                        result = false;
                        break;
                    }
                    if (max<cur) max = cur;
                    else cur = arr[i];
                }
            }else {
                for (int i=0;i<n/2;i++) if (arr[i]!=arr[n-i-1]) result = false;
            }

            System.out.println(result?"yes":"no");
        }
    }
}
