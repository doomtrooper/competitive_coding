package leetcode.medium;

//https://leetcode.com/problems/distribute-coins-in-binary-tree/
public class DistributeCoinsinBinaryTree {
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

    public static class IntWrapper {
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

        public void setValue(int value) {
            this.a = value;
        }
    }

    public static void main(String[] args) {
        
    }

    public static int distributeCoins(TreeNode root) {
        IntWrapper distance = new IntWrapper(0);
        distributeCoinsUtil(root, distance);
        return distance.a;
    }

    private static int distributeCoinsUtil(TreeNode node, IntWrapper distance) {
        if (node == null)
            return 0;
        int leftCount = distributeCoinsUtil(node.left, distance);
        int rightCount = distributeCoinsUtil(node.right, distance);
        distance.setValue(Math.abs(leftCount) + Math.abs(rightCount) + distance.a);
        return leftCount + rightCount + node.val - 1;
    }
}