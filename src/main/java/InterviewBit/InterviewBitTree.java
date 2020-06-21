package InterviewBit;


import java.util.*;

/**
 * Created by anand.p on 6/10/17.
 */
public class InterviewBitTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class TreeLinkNode {
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        //TreeNode node = flattenTree(treeNode);
        //Iterator iterator = new Iterator(treeNode);
        //while (iterator.hasNext()) System.out.println(iterator.next().val);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
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
        //System.out.println(diameter(treeNode).h);
        //ArrayList<Integer> inorder = postOrder(treeNode);
        //print(inorder);
        System.out.println(abc(16, 16));
    }

    public static <E> void print(ArrayList<E> list) {
        for (E e : list) {
            System.out.print(e.toString() + " ");
        }
        System.out.println();
    }


    public static ArrayList<Integer> postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode temp = stack.peek();
            if (temp.right == null) {
                res.add(temp.val);

            } else cur = temp.right;
        }
        return res;
    }

    public static int abc(int n, int b) {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        int counter = b;
        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
            /*if (counter>0){
                res[i] += res[i - 3];
                counter--;
            }*/

        }
        return res[n];
    }

    public static ArrayList<Integer> inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

    public static Height diameter(TreeNode node) {
        Height diameter = new Height(0);
        diameterUtil(node, diameter);
        return diameter;
    }

    private static int diameterUtil(TreeNode node, Height diameter) {
        if (node == null) return 0;
        int ld = diameterUtil(node.left, diameter);
        int rd = diameterUtil(node.right, diameter);
        if (ld + rd + 1 > diameter.h) diameter.h = ld + rd + 1;
        return 1 + Math.max(ld, rd);
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        int count;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            count = queue.size();
            ArrayList<Integer> integers = new ArrayList<>();
            while (count-- > 0) {
                TreeNode temp = queue.poll();
                integers.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            result.add(integers);
        }
        return result;
    }

    public static TreeNode invertTree(TreeNode root) {
        TreeNode temp = root;
        invertTreeUtil(temp);
        return root;
    }

    private static void invertTreeUtil(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTreeUtil(root.left);
        invertTreeUtil(root.right);
    }

    private static int minDepth(TreeNode root) {
        return minDepthutil(root, 0);
    }

    private static int minDepthutil(TreeNode root, int depth) {
        if (root.left == null && root.right == null) return depth + 1;
        else if (root.left == null) return minDepthutil(root.right, depth + 1);
        else if (root.right == null) return minDepthutil(root.left, depth + 1);
        else return Math.min(minDepthutil(root.left, depth + 1), minDepthutil(root.right, depth + 1));
    }

    private static TreeNode formBST(int[] arr) {
        int low = 0, high = arr.length - 1;
        return formBSTUtil(arr, low, high);
    }

    private static TreeNode formBSTUtil(int[] arr, int low, int high) {
        if (high < low) return null;
        if (low == high) return new TreeNode(arr[low]);
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = formBSTUtil(arr, low, mid - 1);
        node.right = formBSTUtil(arr, mid + 1, high);
        return node;
    }

    public static class Iterator {
        private TreeNode cur;
        private Stack<TreeNode> stack;

        public Iterator(TreeNode root) {
            stack = new Stack<>();
            fillStack(root);
        }

        public void fillStack(TreeNode node) {
            TreeNode temp = node;
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public TreeNode next() {
            if (stack.isEmpty()) return null;
            cur = stack.pop();
            if (cur.right != null) {
                fillStack(cur.right);
            }
            return cur;
        }

    }

    private static TreeNode kthSmallest(TreeNode node, int k) {
        return kthSmallestUtil(node, new Height(k));
    }

    private static TreeNode kthSmallestUtil(TreeNode node, Height k) {
        if (node == null) return null;
        TreeNode temp;
        temp = kthSmallestUtil(node.left, k);
        if (temp != null) return temp;
        k.h--;
        if (k.h == 0) return node;
        temp = kthSmallestUtil(node.right, k);
        return temp;
    }

    private static boolean aFound, bFound;
    private static TreeNode result;

    public static TreeNode findAncestor(TreeNode node, int a, int b) {
        findAncestorUtil(node, a, b);
        return result;
    }

    private static boolean findAncestorUtil(TreeNode node, int a, int b) {
        if (node == null) return false;
        boolean n1, n2;
        if (a == b && node.val == a) {
            result = node;
            return true;
        }
        if (node.val == a || node.val == b) {
            n1 = true;
            n2 = findAncestorUtil(node.left, a, b) || findAncestorUtil(node.right, a, b);
        } else {
            n1 = findAncestorUtil(node.left, a, b);
            n2 = findAncestorUtil(node.right, a, b);
        }
        if (n1 && n2) {
            result = node;
            return true;
        } else {
            return n1 || n2;
        }
    }

    public static TreeNode flattenTree(TreeNode node) {
        TreeNode result = null;
        flattenTreeutil(node, result);
        return result;
    }

    private static TreeNode flattenTreeutil(TreeNode node, TreeNode result) {
        if (node == null) return result;
        TreeNode temp;
        if (result == null) {
            result = new TreeNode(node.val);
            temp = result;
        } else {
            result.right = new TreeNode(node.val);
            temp = result.right;
        }
        return flattenTreeutil(node.right, flattenTreeutil(node.left, temp));
    }

    private static boolean flag = true;

    public static boolean checkBalance(TreeNode node) {
        return checkBalanceUtil(node, new Height(0));
    }

    private static int checkBalanceUtil(TreeNode node) {
        if (node == null) return 0;
        int lt = checkBalanceUtil(node.left);
        int rt = checkBalanceUtil(node.right);
        if (Math.abs(lt - rt) > 1) flag = false;
        return 1 + Math.max(lt, rt);
    }

    static class Height {
        int h;

        public Height(int h) {
            this.h = h;
        }
    }

    private static boolean checkBalanceUtil(TreeNode node, Height h) {
        if (node == null) return true;
        Height rh = new Height(0), lh = new Height(0);
        boolean lt = checkBalanceUtil(node.left, lh);
        boolean rt = checkBalanceUtil(node.right, rh);
        h.h = 1 + Math.max(rh.h, lh.h);
        return lt && rt && Math.abs(rh.h - lh.h) <= 1;
    }

    public int checkEqual(TreeNode t1, TreeNode t2) {
        if (t1 == t2) return 1;
        if (t1 == null || t2 == null) return 0;
        if (t1.val != t2.val) return 0;
        return checkEqual(t1.left, t2.left) & checkEqual(t1.right, t2.right);
    }

    public int sumNumbers(TreeNode a) {
        ArrayList<Long> nums = new ArrayList<>();
        getPathNum(a, 0, nums);
        int sum = 0;
        for (Long integer : nums) {
            sum += integer;
            sum %= 1003;
        }
        return sum;
    }

    private void getPathNum(TreeNode a, long curNum, ArrayList<Long> nums) {
        if (a == null) return;
        curNum = curNum * 10 + a.val;
        if (a.right == null && a.left == null) nums.add(curNum);
        getPathNum(a.left, curNum, nums);
        getPathNum(a.right, curNum, nums);
    }

    public int checkPathAvailable(TreeNode tree, int sum) {
        if (sum == 0) return 1;
        if (tree == null) return 0;
        return checkPathAvailable(tree, 0, sum);
    }

    private int checkPathAvailable(TreeNode tree, int curSum, int sum) {
        if (tree == null) return 0;
        curSum += tree.val;
        if (sum == curSum && tree.left == null && tree.right == null) return 1;
        return checkPathAvailable(tree.left, curSum, sum) | checkPathAvailable(tree.right, curSum, sum);
    }


    public void setNextPointer(TreeLinkNode node) {
        if (node == null) return;
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(node);
        int levelCount;
        while (!queue.isEmpty()) {
            levelCount = queue.size();
            while (levelCount > 0) {
                TreeLinkNode temp = queue.poll();
                levelCount--;
                if (levelCount != 0) temp.next = queue.peek();
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        Map<Integer, ArrayList<Integer>> result = new TreeMap<>();
        verticalOrderTraversalUtil(A, 0, result);
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        for (Integer integer : result.keySet()) {
            resultList.add(result.get(integer));
        }
        return resultList;
    }

    private void verticalOrderTraversalUtil(TreeNode a, int index, Map<Integer, ArrayList<Integer>> result) {
        if (a == null) return;
        if (result.containsKey(index)) {
            result.get(index).add(a.val);
        } else {
            ArrayList<Integer> tempList = new ArrayList<>();
            tempList.add(a.val);
            result.put(index, tempList);
        }
        verticalOrderTraversalUtil(a.right, index + 1, result);
        verticalOrderTraversalUtil(a.left, index - 1, result);
    }

    public static ArrayList<Integer> inorderTraversal(TreeNode treeNode) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversalUtil(treeNode, result);
        return result;
    }

    private static void inorderTraversalUtil(TreeNode treeNode, ArrayList<Integer> result) {
        if (treeNode == null) return;
        inorderTraversalUtil(treeNode.left, result);
        result.add(treeNode.val);
        inorderTraversalUtil(treeNode.right, result);
    }

    public ArrayList<ArrayList<Integer>> verticalOrderTraversalWithLevel(TreeNode A) {
        Map<Integer, ArrayList<Integer>> result = new TreeMap<>();
        Queue<TreeNodeDistance> queue = new LinkedList<>();
        queue.add(new TreeNodeDistance(0, A));
        while (!queue.isEmpty()) {
            TreeNodeDistance temp = queue.poll();
            if (result.containsKey(temp.dis)) {
                result.get(temp.dis).add(temp.treeNode.val);
            } else {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(temp.treeNode.val);
                result.put(temp.dis, tempList);
            }
            if (temp.treeNode.left != null) {
                queue.add(new TreeNodeDistance(temp.dis - 1, temp.treeNode.left));
            }
            if (temp.treeNode.right != null) {
                queue.add(new TreeNodeDistance(temp.dis + 1, temp.treeNode.right));
            }
        }
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        for (Integer integer : result.keySet()) {
            resultList.add(result.get(integer));
        }
        return resultList;
    }


    class TreeNodeDistance {
        int dis;
        TreeNode treeNode;

        TreeNodeDistance(int x, TreeNode node) {
            dis = x;
            treeNode = node;
        }
    }
}
