package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println(minSteps(2));
        //tNodesAway();
        TreeNode treeNode = new TreeNode(10);
        //TreeNode node = flattenTree(treeNode);
        //Iterator iterator = new Iterator(treeNode);
        //while (iterator.hasNext()) System.out.println(iterator.next().val);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        //TreeNode node = formBST(arr);
        //System.out.println(minDepth(treeNode));
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(8);
        treeNode.left.left = new TreeNode(7);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.left.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(6);
        treeNode.left.right = new TreeNode(5);
        treeNode.left.right.right = new TreeNode(5);
        treeNode.left.right.right.right = new TreeNode(5);
        treeNode.left.right.right.right.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(4);
        //invertTree(treeNode);
        //levelOrder(treeNode);
        //System.out.println(diameter(treeNode));
        ListNode node = new ListNode(2);
        node.next = new ListNode(3);
        node.next.next = new ListNode(4);
        node.next.next.next = new ListNode(5);
        node.next.next.next.next = new ListNode(6);
        node.next.next.next.next.next = new ListNode(7);
        //ListNode temp = reverseK(node,3);

        int[] arr2 = {2 , 3, 4, 12, 2, 4, 9};
        //System.out.println(maximum_cookies(arr2));
        int[] sum = findSum(arr2, 96);
        //System.out.println(Arrays.toString(sum));
        int[] arrays = new int[]{1,2,3,4};
        //
        // System
        // .out.println(binarySearch(arrays, 6, 0, arrays.length-1));
        //System.out.println(solution(arrays, 1));
        String[] res = new String[] {"Alex","Harry", "Michael","Mary", "Alex","Harry", "Michael"};
        System.out.println(sol(res));
        subsequence("abc");
        System.out.println(sol(res));
    }

    static HashSet<String> st = new HashSet<>();

    // It computes all the possible substring that
    // starts with vowel and end with consonent
    static void subsequence(String str)
    {
        String str_sub = null;
        // iterate over the entire string
        for (int i = 0; i < str.length(); i++) {

            // test ith character for vowel
            if (isVowel(str.charAt(i))) {

                // if the ith character is vowel
                // iterate from end of the string
                // and check for consonant.
                for (int j = (str.length() - 1); j >= i; j--) {

                    // test jth character for consonant.
                    if (isConsonant(str.charAt((j)))) {

                        // once we get a consonant add it to
                        // the hashset
                        str_sub = str.substring(i, j + 1);
                        if (st.size()==0)st.add(str_sub);

                        // drop each character of the substring
                        // and recur to generate all subsquence
                        // of the substring
                        for (int k = 1; k < str_sub.length() - 1; k++) {
                            StringBuffer sb = new StringBuffer(str_sub);
                            sb.deleteCharAt(k);
                            subsequence(sb.toString());
                        }
                    }
                }
            }
        }
    }

    // Utility method to check vowel
    static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u');
    }

    // Utility method to check consonant
    static boolean isConsonant(char c)
    {
        return !(c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u');
    }


    public static String sol(String[] votes){
        Map<String, Integer> res = new TreeMap<>();
        for (String vote : votes) {
            res.put(vote, res.getOrDefault(vote, 0) + 1);
        }
        int max = 0;
        String result = null;
        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            if (res.get(entry.getKey())>=max){
                result = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println((String) res.keySet().toArray()[res.size()-1]);
        String rses = (String) res.keySet().toArray()[res.size()-1];
        return result;
    }

    private static int val = 0;

    public static int solution(int[] arr, int k){
        Integer integer = new Integer(0);
        solutionUtil(arr, 0, k, integer,0);
        return val;
    }



    private static void solutionUtil(int[] arr, int i, int K, Integer value, int curCount) {
        if (i>=arr.length) return;
        if (arr[i]%2!=0) {
            curCount++;
            //solutionUtil(arr, i+1, K, value, curCount);
        }
        if (curCount<=K) val++;
        solutionUtil(arr, i+1, K, value, curCount);
        solutionUtil(arr, i+1, K, value, 0);
    }

    private static int binarySearch(int[] arr, int n, int low, int high) {
        if (low==high || low>high) {
            if (arr[low]==n) return low;
            if (low==arr.length-1) return -1;
            if (n>arr[low]) return low+1;
            else return low+1;
        }
        int mid = low + (high-low)/2;
        if (arr[mid]==n) return mid;
        if(arr[mid]>n) return binarySearch(arr, n, low, mid-1);
        return binarySearch(arr, n, mid+1, high);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static int[] findSum(int[] arr, int sum){
        int[] res = new int[2];
        int start=0, end=0, curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum>sum){
                while (curSum>sum) curSum -= arr[start++];
            }
            if (curSum==sum) {
                end = i;
                break;
            }
        }
        res[0] = start;
        res[1] = end;
        return res;
    }

    public static int maxSum(int[] arr){
        int maxSum = 0, curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum<=0) curSum = 0;
            else maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    public static ListNode reverse(ListNode node){
        ListNode prev = null, cur = node, next;
        while (cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur =  next;
        }
        return prev;
    }

    private static ListNode reverseK(ListNode root, int k){
        int count;
        ListNode node, temp = root, NEXT, slow = null;
        while (temp!=null){
            count = k;
            node = temp;
            while (--count>0){
                temp = temp.next;
            }
            NEXT = temp.next;
            if (slow!=null) slow.next = reverseKUtil(node, k, NEXT);
            else root = reverseKUtil(node, k, NEXT);
            slow = node;
            temp = NEXT;
        }
        return root;
    }

    private static ListNode reverseKUtil(ListNode node, int k, ListNode NEXT) {
        ListNode prev = null, cur = node, next;
        while (k-->0){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        node.next = NEXT;
        return prev;
    }

    private static int diameter(TreeNode node){
        if (node==null) return 0;
        return diameterUitl(node, new Height(0));
    }

    private static int diameterUitl(TreeNode node, Height height) {
        if (node==null) return 0;
        int rD, lD;
        Height rH = new Height(0), lH = new Height(0);
        rD = diameterUitl(node.right, rH);
        lD = diameterUitl(node.left, lH);
        height.height = Math.max(lH.height, rH.height)+1;
        return Math.max(Math.max(rD, lD), rH.height+lH.height+1);
    }

    static class Height{
        int height;

        public Height(int height) {
            this.height = height;
        }
    }

    private static int[] dijkstra(int[][] graph, int source){
        boolean[] sptSet = new boolean[graph.length];
        int[] dist = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[source] = 0;
        int curV;
        for (int i = 0; i < graph.length; i++) {
            curV = findMinIndex(dist, sptSet);
            sptSet[curV] = true;
            for (int j = 0; j < graph.length; j++) {
                if (graph[curV][j]==1 && !sptSet[j]){
                    dist[j] = Math.min(dist[j], dist[curV]+1);
                }
            }
        }
        return dist;
    }

    private static int findMinIndex(int[] dist, boolean[] sptSet){
        int min = Integer.MAX_VALUE, res = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!sptSet[i] && dist[i]<min) {
                min = dist[i];
                res = i;
            }
        }
        return res;
    }

    private static void tNodesAway() throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int e = Reader.nextInt();
        int[][] graph = new int[n][n];
        int u,v;
        for (int i = 0; i < e; i++) {
            u = Reader.nextInt();
            v = Reader.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        int c = Reader.nextInt(), s, t;
        for (int i = 0; i < c; i++) {
            s = Reader.nextInt();
            t = Reader.nextInt();
            System.out.println(tNodesAwayUtil(graph, s, t));
        }

    }

    private static int tNodesAwayUtil(int[][] graph, int s, int t) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s]= true;
        while (!queue.isEmpty()){
            int count = queue.size();
            if (t==0) return count;
            while (count>0){
                Integer temp = queue.poll();
                for (int i = 0; i < graph[temp].length; i++) {
                    if (graph[temp][i]!=0 && !visited[i]){
                        queue.add(i);
                        visited[i] = true;
                    }
                }
                count--;
            }
            t--;
        }
        return 0;
    }

    private static int minSteps(int des){
        return minStepsUtil(Math.abs(des), 0, 0);
    }

    private static int minStepsUtil(int des, int lastStep, int pos) {
        if (Math.abs(pos)>des) return Integer.MAX_VALUE;
        int curStep = lastStep+1;
        if (des==pos+curStep || des==pos-curStep) return curStep;
        return Math.min(minStepsUtil(des, curStep, pos+curStep), minStepsUtil(des, curStep, pos-curStep));
    }

    static class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        /**
         * call this method to initialize reader for InputStream
         */
        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");

        }

        static String readLine() throws IOException {
            return reader.readLine();
        }

        /**
         * get next word
         */
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
//            TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

}
