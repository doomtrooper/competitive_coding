package InterviewBit;

import java.util.Arrays;

/**
 * Created by kuliza-265 on 15/5/17.
 */
public class BinaryHeap {
    private int[] heap;
    private int heapCount, N;

    public BinaryHeap(int n) {
        N = n;
        heap = new int[N+1];
        heapCount = 0;
    }

    private int parent(int i){
        return i/2;
    }

    private int left(int i){
        return  i*2;
    }

    private int right(int i){
        return i*2+1;
    }

    private void heapify(int index){
        int r = right(index), l = left(index), max = index;
        if (r<=heapCount && heap[index]<heap[r]) max = r;
        if (l<=heapCount && heap[index]<heap[l]) max = l;
        if (max!=index) {
            swap(max, index);
            heapify(max);
        }
    }

    private void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void insert(int val){
        if (heapCount>=N) throw new IndexOutOfBoundsException("heap full...");
        heap[++heapCount] = val;
        int i = heapCount;
       while (i>1 && heap[i]>heap[parent(i)]) {
           swap(i, parent(i));
           i = parent(i);
       }
    }

    private int extractMax(){
        if (heapCount==0) return Integer.MIN_VALUE;
        if (heapCount==1) {
            return heap[heapCount--];
        }
        int root = heap[1];
        heap[1] = heap[heapCount];
        heap[heapCount] = 0;
        heapCount--;
        heapify(1);
        return root;
    }

    public static void main(String[] args) throws Exception {
        BinaryHeap heap = new BinaryHeap(4);
        heap.insert(3);
        heap.insert(5);
        System.out.println(Arrays.toString(heap.heap));
        heap.insert(2);
        System.out.println(Arrays.toString(heap.heap));
        heap.insert(8);
        System.out.println(Arrays.toString(heap.heap));
        heap.extractMax();
        System.out.println(Arrays.toString(heap.heap));
        heap.extractMax();
        System.out.println(Arrays.toString(heap.heap));
        heap.insert(8);
        System.out.println(Arrays.toString(heap.heap));
        heap.extractMax();
        heap.extractMax();
        System.out.println(Arrays.toString(heap.heap));

    }
}
