package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/minimum-height-trees/
public class MinimumHeightTrees {
    public static void main(String[] args) {
        int n = 6;

        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {3, 4}, {4, 5}};
        findMinHeightTrees(n, edges);
    }

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> graphVertices = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            graphVertices.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            graphVertices.get(edge[0]).add(edge[1]);
            graphVertices.get(edge[1]).add(edge[0]);
        }

        result.addAll(graphVertices.keySet());
        return result;
    }




    // This is a brute force approcah having a time complexity of O(n^2)
    public static List<Integer> findMinHeightTreesBruteForce(int n, int[][] edges) {
        ArrayList<Integer>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges.length; i++) {
            adjacencyList[edges[i][0]].add(edges[i][1]);
            adjacencyList[edges[i][1]].add(edges[i][0]);
        }
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = heightOfGrapgh(i, adjacencyList, n);
        }
        List<Integer> result = new ArrayList<Integer>();
        int minHeight = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (heights[i] < minHeight) {
                result.clear();
                result.add(i);
                minHeight = heights[i];
            } else if (heights[i] == minHeight) {
                result.add(i);
            }
        }
        return result;
    }

    private static int heightOfGrapgh(int vertex, ArrayList<Integer>[] adjacencyList, int n) {
        boolean[] visited = new boolean[n];
        int height = heightOfGrapghUtil(vertex, adjacencyList, visited);
        return height;
    }

    private static int heightOfGrapghUtil(int vertex, ArrayList<Integer>[] adjacencyList, boolean[] visited) {
        visited[vertex] = true;
        int maxHeight = 0;
        for (int i = 0; i < adjacencyList[vertex].size(); i++) {
            if (!visited[adjacencyList[vertex].get(i)])
                maxHeight = Math.max(maxHeight,
                        heightOfGrapghUtil(adjacencyList[vertex].get(i), adjacencyList, visited));
        }
        return 1 + maxHeight;
    }
}
