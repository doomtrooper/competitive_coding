package leetcode.medium;

import java.io.*;
import java.util.*;

public class KthLargestElementArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 1;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Heap heap = new Heap(k);
        for (int i = 0; i < nums.length; i++) {
            add(nums[i], heap);
        }
        return heap.peek();
    }

    private static void add(int num, Heap heap) {
        if (heap.insert(num)) {
            return;
        }
        if (heap.peek() < num) {
            heap.delete();
            heap.insert(num);
        }
    }

    static class Heap {
        //Min heap impl
        int height;
        int capacity;
        int[] arr;

        public Heap(int height) {
            this.height = height;
            arr = new int[this.height + 1];
            capacity = 0;
        }

        public int peek() {
            if (capacity == 0) throw new IllegalStateException("Empty heap");
            return arr[1];
        }

        public boolean insert(int val) {
            if (capacity == height) {
                return false;
            }
            arr[++capacity] = val;
            heaify(capacity);
            return true;
        }

        private void heaify(int curIndex) {
            while (curIndex > 1) {
                int parent = curIndex >> 1; //parant index in half of the cur index in heap
                if (arr[parent] > arr[curIndex]) {
                    swap(parent, curIndex);
                }
                curIndex = parent;
            }
        }

        private void swap(int parent, int capacity) {
            int temp = arr[parent];
            arr[parent] = arr[capacity];
            arr[capacity] = temp;
        }

        public int delete() {
            int top = arr[1];
            arr[1] = arr[capacity--];
            heaify();
            return top;
        }

        private void heaify() {
            int curIndex = 1;
            while (true) {
                int indexToExchange = curIndex;
                int left = curIndex * 2;
                if (capacity >= left) {
                    indexToExchange = arr[indexToExchange] <= arr[left] ? indexToExchange : left;
                } else {
                    break;
                }
                int right = curIndex * 2 + 1;
                if (capacity >= right) {
                    indexToExchange = arr[indexToExchange] <= arr[right] ? indexToExchange : right;
                }
                if (curIndex != indexToExchange) swap(indexToExchange, curIndex);
                else break;
                curIndex = indexToExchange;
            }
        }

        public static int[] sort(int[] arr) {
            Heap heap = new Heap(arr.length);
            for (int i = 0; i < arr.length; i++) {
                heap.insert(arr[i]);
            }
            for (int i = 0; i < arr.length; i++) {
                heap.arr[heap.capacity] = heap.delete();
            }
            return Arrays.copyOfRange(heap.arr, 1, heap.arr.length); //returns array sorted in decreasing order.
        }
    }
}

