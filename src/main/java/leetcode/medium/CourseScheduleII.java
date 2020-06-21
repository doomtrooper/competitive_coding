package leetcode.medium;

import java.util.ArrayList;
import java.util.Stack;

//https://leetcode.com/problems/course-schedule-ii/
public class CourseScheduleII {
    public static void main(String[] args) {

    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses==0) return new int[0];
        ArrayList<Integer>[] adjacencyList = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }
        for (int[] edge : prerequisites) {
            adjacencyList[edge[1]].add(edge[0]);
        }
        if (!isGraphCyclic(numCourses, adjacencyList)) {
            return topologicalSort(numCourses, adjacencyList);
        }
        return new int[0];
    }

    public int[] topologicalSort(int v, ArrayList<Integer>[] adjacencyList) {
        boolean[] visited = new boolean[v]; //auto init with 0
        int[] result = new int[v];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(i, adjacencyList, visited, stack);
            }
        }
        for (int i = 0; i < v; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

    private void dfs(int vertex, ArrayList<Integer>[] adjacencyList, boolean[] visited, Stack<Integer> stack) {
        visited[vertex] = true;
        for (Integer child : adjacencyList[vertex]) {
            if (!visited[child]) dfs(child, adjacencyList, visited, stack);
        }
        stack.push(vertex);
    }

    public boolean isGraphCyclic(int v, ArrayList<Integer>[] adjacencyList) {
        int[] colourMatrix = new int[v]; //auto init with 0
        for (int i = 0; i < v; i++) {
            if (colourMatrix[i] != 2)
                if (dfs(i, adjacencyList, colourMatrix)) return true;
        }
        return false;
    }

    private boolean dfs(int vertex, ArrayList<Integer>[] adjacencyList, int[] colourMatrix) {
        colourMatrix[vertex] = 1; //grey colouring
        for (Integer childVertex : adjacencyList[vertex]) {
            if (colourMatrix[childVertex] == 1) return true;
            else if (colourMatrix[childVertex] == 0) {
                if (dfs(childVertex, adjacencyList, colourMatrix)) return true;
            }
        }
        colourMatrix[vertex] = 2; //colouring black
        return false;
    }
}

