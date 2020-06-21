package leetcode.medium;

import java.io.*;
import java.util.*;


//https://leetcode.com/problems/array-of-doubled-pairs/
public class ArrayOfDoubledPairs {
    public static void main(String[] args) {
        int[] array = {3,1,3,6};
        System.out.println(canReorderDoubled(array));
    }

    public static boolean canReorderDoubled(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                count++;
                A[i] = Math.abs(A[i]);
            }
        }
        if (count % 2 != 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(A).forEach(item -> map.put(item, map.getOrDefault(item, 0) + 1));
        if (map.getOrDefault(0, 0) % 2 != 0) return false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 0 || entry.getValue() == 0) continue;
            if (map.getOrDefault(2 * entry.getKey(), 0) < entry.getValue()) return false;
            else {
                map.put(entry.getKey() * 2, map.get(2 * entry.getKey()) - entry.getValue());
                entry.setValue(0);
            }

        }
        return true;
    }


}

