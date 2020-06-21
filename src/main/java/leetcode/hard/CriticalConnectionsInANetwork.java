package leetcode.hard;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/critical-connections-in-a-network/
public class CriticalConnectionsInANetwork {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> connections = new ArrayList<>();
        List<Integer> connection0 = new ArrayList<>();
        connection0.add(0);
        connection0.add(1);
        connections.add(connection0);
        List<Integer> connection1 = new ArrayList<>();
        connection1.add(2);
        connection1.add(1);
        connections.add(connection1);
        List<Integer> connection2 = new ArrayList<>();
        connection2.add(2);
        connection2.add(0);
        connections.add(connection2);
        List<Integer> connection3 = new ArrayList<>();
        connection3.add(3);
        connection3.add(1);
        connections.add(connection3);
        criticalConnections(n, connections);
    }

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<Integer>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (List<Integer> connection : connections){
            adjacencyList[connection.get(0)].add(connection.get(1));
            adjacencyList[connection.get(1)].add(connection.get(0));
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adjacencyList[i].size()==1) {
                List<Integer> temp  = new ArrayList<>(2);
                temp.add(i);
                temp.add(adjacencyList[i].get(0));
                result.add(temp);
            }
        }
        return result;
    }
}

