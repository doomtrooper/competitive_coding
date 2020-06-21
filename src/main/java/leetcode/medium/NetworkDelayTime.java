package leetcode.medium;

import java.util.*;

//https://leetcode.com/problems/network-delay-time/
public class NetworkDelayTime {
    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        System.out.println(networkDelayTime(times, 4, 2));
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static int networkDelayTime(int[][] times, int N, int K) {
        if (N == 1) return 0;
        K -= 1;
        int[] delay = new int[N];
        Arrays.fill(delay, Integer.MAX_VALUE);
        ArrayList<Pair>[] adjacencyList = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (int[] time : times) {
            adjacencyList[time[0] - 1].add(new Pair(time[1] - 1, time[2]));
        }
        delay[K] = 0;
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            int vertex = findMinIndex(delay, visited);
            if (vertex == -1) return -1;
            visited[vertex] = true;
            for (Pair node : adjacencyList[vertex]) {
                delay[node.first] = Math.min(delay[node.first], delay[vertex] + node.second);
            }
        }
        return findMaxElement(delay);
    }

    private static int findMaxElement(int[] delay) {
        int max = delay[0];
        for (int i = 1; i < delay.length; i++) {
            if (max < delay[i]) max = delay[i];
        }
        return max;
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

