package leetcode.medium;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/distant-barcodes/
public class DistantBarcodes {
    public static void main(String[] args) {
        int[] barcodes = {1, 1, 2};
        printArray(rearrangeBarcodes(barcodes));
    }

    public static int[] rearrangeBarcodes(int[] barcodes) {
        if (barcodes.length < 3) return barcodes;
        int[] result = new int[barcodes.length];
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(barcodes).forEach(barcode -> map.put(barcode, map.getOrDefault(barcode, 0) + 1));
        PriorityQueue<Pair> queue = new PriorityQueue<>(map.size(), (pair, pair1) -> pair1.second - pair.second);
        map.forEach((key, value) -> queue.add(new Pair(key, value)));
        int k = 0;
        while (!queue.isEmpty()) {
            Pair poll = queue.poll();
            while (poll.second-- > 0) {
                result[k] = poll.first;
                k += 2;
                if (k >= result.length) k = 1;
            }
        }
        return result;
    }

    public static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}

