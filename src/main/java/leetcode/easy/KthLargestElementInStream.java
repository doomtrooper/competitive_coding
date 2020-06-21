package leetcode.easy;

import java.io.*;
import java.util.*;

//https://leetcode.com/problems/kth-largest-element-in-a-stream/
public class KthLargestElementInStream {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {5, -1};
        KthLargest kthLargest = new KthLargest(k, arr);
        System.out.println(kthLargest.add(2));
        System.out.println(kthLargest.add(1));
        System.out.println(kthLargest.add(-1));
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(4));
    }

    static class KthLargest {
        Heap heap;

        public KthLargest(int k, int[] nums) {
            int[] sorted = Heap.sort(nums);
            heap = new Heap(k);
            int n = Math.min(k, nums.length);
            for (int i = 0; i < n; i++) {
                heap.insert(sorted[i]);
            }
        }

        public int add(int val) {
            if (heap.insert(val)) {
                return heap.peek();
            }
            int kThSmallest = heap.peek();
            if (kThSmallest < val) {
                heap.delete();
                heap.insert(val);
                kThSmallest = heap.peek();
            }
            return kThSmallest;
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

