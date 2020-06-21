package InterviewBit;

import java.util.*;

/**
 * Created by kuliza-265 on 13/4/17.
 */
public class InterviewBit {


    //Definition for an interval.
    static class Interval {
        public int start;
        public int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(6);

        numbers2.add(9);
        numbers2.add(15);

        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        numbers3.add(3);
        numbers3.add(3);
        numbers3.add(3);
        numbers3.add(1);
        numbers3.add(3);
        numbers3.add(3);
        numbers3.add(3);
        numbers3.add(1);

        //arrange(numbers);
        String[] arr = new String("dfghjkl.tyuiop.dfghj").split("[.]");
        //System.out.println(arr);
        //System.out.println(isPalindrome(12121));
        //System.out.println(gcd(3,15));
        //System.out.println(strStr("assdfghjj","jjk"));
        //prettyPrint(1);
        //int[] arr2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        int[] arr2 = new int[]{33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28};
        numbers = arrayToInteger(arr2);
        //String[] arr3 = new String[]{, "10", ""};
        //Collections.sort(numbers);
        //System.out.println(singleNumber(numbers));
        //printBits(reverseBits(3));
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(7);
        //listNode.next.next = new ListNode(3);
        //listNode.next.next.next = new ListNode(4);
        //listNode.next.next.next.next = new ListNode(5);
        //printList(subtract(listNode));
      /*  listNode.next.next.next.next.next = new ListNode(2);
        listNode.next.next.next.next.next.next = new ListNode(6);*/
        //printList(partition(listNode, 4));
        //System.out.println(evalRPN(arrayToString(arr3)));
        //checkPossible(8);
        //subsets(numbers3);
        //combine(4,0);
        //letterCombinations("33");
        //generateParanthesis(4);
        //System.out.println(countWays(3));
        //System.out.println(countWays(20));
        //permute(numbers3);
        //System.out.println(xorOp(numbers3));
        //System.out.println(checkInterleaved("aabaabbbcdbbcab","abcabcabcqwerty", "abcabaabaacabcqwbbbcdbbcaerbty"));
        //System.out.println(minDistance("sdfghjwed","asdfghjefv"));
        //System.out.println(longestIncSub(numbers));
        int[][] multi = new int[][]{
                {1, 31, 2},
                {4, 6, 12},
                {5, 6, 1}
        };
        //System.out.println(minMatrixSum(multi));
        //knightMoves(8);
        //printSolution(nQueen(8), 8);
        //solveNQueens(8);
        //printList(generateGrayCode(3));
        //System.out.println(pall("asdfghdfvbtghnmbacabaccacaaccaccaacaccbbcbcbbabcddeesdfghjkqwertyui"));

        //System.out.println(pall("ac"));
//        int[] arr3 = new int[]{ };
        String s1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String s2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String s3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        //System.out.println(checkstring(s1, s2, s3));

        String[] ar = {"POON", "PLEE", "SAME", "POIE", "PLEA", "PLIE", "POIN"};

        //electionWinner(ar);

        int X = 7, Y = 91, N = 8, R = 7;
        int[] cirX = {8, 1, 7, 1, 7, 1, 5, 1, 6};
        int[] cirY = {2, 1, 5, 6, 2, 3};
        //System.out.println(isValidPath(X, Y, N, R, cirX, cirY));
        //System.out.println(findPath("TOON","PZEE", Arrays.asList(ar)));
        //System.out.println(findWindowMax(cirY,3));
        //System.out.println(maxHistogramArea(cirY));
        //reorderList(listNode, 100);
        ListNode listNode3 = new ListNode(5);
        listNode3.next = new ListNode(7);
        listNode3.next.next = new ListNode(9);

        ListNode listNode2 = new ListNode(3);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(11);
        listNode2.next.next.next = new ListNode(15);
        listNode2.next.next.next.next = new ListNode(19);

        ArrayList<ListNode> listNodes = new ArrayList<>();
        listNodes.add(listNode3);
        listNodes.add(listNode2);
        //mergeKLists(listNodes);
        String[][] salutation = {{"Mr. ", "Mrs. ", "Ms. "}, {"Kumar"}};

        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        //solve(board);
        //System.out.println(board2);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(1);
        ar1.add(2);
        result.add(ar1);
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(3);
        ar2.add(4);
        result.add(ar2);
        //antiDiagonal(result);
        Interval pair = new Interval(1, 9);
        Interval pair1 = new Interval(1, 94);
        Interval pair2 = new Interval(3, 8);
        Interval pair3 = new Interval(7, 96);
        ArrayList<Interval> pairs = new ArrayList<Interval>();
        pairs.add(pair);
        pairs.add(pair1);
        pairs.add(pair2);
        pairs.add(pair3);
        //mergeInterval(pairs);
        ArrayList<Integer> numbersx = new ArrayList<>();
        numbersx.add(1);
        numbersx.add(5);
        numbersx.add(3);
        numbersx.add(4);
        numbersx.add(2);
        //System.out.println(solveMath(numbersx, 3, 796));
        //System.out.println(longestConsecutive(numbersx));
        //System.out.println(multiplyString("6020453667958309279424408570378228292268488402", "0021473700594524297017810575200827941459805716642468749607585313713214621412"));
        //System.out.println(getLongestBalancedChromosome2("1010110111110"));
        ArrayList<String> list = new ArrayList<>();
        list.add("XXXX");
        list.add("XXXX");
        list.add("XXXX");
        //System.out.println(black(list));
        //System.out.println(solve(numbersx));
        //System.out.println(makePallindrome("DBABC"));
        //System.out.println(zigZagString("ABC", 5));
        //System.out.println(solution("01:01","15:02"));
        //System.out.println(solution(new int[]{30}));
        //System.out.println(findRotationPivot(new int[]{7,9,9,1,2,3,4,5,5}));
        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //System.out.println(findElementInRotatedArray(arrays,4));
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(-1);
        a1.add(2);
        a1.add(2);
        a1.add(2);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        //System.out.println(intersect(a1, a2));
        //System.out.println(kDifference(numbersx,2));
        //System.out.println(flowerBouqeuts(2, 13, "00"));
        //stringWar("BCE","ABX");
        //System.out.println(sol(arrays));
        //int abc = abcd("ZACECAAAAA");
        //System.out.println(abc);
        System.out.println(coins(a2, 4));
    }

    public static int coins(ArrayList<Integer> A, int B) {
        int[] result = new int[B + 1];
        //Arrays.fill(result, Integer.MAX_VALUE);
        result[0] = 0;
        for (int i = 1; i <= B; i++) {
            for (int j = 0; j < A.size(); j++) {
                if (i - A.get(j)>=0) {
                    int cur = 1 + result[i - A.get(j)];
                    result[i] += cur;
                }
            }
        }
        return result[B];
    }


    public static int abcd(String str) {
        for (int i = str.length(); i > 1; i--) {
            if (isPallindrome2(str, 0, i)) return str.length() - i;
        }
        return str.length() - 1;
    }

    public static boolean isPallindrome2(String str, int start, int end) {
        int n = (start + end) / 2;
        for (int i = start; i < n; i++) {
            if (str.charAt(i) != str.charAt(end - i - 1)) return false;
        }
        return true;
    }

    public static boolean room(ArrayList<Integer> arrivals, ArrayList<Integer> departures, int k) {
        if (arrivals.size() == 0) return true;
        Collections.sort(arrivals);
        Collections.sort(departures);
        int i = 1, j = 0, n = arrivals.size(), result = 0, currRoom = 1;
        while (i < n && j < n) {
            if (arrivals.get(i) < departures.get(j)) {
                currRoom++;
                i++;
                if (result < currRoom) result = currRoom;
            } else {
                currRoom--;
                j++;
            }
        }
        return k >= result;
    }


    public static int comparatorValue(List<Integer> a, List<Integer> b, int d) {
        // Write your code here
        int max = b.get(0);
        int min = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            if (b.get(i) > max) max = b.get(i);
            if (b.get(i) < min) min = b.get(i);
        }
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (Math.abs(a.get(i) - max) > d && Math.abs(a.get(i) - min) > d) count++;
        }
        return count;
    }

    public static int comparatorValue2(List<Integer> a, List<Integer> b, int d) {
        // Write your code here
        int max = b.get(0);
        int min = b.get(0);
        /*for (int i = 1; i < b.size(); i++) {
            if (b.get(i)>max) max = b.get(i);
            if (b.get(i)<min) min = b.get(i);
        }*/
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            int j;
            for (j = 0; j < b.size(); j++) {
                if (Math.abs(a.get(i) - b.get(j)) <= d) break;
            }
            if (j == b.size()) count++;
        }
        return count;
    }

    private static Integer arr(ArrayList<Integer> list) {
        Collections.sort(list);
        if (list.size() == 3) {
            return list.get(0) * list.get(1) * list.get(2);
        }
        int n = list.size();
        return Math.max(list.get(n - 1) * list.get(n - 2) * list.get(n - 3), list.get(0) * list.get(1) * list.get(n - 1));
    }

    public static int sol(int[] A) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                if (count != 0) return 0;
                if (i == 1 || A[i - 2] <= A[i]) count++;
                if (i == A.length - 1 || A[i - 1] <= A[i + 1]) count++;
                if (count == 0) return 0;
            }
        }
        if (count == 0) count = A.length;
        return count;
    }

    private static Integer majority(ArrayList<Integer> list) {
        Collections.sort(list);
        int n = list.size();
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                count++;
                if (count > Math.floor(n / 2)) return list.get(i);
            } else count = 1;
        }
        return -1;
    }

    private static void stringWar(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (compareCharArray(c1, c2) || compareCharArray(c2, c1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean compareCharArray(char[] c1, char[] c2) {
        for (int i = 0; i < c1.length; i++) {
            if (c2[i] > c1[i]) return false;
        }
        return true;
    }

    private static int maxVal = 0;

    static int flowerBouqeuts(int p, int q, String s) {
        flowerBuqUtil(p, q, s, 0, 0);
        return maxVal;
    }

    private static void flowerBuqUtil(int p, int q, String s, int curIndex, int curCost) {
        if (maxVal < curCost) maxVal = curCost;
        if (curIndex >= s.length() - 1) return;
        else if (curIndex == s.length() - 2)
            flowerBuqUtil(p, q, s, curIndex + 2, s.substring(curIndex, curIndex + 2).equalsIgnoreCase("01") || s.substring(curIndex, curIndex + 2).equalsIgnoreCase("10") ? curCost + q : curCost);
        if (s.length() > curIndex + 3)
            flowerBuqUtil(p, q, s, curIndex + 3, s.substring(curIndex, curIndex + 3).equalsIgnoreCase("000") ? curCost + p : curCost);
        flowerBuqUtil(p, q, s, curIndex + 1, curCost);
        if (s.length() > curIndex + 2)
            flowerBuqUtil(p, q, s, curIndex + 2, s.substring(curIndex, curIndex + 2).equalsIgnoreCase("01")
                    || s.substring(curIndex, curIndex + 2).equalsIgnoreCase("10") ? curCost + q : curCost);
    }

    static int countPairsWithDiffK(List<Integer> arr, int k) {
        int count = 0, n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (Math.abs(arr.get(i) - arr.get(j)) == k)
                    count++;
        }
        return count;
    }

    static void printPattern(int i) {
        StringBuilder builder = new StringBuilder("x");
        StringBuilder spaces = new StringBuilder();
        for (int j = 0; j < i - 1; j++) {
            spaces.append(" ");
        }
        for (int j = 0; j < i - 1; j++) {
            System.out.print(spaces.toString());
            //builder.append()
            System.out.println();
        }
    }

    static int binarySearchList(List<Integer> a, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (x == a.get(mid))
                return mid;
            if (x > a.get(mid))
                return binarySearchList(a, (mid + 1), high, x);
            else
                return binarySearchList(a, low, (mid - 1), x);
        }
        return -1;
    }

    static int kDifference(List<Integer> a, int k) {
        int count = 0, i, n = a.size();
        Collections.sort(a);
        for (i = 0; i < n - 1; i++)
            if (binarySearchList(a, i + 1, n - 1, a.get(i) + k) != -1)
                count++;

        return count;
    }

    static int countPairsWithDiffK2(List<Integer> arr, int k) {
        int count = 0, n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (Math.abs(arr.get(i) - arr.get(j)) == k)
                    count++;
        }
        return count;
    }

    public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0, j = 0; i < A.size() && j < B.size(); ) {
            if (A.get(i).equals(B.get(j))) {
                result.add(A.get(i));
                i++;
                j++;
                continue;
            }
            if (A.get(i) > B.get(j)) j++;
            else i++;
        }
        return result;
    }

    private static int findElementInRotatedArray(ArrayList<Integer> arr, int n) {
        int pivot = findRotationPivot(arr);
        if (pivot == -1) return binarySearch(arr, n, 0, arr.size() - 1);
        if (arr.get(pivot) == n) return pivot;
        else {
            int result;
            result = binarySearch(arr, n, 0, pivot - 1);
            if (result == -1) result = binarySearch(arr, n, pivot + 1, arr.size() - 1);
            return result;
        }
    }

    private static int binarySearch(List<Integer> arr, int n, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr.get(mid) == n) return mid;
        if (arr.get(mid) > n) return binarySearch(arr, n, low, mid - 1);
        return binarySearch(arr, n, mid + 1, high);
    }

    private static int findRotationPivot(ArrayList<Integer> arr) {
        return binaryPivotFind(arr, 0, arr.size() - 1);
    }

    private static int binaryPivotFind(ArrayList<Integer> arr, int low, int high) {
        if (low > high) return -1;
        if (low == high) return low;
        int mid = low + (high - low) / 2;
        if (mid > 0 && arr.get(mid) < arr.get(mid - 1)) return mid;
        if (arr.get(high) > arr.get(mid)) return binaryPivotFind(arr, low, mid - 1);
        return binaryPivotFind(arr, mid + 1, high);
    }

    public static int findIndex(ArrayList<Integer> arr, int n) {
        if (arr.size() == 0) return 0;
        int val = binarySearch(arr, n, 0, arr.size() - 1);
        return val == -1 ? 0 : val;
    }

    public static int solution(String E, String L) {
        // write your code in Java SE 8
        int entryHour = Integer.valueOf(E.split(":")[0]);
        int exitHour = Integer.valueOf(L.split(":")[0]);
        int entryMin = Integer.valueOf(E.split(":")[1]);
        int exitMin = Integer.valueOf(L.split(":")[1]);
        int totalMin = (exitHour - entryHour) * 60 + (exitMin - entryMin);
        int totalHour = totalMin / 60;
        if (totalMin % 60 != 0) totalHour++;
        return 5 + (totalHour - 1) * 4;

    }

    public static int solution(int[] A) {
        if (A.length == 0) return 0;
        return Math.min(25, Math.min(solutionUtil(A, 0, 0, 0, 2),
                solutionUtil(A, 0, 0, 6, 7)));
    }

    private static int solutionUtil(int[] a, int curIndex, int lastValidIndex, int passValidity, int curCost) {
        if (curIndex >= a.length) return curCost;
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        if (a[curIndex] <= a[lastValidIndex] + passValidity)
            i = solutionUtil(a, curIndex + 1, lastValidIndex, passValidity, curCost);
        else {
            j = Math.min(solutionUtil(a, curIndex + 1, curIndex, 0, curCost + 2),
                    solutionUtil(a, curIndex + 1, curIndex, 6, curCost + 7));

        }
        return Math.min(i, j);

    }

    public static String zigZagString(String s, int k) {
        if (k == 1 || k >= s.length()) return s;
        StringBuilder[] builders = new StringBuilder[k];
        char[] chars = s.toCharArray();
        int j = 0, add = 1;
        for (int i = 0; i < chars.length; i++) {
            if (j == 1) add = 1;
            else if (j == k) add = -1;
            j += add;
            if (builders[j - 1] == null) builders[j - 1] = new StringBuilder();
            builders[j - 1].append(chars[i]);
        }
        for (int i = 1; i < builders.length; i++) {
            builders[0].append(builders[i]);
        }
        return builders[0].toString();
    }

    public static int makePallindrome(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (isPalindrome(chars, i)) {
                return count;
            } else count++;
        }
        return count;
    }

    private static boolean isPalindrome(char[] chars, int end) {
        for (int i = 0; i <= end / 2; i++) {
            if (chars[i] != chars[end - i]) return false;
        }
        return true;
    }

    public static int solve(ArrayList<Integer> A) {
        int V = A.size();
        int[][] graph = new int[V][V];
        int[][] dist = new int[V][V];
        for (int i = 0; i < V; i++) {
            if (A.get(i) == -1) {
                continue;
            }
            graph[A.get(i)][i] = 1;
            graph[i][A.get(i)] = 1;
        }
        int i, j, k;
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++) {
                if (i == j) dist[i][j] = 0;
                else if (graph[i][j] == 1) dist[i][j] = 1;
                else dist[i][j] = Integer.MAX_VALUE;
            }
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                for (k = 0; k < V; k++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE && dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        int max = 0;
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                if (dist[i][j] > max) max = dist[i][j];
        return max;
    }

    public static int black(ArrayList<String> A) {
        char[][] graph = new char[A.size()][A.get(0).length()];
        for (int i = 0; i < A.size(); i++) {
            graph[i] = A.get(i).toCharArray();
        }
        return countShapes(graph);
    }

    private static int countShapes(char[][] graph) {
        boolean[][] visited = new boolean[graph.length][graph[0].length];
        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == 'X' && !visited[i][j]) {
                    countShapesUtil(graph, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void countShapesUtil(char[][] graph, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        int rowNbr[] = new int[]{-1, 0, 0, 1};
        int colNbr[] = new int[]{0, -1, 1, 0};
        int row, col;
        for (int k = 0; k < rowNbr.length; k++) {
            row = i + rowNbr[k];
            col = j + colNbr[k];
            if (isValidBlack(graph, row, col, visited)) {
                countShapesUtil(graph, i + rowNbr[k], j + colNbr[k], visited);
            }
        }
    }

    private static boolean isValidBlack(char[][] graph, int row, int col, boolean[][] visited) {
        if (row < 0 || row >= graph.length) return false;
        if (col < 0 || col >= graph[0].length) return false;
        if (graph[row][col] != 'X') return false;
        return !visited[row][col];
    }

    static int getLongestBalancedChromosome(String c) {
        /*
         * Write your code here.
         */

        if (c.length() == 0) return 0;
        int max = 0, temp;
        char[] chars = c.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < c.length(); j++) {
                if ((j - i) % 2 == 0) continue;
                temp = count1and0(chars, i, j);
                max = Math.max(max, temp);
            }
        }
        return max;
    }

    static int getLongestBalancedChromosome2(String c) {
        /*
         * Write your code here.
         */

        if (c.length() == 0) return 0;
        int max = 0, temp;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int count_1 = 0, count_0 = 0;
        char[] chars = c.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') count_1++;
            else count_0++;
            if (map.get(count_0 - count_1) != null) {
                max = Math.max(max, i - map.get(count_0 - count_1));
            } else {
                map.put(count_0 - count_1, i);
            }
        }
        return max;
    }


    private static int count1and0(char[] chars, int i, int j) {
        int count_1 = 0, count_0 = 0;
        for (int k = i; k <= j; k++) {
            if (chars[k] == '1') count_1++;
            else count_0++;
        }
        return count_0 == count_1 ? j - i + 1 : 0;
    }

    static int getLazyEscalations(int k, int[] escalations) {
        if (k == 0) return 0;
        Arrays.sort(escalations);
        int sum = 0;
        for (int i = escalations.length - 1; i >= 0; i--) {
            sum += escalations[i];
            if (sum >= k) return escalations.length - i;
        }
        return -1;
    }

    public static String multiplyString(String a, String b) {
        if (a.equals("0") || b.equals("0")) return "0";
        ArrayList<Integer> num1 = getDigits(a);
        ArrayList<Integer> num2 = getDigits(b);
        ArrayList<Integer> result = new ArrayList<>();
        Integer temp, carry = null;
        int shift = 0, i = 0;
        for (Integer integer : num2) {
            if (carry != null) result.add(carry);
            carry = null;
            i = 0;
            for (Integer integer1 : num1) {
                temp = integer * integer1;
                if (carry != null) temp += carry;
                if (shift != 0 && i + shift < result.size()) temp += result.get(i + shift);
                if (temp > 9) {
                    carry = temp / 10;
                    temp %= 10;
                } else {
                    carry = null;
                }
                if (result.size() > shift + i) {
                    result.set(shift + i, temp);
                } else {
                    result.add(temp);
                }
                i++;
            }
            shift++;
        }
        if (carry != null) result.add(carry);
        StringBuilder builder = new StringBuilder();
        for (Integer integer : result) {
            builder.append(integer);
        }
        builder.reverse();
        return builder.toString();
    }

    private static ArrayList<Integer> getDigits(String a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (char c : a.toCharArray()) {
            if (c == '0' && res.size() == 0) continue;
            res.add(0, Integer.valueOf(String.valueOf(c)));
        }
        return res;
    }

    public static int reverse(int num) {
        StringBuilder builder = new StringBuilder();
        boolean flag;
        if (num < 0) flag = false;
        while (num > 0) {
            builder.append(num % 10);
            num /= 10;
        }
        Integer result = 0;
        try {
            result = Integer.parseInt(builder.toString());
        } catch (Exception exp) {
        }
        return result;
    }

    public static int longestConsecutive(final List<Integer> A) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Integer integer : A) {
            if (integer < min) min = integer;
            if (integer > max) max = integer;
        }
        int[] arr = new int[max - min + 1];
        for (Integer integer : A) {
            arr[integer - min] = 1;
        }
        int counter = 0, maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) counter++;
            if (maxCount < counter) maxCount = counter;
            if (arr[i] == 0) {
                counter = 0;
            }
        }
        return maxCount;
    }

    public static int solveMath(ArrayList<Integer> A, int B, int C) {
        if (A.size() == 0) return 0;
        ArrayList<Integer> num = getDigits(C);
        if (num.size() < B) return 0;
        else if (num.size() > B) {
            if (B == 1) return A.size();
            return (int) (A.get(0) == 0 ? (A.size() - 1) * Math.pow(A.size(), B - 1) : Math.pow(A.size(), B));
        }
        double res = 0;
        boolean flag = false;
        for (int i = 0; i < num.size() && !flag; i++) {
            int temp = num.get(i);
            int j = 0;
            while (j < A.size() && A.get(j) < temp) j++;
            if (j >= A.size() || !A.get(j).equals(num.get(i))) flag = true;
            if (i == 0 && A.get(0) == 0 && B != 1) j--;
            res += j * Math.pow(A.size(), B - 1 - i);
        }
        return (int) res;
    }

    private static ArrayList<Integer> getDigits(int c) {
        ArrayList<Integer> res = new ArrayList<>();
        while (c > 0) {
            res.add(c % 10);
            c /= 10;
        }
        return res;
    }


    public static ArrayList<ArrayList<Integer>> antiDiagonal(ArrayList<ArrayList<Integer>> arr) {
        int n = arr.size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(2 * n - 1);
        for (int i = 0; i < 2 * n - 1; i++) {
            result.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.get(i + j).add(arr.get(i).get(j));
            }
        }
        return result;
    }

    public static void solve(char[][] board) {
        ArrayList<ArrayList<Character>> a = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            a.add(new ArrayList<>());
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                a.get(i).add(j, board[i][j]);
            }
        }
        captureBoard(a);
        System.out.println("done");
    }


    public static ArrayList<Interval> mergeInterval(ArrayList<Interval> pairs) {
        Set<Interval> set = new TreeSet<Interval>((o1, o2) -> o1.start - o2.start == 0 ? o1.end - o2.end : o1.start - o2.start);
        set.addAll(pairs);
        ArrayList<Interval> res = new ArrayList<>();
        Integer start = null, end = null;
        for (Interval pair : set) {
            if (start == null) {
                start = pair.start;
                end = pair.end;
            } else if (pair.start <= end) {
                end = Math.max(end, pair.end);
            } else {
                res.add(new Interval(start, end));
                start = pair.start;
                end = pair.end;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }


    public static void captureBoard(ArrayList<ArrayList<Character>> board) {
        int row = board.size(), col = board.get(0).size();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i == 0 || j == 0 || i == row - 1 || j == col - 1) && board.get(i).get(j) == 'O') {
                    bfsUtil(board, i, j, new boolean[row][col], row, col);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board.get(i).get(j) == 'O') board.get(i).set(j, 'X');
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board.get(i).get(j) == 'Y') board.get(i).set(j, 'O');
            }
        }
    }

    private static void bfsUtil(ArrayList<ArrayList<Character>> board, int X, int Y, boolean[][] visited, int row, int col) {
        int rowNbr[] = new int[]{-1, 0, 0, 1};
        int colNbr[] = new int[]{0, -1, 1, 0};
        visited[X][Y] = true;
        int r, c;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(X, Y));
        board.get(X).set(Y, 'Y');
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            for (int i = 0; i < rowNbr.length; i++) {
                r = pair.x + rowNbr[i];
                c = pair.y + colNbr[i];
                if (isvalid(board, r, c, row, col, visited)) {
                    board.get(r).set(c, 'Y');
                    visited[r][c] = true;
                    queue.add(new Pair(r, c));
                }
            }
        }
    }

    private static boolean dfsUtil(ArrayList<ArrayList<Character>> board, int X, int Y, boolean[][] marked, boolean[][] visited, int row, int col, ArrayList<Pair> characters) {
        if ((X == 0 || X == row - 1 || Y == 0 || Y == col - 1)) return true;
        int rowNbr[] = new int[]{-1, 0, 0, 1};
        int colNbr[] = new int[]{0, -1, 1, 0};
        visited[X][Y] = true;
        int r, c;
        for (int k = 0; k < rowNbr.length; k++) {
            r = X + rowNbr[k];
            c = Y + colNbr[k];
            if (isvalid(board, r, c, row, col, visited)) {
                characters.add(new Pair(r, c));
                return dfsUtil(board, r, c, marked, visited, row, col, characters);
            }
        }
        return false;
    }

    private static boolean isvalid(ArrayList<ArrayList<Character>> board, int X, int Y, int row, int col, boolean[][] visited) {
        if (X < 0 || X >= row || Y < 0 || Y >= col) return false;
        if (board.get(X).get(Y) == 'X') return false;
        if (visited[X][Y]) return false;
        return true;
    }

    public static ListNode reorderList(ListNode node, int k) {
        if (node == null || node.next == null) return node;
        int count = 0;
        ListNode temp = node;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        k %= count;
        ListNode slow = node, fast = node;
        for (int i = 0; i < k && fast.next != null; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = node;
        node = slow.next;
        slow.next = null;
        return node;
    }

    public int[] returnArray(ArrayList<Integer> A) {
        int[] arr = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            arr[i] = A.get(i);
        }
        return arr;
    }

    public static int maxHistogramArea(int[] arr) {
        int maxArea = 0, lArea, rArea, curArea = 0;
        for (int i = 0; i < arr.length; i++) {
            lArea = findLeftArea(arr, i);
            rArea = findRightArea(arr, i);
            curArea = lArea + rArea + arr[i];
            if (maxArea < curArea) maxArea = curArea;
        }
        return maxArea;
    }

    private static int findLeftArea(int[] arr, int i) {
        int area = 0;
        for (int j = i - 1; j >= 0; j--) {
            if (arr[j] < arr[i]) break;
            area += arr[i];
        }
        return area;
    }

    private static int findRightArea(int[] arr, int i) {
        int area = 0;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[i]) break;
            area += arr[i];
        }
        return area;
    }

    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int arr[] = new int[A.size()];
        int[] res;
        for (int i = 0; i < A.size(); i++) {
            arr[i] = A.get(i);
        }
        res = findWindowMax(arr, B);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            result.add(res[i]);
        }
        return result;
    }

    private static int[] findWindowMax(int[] arr, int w) {
        int[] result = new int[Math.max(arr.length - w + 1, 1)];
        int index = -1, k = 0;
        for (int i = 0; i < arr.length - w + 1; i++, k++) {
            if (index == -1 || index < i) {
                int[] temp = findMax(arr, i, w);
                index = temp[1];
                result[k] = temp[0];
            } else {
                if (arr[i + w - 1] > result[k - 1]) {
                    result[k] = arr[i + w - 1];
                    index = i + w - 1;
                } else {
                    result[k] = result[k - 1];
                }
            }
        }
        return result;
    }

    private static int[] findMax(int[] arr, int i, int w) {
        int[] res = new int[2];
        res[0] = arr[i];
        res[1] = i;
        for (int j = i + 1; j < i + w; j++) {
            if (arr[j] > res[0]) {
                res[0] = arr[j];
                res[1] = j;
            }
        }
        return res;
    }

    private static int findPath(String start, String end, List<String> dictionary) {
        ArrayList<String> dict = new ArrayList<>(dictionary);
        dict.add(0, start);
        dict.add(end);
        int[][] graph = new int[dict.size()][dict.size()];
        for (int i = 0; i < dict.size(); i++) {
            for (int j = i + 1; j < dict.size(); j++) {
                if (ifEdgeExists(dict.get(i), dict.get(j))) {
                    graph[i][j] = 1;
                    graph[j][i] = 1;
                }
            }
        }
        return bfs(graph, end, dict);
    }

    private static int bfs(int[][] graph, String end, ArrayList<String> dict) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[dict.size()];
        queue.add(0);
        int level = 0, counter;
        while (!queue.isEmpty()) {
            counter = queue.size();
            level++;
            while (counter != 0) {
                int node = queue.poll();
                visited[node] = true;
                if (dict.get(node).equals(end)) {
                    return level;
                }
                for (int i = 0; i < graph.length; i++) {
                    if (graph[node][i] == 1 && !visited[i]) {
                        queue.add(i);
                    }
                }
                counter--;
            }
        }
        return 0;
    }

    private static boolean ifEdgeExists(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) counter++;
        }
        return counter == 1;
    }

    private static String isValidPath(int X, int Y, int N, int R, int[] cirX, int[] cirY) {
        return validPath(X, Y, N, R, cirX, cirY) ? "YES" : "NO";
    }

    private static boolean validPath(int X, int Y, int N, int R, int[] cirX, int[] cirY) {
        int[][] grid = new int[X + 1][Y + 1];
        int[] dirX = {0, 1, 0, -1, 1, 1, -1, -1};
        int[] dirY = {1, 0, -1, 0, 1, -1, -1, 1};
        for (int i = 0; i < N; i++) {
            grid[cirX[i]][cirY[i]] = -1;
            for (int j = 0; j < 4; j++) {
                int x = cirX[i] + dirX[j] * R, y = cirY[i] + dirY[j] * R;
                if (x >= 0 && x <= X && y >= 0 && y <= Y) grid[x][y] = -1;
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));
        grid[0][0] = -1;
        while (!queue.isEmpty()) {
            Pair vertex = queue.poll();
            if (vertex.x == X && vertex.y == Y) return true;
            for (int i = 0; i < 8; i++) {
                Pair pair = new Pair(vertex.x + dirX[i], vertex.y + dirY[i]);
                if (isValidPair(pair, grid, X, Y)) {
                    queue.add(pair);
                    grid[pair.x][pair.y] = -1;
                }
            }
        }
        return false;
    }

    private static boolean isValidPair(Pair pair, int[][] grid, int X, int Y) {
        if (pair.x < 0 || pair.y < 0) return false;
        if (pair.x > X || pair.y > Y) return false;
        if (grid[pair.x][pair.y] == -1) return false;
        return true;
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int validParanthesis(String paranthesis) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < paranthesis.length(); i++) {
            if (paranthesis.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (!stack.empty()) result = Math.max(result, i - stack.peek());
                else stack.push(i);
            }
        }
        return result;
    }

    private static boolean checkstring(String s1, String s2, String s) {
        if (s1.length() + s2.length() != s.length()) return false;
        return checkStringUtil(s1.toCharArray(), 0, s2.toCharArray(), 0, s.toCharArray(), 0) || checkStringUtil(s2.toCharArray(), 0, s1.toCharArray(), 0, s.toCharArray(), 0);
    }

    private static boolean checkStringUtil(char[] c1, int i1, char[] c2, int i2, char[] chars, int index) {
        if (i1 >= c1.length) return false;
        if (c1[i1] != chars[index]) return false;
        if (i1 + i2 == chars.length - 2) return true;
        return checkStringUtil(c1, i1 + 1, c2, i2, chars, index + 1) || checkStringUtil(c2, i2, c1, i1 + 1, chars, index + 1);
    }


    private static int isJump(int[] arr) {
        if (arr.length <= 1) return 1;
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && max <= i) return 0;
            if (i + arr[i] > max) max = i + arr[i];
        }
        return max >= arr.length - 1 ? 1 : 0;
    }

    private static int getJump(int[] arr) {
        int[] dp = new int[arr.length];
        int step = getJumputil(arr, 0, dp, arr.length - 1);
        return step;
    }

    private static int getJumputil(int[] arr, int curIndex, int[] dp, int N) {
        if (curIndex >= N) return 0;
        if (dp[curIndex] != 0) {
            return dp[curIndex];
        }
        if (arr[curIndex] == 0) {
            dp[curIndex] = -1;
        }
        for (int i = 1; i <= arr[curIndex]; i++) {
            int steps = getJumputil(arr, curIndex + i, dp, N);
            if (dp[curIndex] == 0) dp[curIndex] = steps + 1;
            else if (steps != -1) dp[curIndex] = Math.min(dp[curIndex], steps + 1);
        }
        if (dp[curIndex] <= 0) dp[curIndex] = -1;
        return dp[curIndex];
    }

    private static int getLisDis(int[] arr) {
        if (arr.length < 2) return arr.length;
        int[] lis = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) lis[i] = Math.max(lis[i], 1 + lis[j]);
            }
        }
        int[] lds = new int[arr.length];
        for (int i = arr.length; i >= 0; i--) {
            lds[i] = 1;
            for (int j = arr.length; j > i; j--) {
                if (arr[j] < arr[i]) lds[i] = Math.max(lds[i], 1 + lds[j]);
            }
        }
        for (int i = 0; i < lis.length; i++) {
            lds[i] += lis[i] - 1;
        }
        return findMaxArr(lds);
    }

    private static int findMaxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    private static int getLIS(int[] arr) {
        int[] max = new int[arr.length];
        int result = 1;
        max[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) max[i] = Math.max(max[i], max[j] + 1);
            }
            result = Math.max(max[i], result);
        }
        return result;
    }

    public static ListNode subtract(ListNode a) {
        if (a == null || a.next == null) return a;
        ListNode prevMid = getMid(a);
        prevMid.next = reverseList(prevMid.next);
        ListNode temp = prevMid.next, forward = a;
        while (temp != null) {
            forward.val -= temp.val;
            temp = temp.next;
            forward = forward.next;
        }
        prevMid.next = reverseList(prevMid.next);
        return a;
    }

    private static ListNode getMid(ListNode a) {
        ListNode slow = a, fast = a;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static String pall(String s) {
        if (s.length() < 2) return s;
        Index[][] dp = new Index[s.length()][s.length()];
        //Integer maxval = 0;
        Index i = pallUtil(s.toCharArray(), 0, s.length() - 1, dp);
        return s.substring(i.getStart(), i.getEnd() + 1);
    }

    private static Index pallUtil(char[] s, int start, int end, Index[][] dp) {
        if (start == end) return new Index(start, end);
        if (end - start == 1) {
            if (s[start] == s[end]) return new Index(start, end);
            else return new Index(start, start);
        }
        if (dp[start][end] == null) {
            Index i1 = pallUtil(s, start + 1, end - 1, dp);
            Index i2 = pallUtil(s, start + 1, end, dp);
            Index i3 = pallUtil(s, start, end - 1, dp);
            if (s[start] == s[end] && i1.getStart() == start + 1 && i1.getEnd() == end - 1)
                i1 = new Index(start, end);
            dp[start][end] = Index.max(i1, i2, i3);
        }
        return dp[start][end];
    }

    private static int isPallindrome(String s, int start, int end) {
        char[] chars = s.substring(start, end).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) return -1;
        }
        return 1;
    }

    private static ArrayList<Integer> generateGrayCode(int n) {
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(0, 1));
        ArrayList<Integer> temp;
        for (int i = 1; i < n; i++) {
            temp = new ArrayList<>(result);
            Collections.reverse(temp);
            for (int j = 0; j < temp.size(); j++) {
                temp.set(j, temp.get(j) | (1 << i));
            }
            result.addAll(temp);
        }
        return result;
    }

    private static ArrayList<String> convertResult(int[][] result, int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (result[i][j] == 0) builder.append(".");
                else builder.append("Q");
            }
            res.add(builder.toString());
        }
        return res;
    }

    private static ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        nQueenUtil(new int[n][n], 0, 1, n, result);
        return result;
    }

    private static void nQueenUtil(int[][] board, int col, int queenCounter, int n, ArrayList<ArrayList<String>> result) {
        if (queenCounter > n) {
            result.add(convertResult(board, n));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(i, col, board, n)) {
                board[i][col] = 1;
                nQueenUtil(board, col + 1, queenCounter + 1, n, result);
                board[i][col] = 0;
            }
        }
    }

    private static boolean isValid(int row, int col, int[][] board, int n) {
        for (int i = 0; i < n; i++) if (board[i][col] == 1) return false;
        for (int i = 0; i < n; i++) if (board[row][i] == 1) return false;
        for (int i = 0; row + i < n && col + i < n; i++) if (board[row + i][col + i] == 1) return false;
        for (int i = 0; row - i >= 0 && col - i >= 0; i++) if (board[row - i][col - i] == 1) return false;
        for (int i = 0; row + i < n && col - i >= 0; i++) if (board[row + i][col - i] == 1) return false;
        for (int i = 0; row - i >= 0 && col + i < n; i++) if (board[row - i][col + i] == 1) return false;
        return true;
    }


    private static int[] colMat = new int[]{-1, 1, -1, 1, 2, 2, -2, -2};
    private static int[] rowMat = new int[]{-2, -2, 2, 2, -1, 1, -1, 1};

    private static int[][] knightMoves(int n) {
        boolean[][] visitedMatrix = new boolean[n][n];
        int[][] movesMatrix = new int[n][n];
        movesMatrix[0][0] = 0;
        movesMatrix[2][1] = 1;
        visitedMatrix[0][0] = true;
        knightMovesUtil(movesMatrix, 2, 1, 1, visitedMatrix, n);
        return movesMatrix;
    }

    private static boolean knightMovesUtil(int[][] movesMatrix, int curRow, int curCol, int moveCount, boolean[][] visitedMatrix, int n) {
        visitedMatrix[curRow][curCol] = true;
        if (moveCount == n * n - 1) return true;
        for (int i = 0; i < 8; i++) {
            if (isValidMove(curRow + rowMat[i], curCol + colMat[i], n, visitedMatrix)) {
                if (knightMovesUtil(movesMatrix, curRow + rowMat[i], curCol + colMat[i], moveCount + 1, visitedMatrix, n))
                    return true;
            }
        }
        visitedMatrix[curRow][curCol] = false;
        return false;
    }

    private static boolean isValidMove(int curRow, int curCol, int n, boolean[][] visited) {
        return curCol < n && curRow < n && curCol > 0 && curRow > 0 && !visited[curRow][curCol];
    }

    public static int minMatrixSum(ArrayList<ArrayList<Integer>> a) {
        int row = a.size(), col = a.get(0).size();
        int[][] dp = new int[row][col];
        return minMatrixSumUtil(a, 0, 0, row, col, dp);
    }

    private static int minMatrixSumUtil(ArrayList<ArrayList<Integer>> arr, int row, int col, int ROW_MAX, int COL_MAX, int[][] dp) {
        if (row >= ROW_MAX || col >= COL_MAX) return Integer.MAX_VALUE;
        if (row == ROW_MAX - 1 && col == COL_MAX - 1) return arr.get(row).get(col);
        if (dp[row][col] == 0) {
            dp[row][col] = Math.min(minMatrixSumUtil(arr, row + 1, col, ROW_MAX, COL_MAX, dp),
                    minMatrixSumUtil(arr, row, col + 1, ROW_MAX, COL_MAX, dp));
        }
        return dp[row][col] + arr.get(row).get(col);
    }


    public static int longestIncSub(final ArrayList<Integer> arrayList) {
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        int[][] dp = new int[arr.length][arr.length];
        return longestIncSubUtil(arr, 0, -1, 0, dp);
    }

    private static int longestIncSubUtil(int[] arr, int curIndex, int lastIndex, int count, int[][] dp) {
        if (curIndex == arr.length) {
            return count;
        }
        if (lastIndex == -1) {
            return longestIncSubUtil(arr, curIndex + 1, curIndex, count + 1, dp);
        }
        if (dp[curIndex][lastIndex] == 0) {
            if (arr[lastIndex] < arr[curIndex])
                dp[curIndex][lastIndex] = Math.max(longestIncSubUtil(arr, curIndex + 1, curIndex, count + 1, dp), longestIncSubUtil(arr, curIndex + 1, lastIndex, count, dp));
            else
                dp[curIndex][lastIndex] = Math.max(longestIncSubUtil(arr, curIndex + 1, lastIndex, count, dp), longestIncSubUtil(arr, curIndex + 1, curIndex, 0, dp));
        }
        return dp[curIndex][lastIndex];
    }

    private static int longestIncSubUtil(int[] arr, int curIndex, int lastIndex, int count) {
        if (curIndex == arr.length) {
            return count;
        }
        if (lastIndex == -1) return longestIncSubUtil(arr, curIndex + 1, curIndex, count + 1);
        if (arr[lastIndex] < arr[curIndex])
            return Math.max(longestIncSubUtil(arr, curIndex + 1, curIndex, count + 1), longestIncSubUtil(arr, curIndex + 1, lastIndex, count));
        else
            return Math.max(longestIncSubUtil(arr, curIndex + 1, lastIndex, count), longestIncSubUtil(arr, curIndex + 1, curIndex, 0));
    }

    private static int max(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        return c;
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int startCounter = -1, endCounter = -1, counter = 0;
        for (Interval interval : intervals) {
            if (newInterval.start >= interval.start && newInterval.start <= interval.end) startCounter = counter;
            if (newInterval.end >= interval.start && newInterval.end <= interval.end) endCounter = counter;
            counter++;
        }
        intervals.get(startCounter).end = intervals.get(endCounter).end;
        int total = endCounter - startCounter;
        while (total > 0) {
            intervals.remove(startCounter + 1);
        }
        return intervals;
    }


    private static int min(int x, int y, int z) {
        if (x < y && x < z) return x;
        if (y < x && y < z) return y;
        else return z;
    }

    public static int minDistance(String a, String b) {
        int[][] dp = new int[a.length()][b.length()];
        dp[0][0] = 0;
        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = -1;
        return editDistanceUtil(a, a.length(), b, b.length(), dp);
    }

    private static int editDistanceUtil(String a, int l1, String b, int l2, int[][] dp) {
        if (l1 == 0) return l2;
        if (l2 == 0) return l1;
        if (dp[l1 - 1][l2 - 1] == -1) {
            if (a.charAt(l1 - 1) == b.charAt(l2 - 1)) {
                dp[l1 - 1][l2 - 1] = editDistanceUtil(a, l1 - 1, b, l2 - 1, dp);
            } else {
                dp[l1 - 1][l2 - 1] = 1 + min(editDistanceUtil(a, l1, b, l2 - 1, dp), editDistanceUtil(a, l1 - 1, b, l2, dp), editDistanceUtil(a, l1 - 1, b, l2 - 1, dp));
            }
        }
        return dp[l1 - 1][l2 - 1];
    }

    private static int minDistanceUtil(int idx1, String a, int idx2, String b) {
        if (idx1 >= a.length() || idx2 >= b.length()) return 0;
        if (a.charAt(idx1) == b.charAt(idx2)) {
            return 1 + minDistanceUtil(idx1 + 1, a, idx2 + 1, b);
        }
        return Math.max(minDistanceUtil(idx1 + 1, a, idx2, b), minDistanceUtil(idx1, a, idx2 + 1, b));
    }

    public static int checkInterleaved(String str1, String str2, String interleavedString) {
        return checkInterleavedUtil(0, new StringBuilder(), str1.toCharArray(), 0, str2.toCharArray(), interleavedString) ? 1 : 0;
    }

    private static boolean checkInterleavedUtil(int builder1Index, StringBuilder curBuilder, char[] chars1, int builder2Index, char[] chars2, String interleavedString) {
        if (curBuilder.toString().equalsIgnoreCase(interleavedString)) return true;
        if (curBuilder.length() == interleavedString.length()) return false;
        boolean res1 = false;
        if (builder1Index < chars1.length) {
            res1 = checkInterleavedUtil(builder1Index + 1, curBuilder.append(chars1[builder1Index]), chars1,
                    builder2Index, chars2, interleavedString);
            curBuilder.deleteCharAt(curBuilder.length() - 1);
        }
        boolean res2 = false;
        if (builder2Index < chars2.length) {
            res2 = checkInterleavedUtil(builder1Index, curBuilder.append(chars2[builder2Index]), chars1,
                    builder2Index + 1, chars2, interleavedString);
            curBuilder.deleteCharAt(curBuilder.length() - 1);
        }
        return res1 | res2;
    }

    public static int xorOp(ArrayList<Integer> arrayList) {
        int tempRes = 0, x = 1;
        int res = 0;
        for (int j = 0; j < Integer.SIZE; j++) {
            x = (1 << j);
            tempRes = 0;
            for (Integer anArrayList : arrayList) {
                tempRes += anArrayList & x;
            }
            if (tempRes % 3 != 0) res |= x;
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permuteUtil(new ArrayList<>(), a, result);
        return result;
    }

    private static void permuteUtil(ArrayList<Integer> currList, ArrayList<Integer> integers, ArrayList<ArrayList<Integer>> result) {
        if (integers.isEmpty()) {
            result.add(new ArrayList<>(currList));
            return;
        }
        for (int i = 0; i < integers.size(); i++) {
            currList.add(integers.remove(i));
            permuteUtil(currList, integers, result);
            integers.add(i, currList.remove(currList.size() - 1));
        }
    }

    public static int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 1;
        return countWaysUtil(n, dp);
    }

    private static int countWaysUtil(int step, int[] dp) {
        if (dp[step] == 0) {
            dp[step] = countWaysUtil(step - 1, dp) + countWaysUtil(step - 2, dp);
        }
        return dp[step];
    }

    public static ArrayList<String> generateParanthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        generateParanthesisUtil(new StringBuilder(), n - 1, n - 1, result);
        return result;
    }

    private static void generateParanthesisUtil(StringBuilder builder, int openingBracesCount, int closingBracesCount, ArrayList<String> result) {
        if (openingBracesCount - closingBracesCount > 1) return;
        if (openingBracesCount == 0 || closingBracesCount == 0) {
            StringBuilder tempBuilder = new StringBuilder(builder.toString());
            for (int i = 0; i < openingBracesCount; i++) tempBuilder.append("(");
            for (int i = 0; i < closingBracesCount; i++) tempBuilder.append(")");
            tempBuilder.insert(0, "(").append(")");
            result.add(tempBuilder.toString());
            return;
        }
        generateParanthesisUtil(builder.append("("), openingBracesCount - 1, closingBracesCount, result);
        builder.deleteCharAt(builder.length() - 1);
        generateParanthesisUtil(builder.append(")"), openingBracesCount, closingBracesCount - 1, result);
        builder.deleteCharAt(builder.length() - 1);
    }

    public static ArrayList<String> letterCombinations(String a) {
        HashMap<Integer, ArrayList<Character>> map = new HashMap<>();
        ArrayList<Character> tempCharArray = new ArrayList<>();
        tempCharArray.add('1');
        map.put(1, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('0');
        map.put(0, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('a');
        tempCharArray.add('b');
        tempCharArray.add('c');
        map.put(2, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('d');
        tempCharArray.add('e');
        tempCharArray.add('f');
        map.put(3, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('g');
        tempCharArray.add('h');
        tempCharArray.add('i');
        map.put(4, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('j');
        tempCharArray.add('k');
        tempCharArray.add('l');
        map.put(5, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('m');
        tempCharArray.add('n');
        tempCharArray.add('o');
        map.put(6, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('p');
        tempCharArray.add('q');
        tempCharArray.add('r');
        tempCharArray.add('s');
        map.put(7, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('t');
        tempCharArray.add('u');
        tempCharArray.add('v');
        map.put(8, new ArrayList<>(tempCharArray));
        tempCharArray.clear();
        tempCharArray.add('w');
        tempCharArray.add('x');
        tempCharArray.add('y');
        tempCharArray.add('z');
        map.put(9, new ArrayList<>(tempCharArray));
        tempCharArray.clear();

        ArrayList<ArrayList<Character>> lists = new ArrayList<>();
        for (Character character : a.toCharArray()) {
            lists.add(map.get(character - '0'));
        }
        int k = a.length();
        ArrayList<String> res = new ArrayList<>();
        letterCombinationsUtil(0, lists, new StringBuilder(), res);
        return res;
    }

    private static void letterCombinationsUtil(int index, ArrayList<ArrayList<Character>> lists, StringBuilder builder, ArrayList<String> result) {
        if (index == lists.size()) {
            result.add(builder.toString());
            return;
        }
        for (Character c : lists.get(index)) {
            letterCombinationsUtil(index + 1, lists, builder.append(c), result);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private static void findSubsets(StringBuilder builder, int index, int k, ArrayList<String> res, ArrayList<Character> characterSet) {
        if (index == characterSet.size()) {
            if (builder.length() == k) res.add(builder.toString());
            return;
        }
        findSubsets(builder.append(characterSet.get(index)), index + 1, k, res, characterSet);
        findSubsets(builder.deleteCharAt(builder.length() - 1), index + 1, k, res, characterSet);

    }

    public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        combineSubsets(current, 0, result, k, n);
        return result;
    }

    private static void combineSubsets(ArrayList<Integer> current, int index, ArrayList<ArrayList<Integer>> result, int k, int n) {
        if (index == n) {
            if (current.size() == k) result.add(new ArrayList<>(current));
            return;
        }
        ArrayList<Integer> temp = new ArrayList<>(current);
        temp.add(index + 1);
        combineSubsets(temp, index + 1, result, k, n);
        combineSubsets(current, index + 1, result, k, n);
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        int[] arr = new int[a.size()];
        int i = 0;
        for (Integer integer : a) {
            arr[i++] = integer;
        }
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        findSubsets(input, 0, arr, result);
        return result;
    }

    private static void findSubsets(ArrayList<Integer> input, int index, int[] arr, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(input));
            return;
        }
        ArrayList<Integer> x = new ArrayList<>(input);
        x.add(arr[index]);
        findSubsets(x, index + 1, arr, result);
        findSubsets(input, index + 1, arr, result);
    }

    public static int evalRPN(ArrayList<String> a) {
        Stack<Integer> stack = new Stack<>();
        int x, y;
        for (String str : a) {
            switch (str) {
                case "+":
                    x = stack.pop();
                    y = stack.pop();
                    stack.add(x + y);
                    break;
                case "-":
                    x = stack.pop();
                    y = stack.pop();
                    stack.add(y - x);
                    break;
                case "*":
                    x = stack.pop();
                    y = stack.pop();
                    stack.add(x * y);
                    break;
                case "/":
                    x = stack.pop();
                    y = stack.pop();
                    if (x == 0) return 0;
                    stack.add(y / x);
                    break;
                default:
                    stack.push(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }


    public static String simplifyPath(String a) {
        String[] dirs = a.substring(1).split("/");
        Stack<String> stack = new Stack<>();
        for (String dir : dirs) {
            if (dir.equalsIgnoreCase(".")) continue;
            else if (dir.equalsIgnoreCase("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else stack.push(dir);
        }
        StringBuilder builder = new StringBuilder();
        for (String dir : stack) {
            if (!dir.isEmpty()) builder.append("/").append(dir);
        }
        if (builder.length() == 0) builder.append("/");
        return builder.toString();
    }

    private static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : arr) {
            while (!stack.isEmpty()) {
                if (stack.peek() >= integer) stack.pop();
                else break;
            }
            if (stack.isEmpty()) result.add(-1);
            else result.add(stack.peek());
            stack.add(integer);
        }
        return result;
    }

    public static int kthsmallest(final List<Integer> a, int k) {
        /*BinaryHeap binaryHeap = new BinaryHeap(a.size());
            for (Integer integer : a) {
                binaryHeap.insert(integer);
        }
        while (k-- != 1) binaryHeap.extractMin();
        return binaryHeap.extractMin();*/
        return 0;
    }

    public static void checkPossible(int n) {
        int m = n / 2;
        int sum = (n * (n + 1)) / 2;
        int[][][] dp = new int[n][m][sum];
        System.out.println(checkSumZero(1, 0, n, m) ? "Yes" : "No");
    }

    private static boolean checkSumZero(int i, int curSum, int n, int m) {
        if (curSum == 0 && i == n && m >= 0) return true;
        if ((curSum != 0 && i >= n) || m < 0) return false;
        return checkSumZero(i + 1, curSum + i, n, m) || checkSumZero(i + 1, curSum - i, n, m - 1);
    }

    public static ListNode partition(ListNode a, int b) {
        if (a == null) return null;
        ListNode temp = a.val < b ? a : null, prev = a, next, curr = a.next;
        while (curr != null) {
            if (curr.val < b) {
                next = curr.next;
                if (temp == null || temp.next != curr) {
                    curr.next = temp == null ? a : temp.next;
                    if (temp == null) a = curr;
                    else temp.next = curr;
                    prev.next = next;
                } else {
                    prev = curr;
                }
                temp = curr;
                curr = next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return a;
    }

    public static void slidingWindow(int[] arr, int window) {
        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.addLast(arr[0]);
        int i;
        for (i = 1; i < window; i++) {
            if (arr[dequeue.peekLast()] <= arr[i]) {
                dequeue.pollLast();
                dequeue.addLast(i);
            }
        }
        for (; i < arr.length; i++) {
            if (arr[i] >= arr[dequeue.peekLast()]) {
                dequeue.addLast(i);
            }
        }

    }

    public static int singleNumber(final List<Integer> a) {
        int result = 0;
        for (Integer integer : a) {
            result ^= integer;
        }
        return result;
    }

    public static ListNode detectCycle(ListNode a) {
        if (a == null) return null;
        ListNode forward = a, fast = a.next, slow = a;
        while (fast != null && fast.next != null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != slow) return null;
        /*
        Method 1:
        temp = slow;
        while (true){
            do {
                if (temp==forward) return temp;
                temp = temp.next;
            }while (temp!=slow);
            forward = forward.next;
            temp = slow;
        }
        */
        // Method 2:
        while (forward != slow.next) {
            forward = forward.next;
            slow = slow.next;
        }

        return forward;
    }

    public static ListNode reverseBetween(ListNode a, int m, int n) {
        if (m == n) return a;
        ListNode temp = a;
        int counter = 1;
        if (m == 1) {
            a = reverseList(temp, n - m + 1);
            return a;
        }
        while (counter != m - 1) {
            temp = temp.next;
            counter++;
        }
        temp.next = reverseList(temp.next, n - m + 1);
        return a;
    }

    private static ListNode reverseList(ListNode node, int count) {
        if (count == 0) return node;
        ListNode temp = node, prev = null, curr = node, next;
        while (count > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count--;
        }
        node = prev;
        temp.next = curr;
        return node;
    }

    public static ListNode swapPairs(ListNode a) {
        if (a == null || a.next == null) return a;
        ListNode next, prev = null, curr = a, temp = a.next;
        while (curr != null) {
            next = curr.next;
            if (next == null) break;
            curr.next = next.next;
            next.next = curr;
            if (prev != null) prev.next = next;
            prev = curr;
            curr = curr.next;
        }
        return temp;
    }

    public static ListNode deleteDuplicates(ListNode a) {
        ListNode temp = a, temp2;
        while (temp != null) {
            temp2 = temp.next;
            while (temp2 != null && temp.val == temp2.val) {
                temp2 = temp2.next;
            }
            temp.next = temp2;
            temp = temp2;
        }
        return a;
    }

    private static ListNode reverseList(ListNode listNode) {
        if (listNode == null || listNode.next == null) return listNode;
        ListNode prev = null, curr = listNode, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        listNode = prev;
        return listNode;

    }

    public static int lPalin(ListNode A) {
        if (A == null || A.next == null) return 1;
        ListNode slow = A, fast = A, mid = null, temp, temp2;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            mid = slow;
            slow = slow.next;
        }
        int counter = 0;
        temp = A;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        if (fast != null) mid = slow;
        mid.next = reverseList(fast == null ? slow : slow.next);
        temp2 = mid.next;
        temp = A;
        if (counter % 2 == 0) {
            while (temp != mid.next) {
                if (temp.val != temp2.val) return 0;
                temp = temp.next;
                temp2 = temp2.next;
            }
        } else {
            while (temp != mid) {
                if (temp.val != temp2.val) return 0;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        return 1;
    }

    public static void printBits(long a) {
        System.out.println();
        for (int i = Long.SIZE - 1; i >= 0; i--) {
            System.out.print((a & ((long) 1 << i)) != 0 ? "1 " : "0 ");
        }
        System.out.println();
    }

    public static int numSetBits(long a) {
        int countSetBts = 0;
        while (a > 0) {
            if ((a & 1) == 1) countSetBts++;
            a >>= 1;
        }
        return countSetBts;
    }

    public static long reverseBits(long a) {
        long reverseNum = 0;
        for (int i = 0; i < 32; i++) {
            if ((a & ((long) 1 << i)) != 0) {
                reverseNum |= ((long) 1 << (32 - i - 1));
            }
        }
        System.out.println(reverseNum);
        return reverseNum;
    }

    private static long reverseBit(long a, int i, int j) {
        a = a ^ (1 << i);
        a = a ^ (1 << j);
        return a;
    }

    private static ArrayList<Integer> arrayToInteger(int[] arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            arrayList.add(arr2[i]);
        }
        return arrayList;
    }

    private static ArrayList<String> arrayToString(String[] arr2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            arrayList.add(arr2[i]);
        }
        return arrayList;
    }

    /*public static int removeDuplicates(ArrayList<Integer> a) {
        if (a.size()<2) return a.size();
        int i=0,j=1;
        while (j<a.size()){
           if (!a.get(i).equals(a.get(j))){
               i++;
               a.set(i,a.get(j));
           }
            j++;
        }
        return i+1;
    }*/

    public static int removeDuplicates(ArrayList<Integer> a) {
        if (a.size() <= 1) {
            return a.size();
        }
        int counter = 0;
        int i = 0;
        int j = 1;
        while (j < a.size()) {
            if (a.get(i) == a.get(j)) {
                j++;
                continue;
            }
            i++;
            a.set(i, a.get(j));
            j++;
        }
        return i + 1;
    }

    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
        Collections.sort(a);
        ArrayList<ArrayList<Integer>> solutionSet = new ArrayList<>();
        int val = 0;
        int C = a.size() - 1;
        while (C > 1) {
            int A = 0, B = C - 1;
            while (A < B) {
                val = a.get(A) + a.get(B) + a.get(C);
                if (val == 0) {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(a.get(A));
                    integers.add(a.get(B));
                    integers.add(a.get(C));
                    solutionSet.add(integers);
                    do {
                        B--;
                    } while (B > 0 && a.get(B).equals(a.get(B + 1)));
                }
                if (val < 0) {
                    A++;
                } else if (val > 0) {
                    B--;
                }
            }
            do {
                C--;
            } while (C > 1 && a.get(C).equals(a.get(C + 1)));
        }
        return solutionSet;
    }

    public static void printList(ArrayList<Integer> arrayList) {
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }


    public static int threeSumClosest(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        int minAbsDiff = Integer.MAX_VALUE, val = 0, closestVal = 0;
        for (int i = 0, A = 0, B = 1, C = a.size() - 1; B < C && A < B; ) {
            val = a.get(A) + a.get(B) + a.get(C);
            if (minAbsDiff > Math.abs(b - val)) {
                minAbsDiff = Math.abs(b - val);
                closestVal = val;
            }
            if (val < b) {
                if (C - B > 1) B++;
                else A++;
            } else {
                C--;
            }
        }
        return closestVal;
    }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int absMin = Integer.MAX_VALUE;
        for (int i = A.size() - 1, j = B.size() - 1, k = C.size() - 1; i >= 0 && j >= 0 && k >= 0; ) {
            if (calcAbsMin(A.get(i), B.get(j), C.get(k)) < absMin) absMin = calcAbsMin(A.get(i), B.get(j), C.get(k));
            if (A.get(i) > B.get(j) && A.get(i) > C.get(k)) i--;
            else if (B.get(j) > A.get(i) && B.get(j) > C.get(k)) j--;
            else if (C.get(k) > B.get(j) && A.get(i) < C.get(k)) k--;
        }
        return absMin;
    }

    private static int calcAbsMin(Integer integer, Integer integer1, Integer integer2) {
        return Math.abs(Math.max(Math.max(integer, integer1), integer2) - Math.min(Math.min(integer, integer1), integer2));
    }


    public static int solution2(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }

    public static int solution(int A, int B) {
        A = Math.max(A, 0);
        B = Math.max(B, 0);
        // write your code in Java SE 8
        return (int) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1);
    }

    public static int sqrt(int x) {
        long i = 0;
        long j = x / 2 + 1;
        while (i <= j) {
            long mid = (i + j) / 2;
            if (mid * mid == x)
                return (int) mid;
            if (mid * mid < x)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return (int) j;
    }

    public static int pow(int x, int n, int d) {
        n = 1 + n % d;
        while (n > 1) {
            x *= x;
            n--;
        }
        int rem = x % d;
        return rem < 0 ? d + rem : rem;
    }

    public static void arrange(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) + (a.get(a.get(i)) % a.size()) * a.size());
        }
        for (int i = 0; i < a.size(); i++) {
            a.set(i, a.get(i) / a.size());
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static int uniquePaths(int a, int b) {
        int[][] arr = new int[a][b];
        int[][] dp = new int[a][b];
        for (int i = 0; i < a; i++) for (int j = 0; j < b; j++) dp[i][j] = -1;
        return uniquePathsUtil(arr, dp, 0, 0, a, b);
    }

    private static int uniquePathsUtil(int[][] arr, int[][] dp, int row, int col, int ROW_MAX, int COL_MAX) {
        if (row >= ROW_MAX || col >= COL_MAX) return 0;
        if (row == ROW_MAX - 1 && col == COL_MAX - 1) return 1;
        if (dp[row][col] != -1) return dp[row][col];
        else
            dp[row][col] = uniquePathsUtil(arr, dp, row + 1, col, ROW_MAX, COL_MAX) + uniquePathsUtil(arr, dp, row, col + 1, ROW_MAX, COL_MAX);
        return dp[row][col];
    }

    public static int hammingDistance(final List<Integer> A) {
        int hammingDistance = 0;
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                hammingDistance += findHammingDistance(A.get(i), A.get(j)) * 2;
            }
        }
        return hammingDistance % 1000000007;
    }

    public static boolean isPalindrome(int a) {
        StringBuilder builder = new StringBuilder();
        while (a > 0) {
            builder.append(a % 10);
            a /= 10;
        }
        return isPalindrome(builder.toString());
    }

    private static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) return 0;
        if (a == 0 || b == 0) return a == 0 ? b : a;
        int rem = 0;
        do {
            rem = a % b;
            if (rem == 0) break;
            a = b;
            b = rem;
        } while (rem != 0);
        return b;
    }

    private static int findHammingDistance(Integer first, Integer second) {
        int counter = 0;
        while (first != 0 || second != 0) {
            if ((first & 1) != (second & 1)) counter++;
            first /= 2;
            second /= 2;
        }
        return counter;
    }

    public static int titleToNumber(String a) {
        char[] chars = a.toCharArray();
        int col = 0;
        for (int i = chars.length - 1, power = 0; i >= 0; i--) {
            col += (int) Math.pow(26, power++) * (chars[i] - 'A' + 1);
        }
        return col;
    }

    public static int strStr(final String haystack, final String needle) {
        if (haystack.isEmpty() || needle.isEmpty()) return -1;
        return strStrUtil(haystack.toCharArray(), needle.toCharArray());
    }

    private static int strStrUtil(char[] haystack, char[] needle) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle[0]) {
                int k = i++, j = 1;
                for (; j < needle.length && i < haystack.length; j++, i++) {
                    if (haystack[i] != needle[j]) break;
                }
                if (j == needle.length) return k;
                i = k;
            }
        }
        return -1;
    }

    public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        if (a == 1) {
            arr.add(new ArrayList<Integer>());
            arr.get(0).add(1);
        } else {
            int n = 2 * a - 1;
            int[][] array = new int[n][n];
            int i, k = 0, l = 0, m = n;

            while (k < m && l < n) {
                for (i = l; i < n; ++i) {
                    array[k][i] = a;
                }
                k++;

                for (i = k; i < m; ++i) {
                    array[i][n - 1] = a;
                }
                n--;

                if (k < m) {
                    for (i = n - 1; i >= l; --i) {
                        array[m - 1][i] = a;
                    }
                    m--;
                }

                if (l < n) {
                    for (i = m - 1; i >= k; --i) {
                        array[i][l] = a;
                    }
                    l++;
                }
                a--;
            }
            for (int x = 0; x < array.length; x++) {
                arr.add(new ArrayList<Integer>());
                for (int y = 0; y < array[x].length; y++) {
                    arr.get(x).add(array[x][y]);
                }
            }
        }
        return arr;
    }


    //Definition for singly-linked list.
    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    private static void printSolution(int board[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }


    private int[] mergeSort(int[] arr) {
        mergeSortutil(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSortutil(int[] arr, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSortutil(arr, l, m);
            mergeSortutil(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + i];
        }
        int i, j, k;
        for (i = 0, j = 0, k = 0; i < n1 + n2; i++) {
            if (L[i] > R[j]) arr[l + k] = L[i];
            else if (L[i] < R[j]) arr[l + k] = R[j];
            k++;
        }
        for (; i < n1; i++, k++) arr[k] = L[i];
        for (; j < n2; j++, k++) arr[k] = L[j];
    }


    public static ListNode mergeKLists(ArrayList<ListNode> listNodes) {
        ListNode result = new ListNode(-1), temp;
        int count = 0;
        for (int i = 0; i < listNodes.size(); i++) {
            temp = listNodes.get(i);
            while (temp != null) {
                temp = temp.next;
                count++;
            }
        }
        BinaryMinHeap heap = new BinaryMinHeap(listNodes.size());
        for (int i = 0; i < listNodes.size(); i++) {
            heap.insert(listNodes.get(i));
        }
        temp = result;
        for (int i = 0; i < count; i++) {
            HashMap<String, String> map = new HashMap();
            map.put("dfghjkl", "dfghjk");
            temp.next = heap.extractMin();
            temp = temp.next;
        }
        return result.next;
    }

    static class BinaryMinHeap {


        private ListNode[] heap;
        private int N;
        private int counter;

        public BinaryMinHeap(int size) {
            N = size;
            heap = new ListNode[N + 1];
            counter = 0;
        }

        private int parent(int i) {
            return i / 2;
        }

        private int left(int i) {
            return i * 2;
        }

        private int right(int i) {
            return i * 2 + 1;
        }

        private void heapify(int index) {
            int r = right(index), l = left(index), max = index;
            if (r <= counter && heap[max].val > heap[r].val) max = r;
            if (l <= counter && heap[max].val > heap[l].val) max = l;
            if (max != index) {
                swap(max, index);
                heapify(max);
            }
        }

        private void swap(int a, int b) {
            ListNode temp = heap[a];
            heap[a] = heap[b];
            heap[b] = temp;
        }

        public void insert(ListNode node) {
            if (counter == N) throw new IllegalStateException("dbj");
            heap[++counter] = node;
            int i = counter;
            while (i > 1 && heap[i].val < heap[parent(i)].val) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        private ListNode extractMin() {
            if (counter == 0) return null;
            ListNode root = heap[1];
            heap[1] = root.next != null ? root.next : new ListNode(Integer.MAX_VALUE);
            heapify(1);
            return root;
        }

    }

}
