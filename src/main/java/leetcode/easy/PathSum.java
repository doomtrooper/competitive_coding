package leetcode.easy;

import leetcode.LeetCode;

import java.io.*;
import java.util.*;

public class PathSum {
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
        System.out.println(hasPathSum(node, -1));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return hasPathSumUtil(root, sum);
    }

    private static boolean hasPathSumUtil(TreeNode node, int curSum) {
        if (node == null) return false;
        curSum -= node.val;
        if (curSum == 0 && node.left == null && node.right == null) return true;
        return hasPathSumUtil(node.left, curSum) || hasPathSumUtil(node.right, curSum);
    }
}

