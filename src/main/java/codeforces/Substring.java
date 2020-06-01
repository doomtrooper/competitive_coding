package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Substring {

    static int SmallesSubString(String S) {
        int n = S.length();
        int distCount = 0;
        final int MAX_CHARS = 256;
        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i=0; i<n; i++)
        {
            if (!visited[S.charAt(i)])
            {
                visited[S.charAt(i)] = true;
                distCount++;
            }
        }
        int start = 0, startIndex = -1;
        int minLen = Integer.MAX_VALUE;

        int count = 0;
        int[] currCount =  new int[MAX_CHARS];
        for (int j=0; j<n; j++) {
            currCount[S.charAt(j)]++;
            if (currCount[S.charAt(j)] == 1 ) count++;

            if (count == distCount) {
                while (currCount[S.charAt(start)] > 1)
                {
                    if (currCount[S.charAt(start)] > 1)
                        currCount[S.charAt(start)]--;
                    start++;
                }
                int lenWindow = j - start + 1;
                if (minLen > lenWindow) minLen = lenWindow;
            }
        }
        return minLen;
    }


    public static String Solve(int N){
        int count = 0, i = 1, j =0;
        while (count<N){
            count+=Math.pow(2, i++);
        }
        StringBuilder builder = new StringBuilder(i+1);
        while (j<=i) {
            builder.append("4");
            j++;
        }
        //int rem = Math.pow(2, )
        return "";

    }

    public static void main(String args[]) {
        String str = "aabc";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(0);

        System.out.println(number_of_cycles(list));
    }

    public static int CountNaturalNumber(int n) {
        int result = 0;
        for (int i = 1; i <= 9; i++) {
            Stack<Integer> stack = new Stack<>();
            if (i <= n) {
                stack.push(i);
                result++;
            }
            while (!stack.empty()) {
                int tp = stack.pop();
                for (int j = tp%10; j <= 9; j++)
                {
                    int x = tp*10 + j;
                    if (x <= n) {
                        stack.push(x);
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static int maximum_cookies(ArrayList<Integer> arr){
        int[] mem = new int[arr.size()];
        if (arr.size()==0) return 0;
        for (int i = 0; i < mem.length; i++) {
            mem[i] = -1;
        }
        return maximum_cookiesUtil(arr, arr.size()-1, mem);
    }

    private static int maximum_cookiesUtil(ArrayList<Integer> arr, int i, int[] mem) {
        if (i==0) return arr.get(0);
        if (i==1) return Math.max(arr.get(0), arr.get(1));
        if (mem[i]!=-1) return mem[i];
        mem[i] = Math.max(maximum_cookiesUtil(arr, i-1, mem), maximum_cookiesUtil(arr, i-2, mem) + arr.get(i));
        return mem[i];
    }

    static int can_give_change(List<Integer> rupee_notes) {
        int count_five =0;
        int count_ten= 0;

        for(int i=0; i< rupee_notes.size(); i++){
            if(rupee_notes.get(i)==5){
                count_five++;
            }
            else if (rupee_notes.get(i)==10){
                if(count_five ==0){
                    return i+1;
                }
                else{
                    count_five--;
                    count_ten++;
                }
            }
            else if(rupee_notes.get(i)==20){
                if(count_five>=3){
                    count_five= count_five-3;
                }
                else if(count_five>=1 && count_ten>=1){
                    count_five--;
                    count_ten--;
                }
                else{
                    return i+1;
                }
            }
        }

        return 0;

    }

    static int number_of_cycles(List<Integer> arr) {
        int cycles = 0;
        int[] v = new int[arr.size()];
        int[] temp = new int[arr.size()];
        int k=0;
        for (int i = 0; i < arr.size(); i++) {
            k=0;
            if (v[i] == 0) {
                v[i] = 1;
                int j = arr.get(i);
                if (i == j) {
                    v[i] = 1;
                    cycles++;
                } else {
                    while (v[j] == 0) {
                        v[j] = 1;
                        temp[k]=j;
                        k++;
                        j = arr.get(j);
                    }
                    if(j==i) {
                        cycles++;
                    }
                    else{

                    }
                }
            }
        }
        return cycles;
    }
}
