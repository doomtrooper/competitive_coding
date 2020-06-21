package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/course-schedule/
public class CourseSchedule {
    public static void main(String[] args) {
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length < 2) return true;
        ArrayList<Integer>[] adjacencyList = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjacencyList[i] = new ArrayList<Integer>();
        }
        for (int[] edge : prerequisites) {
            adjacencyList[edge[1]].add(edge[0]);
        }
        return !isGraphCyclic(numCourses, adjacencyList);
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

