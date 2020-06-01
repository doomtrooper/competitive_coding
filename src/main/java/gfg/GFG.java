package gfg;

import java.util.Arrays;
import java.util.LinkedList;

public class GFG {

    public static void main(String[] args) throws Exception {
        //permutation("aac");
        Object lock = new Object();
        Thread t1 = new Thread(new PrintEvenThread(lock, 11, 2));
        Thread t2 = new Thread(new PrintOddThread(lock, 11, 1));
        t1.start();
        t2.start();
    }

    private static void permutation(String str){
        permutationUtil(str, 0, str.length()-1);
    }

    private static void permutationUtil(String str, int l, int r) {
        if (l==r) System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutationUtil(str, l+1, r);
                str = swap(str, i, l);
            }
        }
    }

    private static String swap(String str, int l, int i) {
        char[] chars = str.toCharArray();
        char temp = chars[l];
        chars[l] = chars[i];
        chars[i] = temp;
        return String.valueOf(chars);
    }

    public boolean hasCycle(int v, LinkedList<Integer>[] alist, boolean[] visited, boolean[] explored) {
        // add code here.
        for (int i = 0; i < v; i++) {
            if (hasCycleUtil(i, alist, visited, explored)) return true;
        }
        return false;
    }

    private boolean hasCycleUtil(int vertex, LinkedList<Integer>[] list, boolean[] visited, boolean[] explored) {
        if (explored[vertex]) return true;
        explored[vertex] = true;
        visited[vertex] = true;
        for (int i = 0; i < list[vertex].size(); i++) {
            if (hasCycleUtil(list[vertex].get(i), list, visited, explored)) return true;
        }
        explored[vertex] = false;
        return false;
    }
}
