package leetcode.hard;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class BinaryTreeMaximumPathSum {

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
        TreeNode root = new TreeNode(-11);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxPathSum(root));
    }

    private static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return maxSum;
    }

    private static int maxPathSumUtil(TreeNode node) {
        if (node == null) return 0;
        int left = maxPathSumUtil(node.left);
        int right = maxPathSumUtil(node.right);
        int total = left + right + node.val;
        if (node.val > maxSum) maxSum = node.val;
        if (node.val + left > maxSum) maxSum = node.val + left;
        if (node.val + right > maxSum) maxSum = node.val + right;
        if (total > maxSum) maxSum = total;
        return Math.max(Math.max(left, right), 0) + node.val;
    }
}

