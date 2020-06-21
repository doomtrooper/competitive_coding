package leetcode.easy;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        Heap heap = new Heap(stones.length);
        for (int i = 0; i < stones.length; i++) {
            heap.insert(stones[i]);
        }
        while (heap.capacity > 1) {
            int largest = heap.delete();
            int largest2 = heap.delete();
            if (largest != largest2) {
                heap.insert(largest - largest2);
            }
        }
        return heap.capacity == 1 ? heap.peek() : 0;
    }

    static class Heap {
        int[] arr;
        int capacity;
        int height;

        public Heap(int height) {
            this.height = height;
            arr = new int[height + 1];
            capacity = 0;
        }

        public boolean insert(int val) {
            if (capacity == height) return false;
            arr[++capacity] = val;
            heapify(capacity);
            return true;
        }

        private void heapify(int index) {
            while (index > 1) {
                int parent = index >> 1;
                if (arr[index] > arr[parent]) {
                    swap(parent, index);
                    index = parent;
                } else {
                    break;
                }
            }
        }

        private void swap(int parent, int capacity) {
            int temp = arr[parent];
            arr[parent] = arr[capacity];
            arr[capacity] = temp;
        }

        public int delete() {
            if (capacity == 0) {
                throw new IllegalStateException("Capacity is 0");
            }
            int temp = arr[1];
            arr[1] = arr[capacity--];
            heapify();
            return temp;
        }

        private void heapify() {
            int curIndex = 1;
            while (true) {
                int indexToExchange = curIndex;
                int left = curIndex * 2;
                int right = curIndex * 2 + 1;
                if (capacity >= left) {
                    indexToExchange = arr[indexToExchange] < arr[left] ? left : indexToExchange;
                } else {
                    break;
                }
                if (capacity >= right) {
                    indexToExchange = arr[indexToExchange] < arr[right] ? right : indexToExchange;
                }
                if (curIndex != indexToExchange) swap(indexToExchange, curIndex);
                else break;
                curIndex = indexToExchange;
            }
        }

        public int peek() {
            if (capacity < 1) throw new IllegalStateException("Empty heap");
            return arr[1];
        }
    }
}

