package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/cheapest-flights-within-k-stops/
public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
        //int[][] flights = {{0, 1, 1}, {0, 2, 5}, {1, 2, 1}, {2, 3, 1}};
        //int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int[][] flights = {{0, 1, 5}, {1, 2, 5}, {0, 3, 2}, {3, 1, 2}, {1, 4, 1}, {4, 2, 1}};

        System.out.println(findCheapestPrice2(5, flights, 0, 2, 2));
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }


    public static int findCheapestPrice2(int n, int[][] flights, int src, int dst, int K) {
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[dst] = 0;
        boolean[] visited = new boolean[n];
        visited[dst] = true;
        ArrayList<Pair>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (int[] edge : flights) {
            adjacencyList[edge[0]].add(new Pair(edge[1], edge[2]));
        }
        int cost = dfs(src, adjacencyList, visited, prices, K);
        return cost == Integer.MAX_VALUE ? -1 : cost;
    }

    private static int dfs(int curVertex, ArrayList<Pair>[] adjacencyList, boolean[] visited, int[] prices, int k) {
        if (visited[curVertex] && k > -1) {
            return prices[curVertex];
        } else if (visited[curVertex] && k < 0) {
            return Integer.MAX_VALUE;
        }
        visited[curVertex] = true;
        for (Pair pair : adjacencyList[curVertex]) {
            int temp = dfs(pair.first, adjacencyList, visited, prices, k - 1);
            if (temp != Integer.MAX_VALUE) prices[curVertex] = Math.min(prices[curVertex], temp + pair.second);
        }
        if (k < 0) return Integer.MAX_VALUE;
        return prices[curVertex];
    }


    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        if (n == 1 || src == dst) return 0;
        if (flights.length < 1) return -1;
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n];
        ArrayList<Pair>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (int[] edge : flights) {
            adjacencyList[edge[0]].add(new Pair(edge[1], edge[2]));
        }
        prices[src] = 0;
        for (int i = 0; i <= K; i++) {
            int index = findMinIndex(prices, visited);
            if (index == -1) {
                break;
            }
            visited[index] = true;
            for (Pair edge : adjacencyList[index]) {
                prices[edge.first] = Math.min(prices[edge.first], prices[index] + edge.second);
            }
        }
        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }

    private static int findMinIndex(int[] delay, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int curIndex = -1;
        for (int i = 0; i < delay.length; i++) {
            if (!visited[i] && delay[i] < min) {
                min = delay[i];
                curIndex = i;
            }
        }
        return curIndex;
    }
}

