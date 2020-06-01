package codechef;

import java.util.Scanner;
import java.util.Stack;

 class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int t = 0; t < test_case; t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = longestSubArray(a);
            System.out.println(ans);
        }
    }

    static int longestSubArray(int[] a) {
        if(a.length==1){
            return 1;
        }
        Stack<Integer> minima = new Stack<>();
        minima.add(-1);
        int last = Integer.MAX_VALUE;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < last) {
                last = a[i];
                minima.push(i);
                if (last < a[0])
                    break;
            }
        }
        int j = minima.pop();
        int maxSize = 1;
        int maxStart = 0;
        for (int i = 0; i < a.length; i++) {
            while (j != -1 && (a[i] >= a[j] || j <= i)) {

                if (j - i + 1 > maxSize) {
                    maxSize = j - i + 1;
                    maxStart = i;
                }
                j = minima.pop();

            }
            if (j == -1)
                break;
        }
        if (maxSize == 1)
            return 0;
        return maxSize;
    }
}


