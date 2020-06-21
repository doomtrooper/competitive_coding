package leetcode.medium;

import java.util.*;

//https://leetcode.com/problems/path-sum-ii/
public class PathSumII {
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

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(-2);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(-2);
        TreeNode node7 = new TreeNode(-1);
        node.left = node2;
        node.right = node3;
        node.right.left = node6;
        node.left.left = node4;
        node.left.right = node5;
        node4.left = node7;
        System.out.println(pathSum(node, -1));
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curPath = new ArrayList<>();
        if (root != null) pathSumUtil(root, sum, result, curPath);
        return result;
    }

    private static void pathSumUtil(TreeNode node, int curSum, List<List<Integer>> result, List<Integer> curPath) {
        if (node == null) return;
        curSum -= node.val;
        curPath.add(node.val);
        if (curSum == 0 && node.left == null && node.right == null) {
            List<Integer> temp = new ArrayList<>(curPath);
            result.add(temp);
            curPath.remove(curPath.size() - 1);
            return;
        }
        pathSumUtil(node.left, curSum, result, curPath);
        pathSumUtil(node.right, curSum, result, curPath);
        curPath.remove(curPath.size() - 1);
    }
}

