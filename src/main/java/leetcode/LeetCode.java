package leetcode;

import javax.sound.midi.Soundbank;
import java.util.*;

public class LeetCode {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Pair {
        int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }


    public static ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static class MinStack {
        private Stack<Integer> stack = null;
        private Stack<Integer> minValueStack = null;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<Integer>();
            minValueStack = new Stack<Integer>();
        }

        public void push(int x) {
            stack.push(x);
            if (minValueStack.size() != 0) {
                minValueStack.push(minValueStack.peek() > x ? x : minValueStack.peek());
            } else {
                minValueStack.push(x);
            }
        }

        public void pop() {
            stack.pop();
            minValueStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minValueStack.peek();
        }
    }

    class Trie {

        TrieNode root;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new TrieNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            char[] chars = word.toCharArray();
            TrieNode temp = root;
            for (int i = 0; i < word.length(); i++) {
                if (temp.children[chars[i] - 'a'] == null) {
                    temp.children[chars[i] - 'a'] = new TrieNode(chars[i]);
                }
                if (i == word.length() - 1) temp.children[chars[i] - 'a'].isWord = true;
                temp = temp.children[chars[i] - 'a'];
            }
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            char[] chars = word.toCharArray();
            TrieNode temp = root;
            for (int i = 0; i < chars.length; i++) {
                if (temp.children[chars[i] - 'a'] == null) return false;
                if (i == chars.length - 1) return temp.children[chars[i] - 'a'].isWord;
                temp = temp.children[chars[i] - 'a'];
            }
            return false;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            char[] chars = prefix.toCharArray();
            TrieNode temp = root;
            for (int i = 0; i < chars.length; i++) {
                if (temp.children[chars[i] - 'a'] == null) return false;
                temp = temp.children[chars[i] - 'a'];
            }
            return true;
        }
    }

    static class TrieNode {
        char c;
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            this('0');
        }

        public TrieNode(char c) {
            this.c = c;
            children = new TrieNode[50];
            isWord = false;
        }
    }

    static class StockSpanner {
        List<Integer> items = null;
        List<Integer> itemsValues = null;

        public StockSpanner() {
            items = new ArrayList<Integer>();
            itemsValues = new ArrayList<Integer>();
        }

        public int next(int price) {
            items.add(price);
            int counter = 1;
            for (int i = items.size() - 2; i >= 0; ) {
                if (items.get(i) > price) break;
                else {
                    counter += itemsValues.get(i);
                    i -= itemsValues.get(i);
                }
            }
            itemsValues.add(counter);
            return counter;
        }
    }


    public static void main(String[] args) {
        //System.out.println(backspaceCompare("ab##", "c#d#"));
        TreeNode node = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(1);
        node.left = node2;
        node.left.left = node4;
        node.left.left.left = node6;
        node.left.right = node5;
        node.right = node3;
        //System.out.println(kthSmallest(node, 3));
        /*int[][] arr = new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[1][0] = 2;
        arr[1][1] = 3;
        System.out.println(findJudge(3, arr));*/
        //System.out.println(isPerfectSquare(808201));
        /*int[] nums = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(nums));*/
        //System.out.println(removeKdigits("410111", 2));
        /*
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        */
        //head.next.next.next.next.next.next.next = new ListNode(8);
        //System.out.println(oddEvenList(head));
        //System.out.println(findAnagrams("abab", "ab"));
        //System.out.println(frequencySort("abc"));

        /*int[][] A = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] B = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        System.out.println(intervalIntersection(A, B));*/
        //int[] preorder = {15, 13, 12, 18};
        //bstFromPreorder(preorder);

        /*
        int[][] A = {{1, 2, 5},
                {3, 2, 1}};
        System.out.println(minPathSum(A));
        */
        /*int[][] A = {{1, 2}, {1, 3}, {2, 4}};
        System.out.println(possibleBipartition(4, A));*/
        /*int[] cost = {2, 7, 15};
        int[] days = {1, 4, 6, 7, 8, 20};
        System.out.println(mincostTickets(days, cost));*/
        /*int[][] A = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(isBipartite(A));*/
        char[][] arr = {
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'},
        };
        solve(arr);
        System.out.println("abc");
    }

    public static void solve(char[][] board) {
        if (board.length==0 || board[0].length==0) return;
        int[] row = {0, 1, 0, -1};
        int[] col = {1, 0, -1, 0};
        for (int i = 0; i < board[0].length; i++) dfs(board, row, col, 0, i);
        for (int i = 0; i < board.length; i++) dfs(board, row, col, i, board[0].length - 1);
        for (int i = 0; i < board[0].length; i++) dfs(board, row, col, board.length - 1, i);
        for (int i = 0; i < board.length; i++) dfs(board, row, col, i, 0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '#') board[i][j] = 'O';
                else board[i][j] = 'X';
            }
        }
    }

    private static void dfs(char[][] board, int[] rows, int[] cols, int curRow, int curCol) {
        if (isValid(board, curRow, curCol)) {
            board[curRow][curCol] = '#';
            for (int i = 0; i < rows.length; i++) {
                dfs(board, rows, cols, curRow + rows[i], curCol + cols[i]);
            }
        }
    }

    private static boolean isValid(char[][] board, int curRow, int curCol) {
        if (curRow < 0 || curRow >= board.length) return false;
        if (curCol < 0 || curCol >= board[0].length) return false;
        if (board[curRow][curCol] != 'O') return false;
        return true;
    }

    public static boolean isBipartite(int[][] graph) {
        int[] visitedAndColoured = new int[graph.length];
        return grapghBFS(graph, visitedAndColoured);
    }

    private static boolean grapghBFS(int[][] graph, int[] visitedAndColoured) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int cur, temp;
        for (int i = 0; i < graph.length; i++) {
            if (visitedAndColoured[i] == 0) {
                queue.add(i);
                visitedAndColoured[i] = 1;
                while (!queue.isEmpty()) {
                    cur = queue.poll();
                    for (int j = 0; j < graph[cur].length; j++) {
                        temp = graph[cur][j];
                        if (visitedAndColoured[temp] == 0) {
                            queue.add(temp);
                            visitedAndColoured[temp] = -visitedAndColoured[cur];
                        } else {
                            if (visitedAndColoured[temp] == visitedAndColoured[cur]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int mincostTickets(int[] days, int[] costs) {
        return compare(mincostTicketsUtil(days, costs, 1, costs[0], days[0]),
                mincostTicketsUtil(days, costs, 1, costs[1], days[0] + 6),
                mincostTicketsUtil(days, costs, 1, costs[2], days[0] + 29));
    }

    private static int mincostTicketsUtil(int[] days, int[] costs, int currentDayIndex, int cost, int coveredTill) {
        if (currentDayIndex >= days.length) return cost;
        if (days[currentDayIndex] <= coveredTill)
            return mincostTicketsUtil(days, costs, currentDayIndex + 1, cost, coveredTill);
        else return compare(
                mincostTicketsUtil(days, costs, currentDayIndex + 1, cost + costs[0], days[currentDayIndex]),
                mincostTicketsUtil(days, costs, currentDayIndex + 1, cost + costs[1], days[currentDayIndex] + 6),
                mincostTicketsUtil(days, costs, currentDayIndex + 1, cost + costs[2], days[currentDayIndex] + 29));
    }

    private static int compare(int a, int b, int c) {
        int min = 0;
        if (a <= b && a <= c) min = a;
        else if (b <= a && b <= c) min = b;
        else min = c;
        return min;
    }


    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (coins.length == 0) return 0;
        int[] sumArr = new int[amount + 1];
        Arrays.fill(sumArr, Integer.MAX_VALUE);
        sumArr[0] = 0;
        int curMin = 0;
        for (int i = 1; i <= amount; i++) {
            curMin = sumArr[i];
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && sumArr[i - coins[j]] != Integer.MAX_VALUE) {
                    sumArr[i] = Math.min(curMin, 1 + sumArr[i - coins[j]]);
                    curMin = sumArr[i];
                }
            }
        }
        return sumArr[amount] == Integer.MAX_VALUE ? -1 : sumArr[amount];
    }

    public static boolean possibleBipartition(int N, int[][] dislikes) {
        if (dislikes.length < 3) return true;
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        buildGraph(dislikes, N, graph);
        HashMap<Integer, Integer> visitedAndColour = new HashMap<Integer, Integer>(N);
        for (int i = 1; i < N; i++) {
            if (!visitedAndColour.containsKey(i)) {
                if (!bfs(i, 0, visitedAndColour, graph)) return false;
            }
        }
        return true;
    }

    private static boolean bfs(int node, int colour, HashMap<Integer, Integer> visitedAndColour, ArrayList<Integer>[] graph) {
        int temp = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visitedAndColour.put(node, colour);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int curColour = visitedAndColour.get(cur);
            for (int j = 0; j < graph[cur].size(); j++) {
                temp = graph[cur].get(j);
                if (visitedAndColour.containsKey(temp)) {
                    if (visitedAndColour.get(temp) == curColour) return false;
                } else {
                    visitedAndColour.put(temp, curColour ^ 1);
                    queue.add(temp);
                }
            }
        }
        return true;
    }

    private static void buildGraph(int[][] dislikes, int n, ArrayList<Integer>[] graph) {
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int[] dislike : dislikes) {
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) return 0;
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        dp[dp.length - 1] = cost[cost.length - 1];
        return Math.min(minCostClimbingStairsUtil(cost, 0, dp), minCostClimbingStairsUtil(cost, 1, dp));
    }

    private static int minCostClimbingStairsUtil(int[] cost, int cur, int[] dp) {
        if (cur >= cost.length) return 0;
        if (dp[cur] == -1) {
            dp[cur] = cost[cur] + Math.min(minCostClimbingStairsUtil(cost, cur + 1, dp), minCostClimbingStairsUtil(cost, cur + 2, dp));
        }
        return dp[cur];
    }

    public static int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return minPathSumUtil(grid, 0, 0, n, m, dp);
    }

    private static int minPathSumUtil(int[][] grid, int row, int col, int n, int m, int[][] dp) {
        if (row >= n || col >= m) return Integer.MAX_VALUE;
        if (col == m - 1 && row == n - 1) return grid[row][col];
        if (dp[row][col] == -1) {
            dp[row][col] = grid[row][col]
                    + Math.min(minPathSumUtil(grid, row + 1, col, n, m, dp),
                    minPathSumUtil(grid, row, col + 1, n, m, dp));

        }
        return dp[row][col];
    }


    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        bstFromPreorderUtil(root, 1, preorder.length - 1, preorder);
        return root;
    }

    public static void bstFromPreorderUtil(TreeNode root, int low, int high, int[] preorder) {
        if (high < low || high > preorder.length - 1)
            return;
        int j2;
        for (j2 = low; j2 <= high; j2++) {
            if (root.val < preorder[j2])
                break;
        }
        if (j2 <= high) {
            root.right = new TreeNode(preorder[j2]);
            bstFromPreorderUtil(root.right, j2 + 1, high, preorder);
        }
        if (j2 > low) {
            root.left = new TreeNode(preorder[low]);
            bstFromPreorderUtil(root.left, low + 1, j2 - 1, preorder);
        }
    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<Pair> result = new ArrayList<Pair>();
        if (A.length == 0 || B.length == 0) return new int[0][2];
        Pair temp = null;
        for (int i = 0, j = 0; i < A.length && j < B.length; ) {
            if ((A[i][0] >= B[j][0] && A[i][0] <= B[j][1]) || (B[j][0] >= A[i][0] && B[j][0] <= A[i][1])) {
                temp = new Pair(Math.max(A[i][0], B[j][0]), Math.min(A[i][1], B[j][1]));
                result.add(temp);
            }
            if (A[i][1] < B[j][1]) i++;
            else j++;
        }
        return listToArray(result);
    }

    public static int[][] listToArray(List<Pair> list) {
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i).a;
            result[i][1] = list.get(i).b;
        }
        return result;
    }

    public static String frequencySort(String s) {
        if (s.length() == 0) return s;
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            chars.put(c, chars.containsKey(c) ? chars.get(c) + 1 : 1);
        }
        chars = sortByValue(chars);
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                builder.append(entry.getKey());
            }
        }
        return builder.reverse().toString();
    }

    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer>> list =
                new LinkedList<Map.Entry<Character, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }


    static class IntWrapper {
        int a;

        public IntWrapper(int a) {
            this.a = a;
        }

        public void decrement() {
            a--;
        }

        public void increment() {
            a++;
        }
    }

    static int result = 0;

    public static int kthSmallest(TreeNode root, int k) {
        IntWrapper abc = new IntWrapper(k);
        kthSmallestUtil(root, abc);
        return result;
    }

    private static int kthSmallestUtil(TreeNode root, IntWrapper k) {
        if (root == null) return 0;
        kthSmallestUtil(root.left, k);
        k.decrement();
        //System.out.println(root.val);
        if (k.a == 0) {
            result = root.val;
            return root.val;
        } else if (k.a > 0) {
            kthSmallestUtil(root.right, k);
        }
        return 0;
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        Arrays.sort(stones);
        int left = 0, N = stones.length - 1;
        for (int i = 0; i < stones.length; i++) {
            left = stones[0] - stones[1];
            stones[0] = stones[N];
            stones[1] = left;
            N--;
            maxHeapify(stones, i, N);
        }
        return stones[0];
    }

    public static void maxHeapify(int[] arr, int i, int N) {
        if (i > N) return;
        int left = 2 * i, right = left + 1, largest = i;
        if (arr[right] > arr[i]) {
            largest = right;
        }
        if (arr[left] > arr[i]) {
            largest = left;
        }
        if (largest != i) {
            swap(arr, largest, i);
            maxHeapify(arr, largest, N);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        int[] pChars = new int[30];
        int[] sChars = new int[30];
        for (int i = 0; i < s1.length(); i++) {
            pChars[s1.charAt(i) - 'a'] += 1;
            sChars[s2.charAt(i) - 'a'] += 1;
        }
        int count = 0;
        do {
            if (compareArray(pChars, sChars)) {
                return true;
            }
            sChars[s2.charAt(count) - 'a'] -= 1;
            if (count + s1.length() < s2.length()) sChars[s2.charAt(count + s1.length()) - 'a'] += 1;
            count++;
        } while (count <= s2.length() - s1.length());
        return false;
    }

    public static List<Integer> findAnagrams(String s1, String s2) {
        List<Integer> result = new ArrayList<Integer>();
        if (s2.length() < s1.length()) return result;
        int[] pChars = new int[30];
        int[] sChars = new int[30];
        for (int i = 0; i < s1.length(); i++) {
            pChars[s1.charAt(i) - 'a'] += 1;
            sChars[s2.charAt(i) - 'a'] += 1;
        }
        int count = 0;
        do {
            if (compareArray(pChars, sChars)) {
                result.add(count);
            }
            sChars[s2.charAt(count) - 'a'] -= 1;
            if (count + s1.length() < s2.length()) sChars[s2.charAt(count + s1.length()) - 'a'] += 1;
            count++;
        } while (count <= s2.length() - s1.length());
        return result;
    }

    private static boolean compareArray(int[] pChars, int[] sChars) {
        for (int i = 0; i < pChars.length; i++) {
            if (pChars[i] != sChars[i]) return false;
        }
        return true;
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        ListNode first = head, second = first.next, third = second.next, fourth = third.next, temp = second;
        while (third != null) {
            first.next = third;
            if (second != null) second.next = fourth;
            else break;

            first = first.next;
            second = second.next;

            if (fourth == null) break;
            third = fourth.next;
            if (third == null) break;
            fourth = third.next;
        }

        first.next = temp;
        return head;
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxCount = Math.max(maxCount, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxCount;
    }

    public static String removeKdigits(String num, int k) {
        for (int i = 0; i < k; i++) {
            num = removeAdigit(num);
        }
        if (num.length() == 0) num = "0";
        return num;
    }

    private static String removeAdigit(String num) {
        if (num.length() == 0) return num;
        StringBuilder builder = new StringBuilder(num);
        for (int i = 0; i < builder.length(); i++) {
            if ((i == builder.length() - 1) || builder.charAt(i) > builder.charAt(i + 1)) {
                builder.deleteCharAt(i);
                break;
            }
        }
        while (builder.length() > 0 && builder.charAt(0) == '0') builder.deleteCharAt(0);
        return builder.toString();
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        int low = 0, high = nums.length, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) return nums[mid];
            else if (nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else if (nums[mid] == nums[mid - 1]) {
                if ((nums.length - 1 - mid) % 2 == 0) {
                    high = mid - 2;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, 1, 0, -1};
        int curColour = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(sr, sc));
        Pair temp = null, newNode = new Pair(0, 0);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            visited[temp.a][temp.b] = true;
            image[temp.a][temp.b] = newColor;
            for (int i = 0; i < row.length; i++) {
                newNode.a = temp.a + row[i];
                newNode.b = temp.b + col[i];
                if (isValid(image, newNode, visited, curColour)) queue.add(new Pair(newNode.a, newNode.b));
            }
        }
        return image;
    }

    private boolean isValid(int[][] image, Pair newNode, boolean[][] visited, int curColour) {
        if (newNode.a < 0 || newNode.a >= image.length) return false;
        if (newNode.b < 0 || newNode.b >= image[0].length) return false;
        if (image[newNode.a][newNode.b] != curColour) return false;
        if (visited[newNode.a][newNode.b]) return false;
        return true;
    }

    public static int findJudge(int N, int[][] trust) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < trust.length; i++) {
            if (trust[i][0] == 0 || trust[i][1] == 0) continue;
            matrix[trust[i][0] - 1][trust[i][1] - 1] = 1;
        }
        int i, j, k;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (matrix[i][j] != 0) break;
            }
            if (j == N) {
                for (k = 0; k < N; k++) {
                    if (matrix[k][i] == 0 && i != k) return -1;
                }
                return i + 1;
            }
        }
        return -1;
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int low = 2, high = 46340, mid;
        long TEMP;
        while (low <= high) {
            mid = low + (high - low) / 2;
            TEMP = mid * mid;
            if (num == TEMP) return true;
            if (num > TEMP) low = mid + 1;
            else if (num < TEMP) high = mid - 1;
        }
        return false;
    }


    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) return true;
        int c = 0, m = 0, denominator = 0;
        denominator = coordinates[0][0] - coordinates[1][0];
        if (denominator == 0) {
            for (int i = 0; i < coordinates.length; i++) {
                if (coordinates[i][0] != coordinates[1][0]) return false;
            }
            return true;
        }
        m = (coordinates[0][1] - coordinates[1][1]) / denominator;
        c = coordinates[0][1] - m * coordinates[0][0];
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i][1] != m * coordinates[i][0] + c) return false;
        }
        return true;
    }

    public static int maxDiamter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {

        diameterOfBinaryTreeUtil(root);
        return maxDiamter;
    }

    private static int diameterOfBinaryTreeUtil(TreeNode root) {
        if (root == null) return 0;
        int lheight = diameterOfBinaryTreeUtil(root.left);
        int rheight = diameterOfBinaryTreeUtil(root.right);
        if (maxDiamter < lheight + rheight + 1) {
            maxDiamter = lheight + rheight + 1;
        }
        return 1 + Math.max(lheight, rheight);
    }

    public static boolean backspaceCompare(String S, String T) {
        if (S.equals(T)) return true;
        StringBuilder builderS = new StringBuilder();
        StringBuilder builderT = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c != '#') builderS.append(c);
            else {
                if (builderS.length() > 0) builderS.deleteCharAt(builderS.length() - 1);
            }
        }
        for (char c : T.toCharArray()) {
            if (c != '#') builderT.append(c);
            else {
                if (builderT.length() > 0) builderT.deleteCharAt(builderT.length() - 1);
            }
        }
        return builderS.toString().equals(builderT.toString());
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        if (checkSisterNodes(root, x, y)) return false;
        int count = 0;
        boolean xFound = false, yFound = false;
        while (!queue.isEmpty()) {
            count = queue.size();
            xFound = false;
            yFound = false;
            while (count > 0) {
                TreeNode temp = queue.poll();
                if (temp.val == x) xFound = true;
                if (temp.val == y) yFound = true;
                if (checkSisterNodes(temp, x, y)) return false;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                count--;
            }
            if (xFound && yFound) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkSisterNodes(TreeNode root, int x, int y) {
        boolean xFound = false, yFound = false;
        if (root.left == null || root.right == null) return false;
        if (root.left.val == x) xFound = true;
        if (root.left.val == y) yFound = true;
        if (root.right.val == x) xFound = true;
        if (root.right.val == y) yFound = true;
        return xFound && yFound;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1 + (map.containsKey(nums[i]) ? map.get(nums[i]) : 0));
        }
        int max = 0, result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static int firstUniqChar(String s) {
        int[] count = new int[200];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (count[c] == 1) return counter;
            counter++;
        }
        return -1;
    }

    public static int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 0, maxSum = Integer.MIN_VALUE, res = 0, tempSum = 0, curLevel = 0;
        while (!queue.isEmpty()) {
            count = queue.size();
            curLevel++;
            tempSum = 0;
            while (count > 0) {
                TreeNode temp = queue.poll();
                tempSum += temp.val;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                count--;
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                res = curLevel;
            }
        }
        return res;
    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j != i && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    public static int numJewelsInStones(String J, String S) {
        if (S.length() == 0 || J.length() == 0) return 0;
        boolean[] chars = new boolean[500];
        for (char c : J.toCharArray()) {
            chars[c] = true;
        }
        int counter = 0;
        for (char c : S.toCharArray()) {
            if (chars[c]) counter++;
        }
        return counter;
    }

    public static int firstBadVersion(int n) {
        int low = 1, high = n, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid) && !isBadVersion(mid - 1)) return mid;
            //System.out.println(mid);
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    public static boolean isBadVersion(int version) {
        return version >= 4;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[500];
        for (char c : magazine.toCharArray()) {
            chars[c]++;
        }
        for (char c : ransomNote.toCharArray()) {
            chars[c]--;
            if (chars[c] < 0) return false;
        }
        return true;
    }

    public static int findComplement(int num) {
        int bits = countBits(num);
        int result = 1;
        for (int i = 0; i < bits; i++) {
            num ^= result;
            result <<= 1;
        }
        return num;
    }

    static int countBits(int number) {
        return (int) (Math.log(number) / Math.log(2) + 1);
    }
}

