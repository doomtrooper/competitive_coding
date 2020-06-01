package gfg;


import java.util.Arrays;

public class BinaryMinHeap {
    private int N;
    private int[] heap;
    private int counter;

    public BinaryMinHeap(int n) {
        N = n;
        heap = new int[N+1];
        counter = 0;
    }

    private int parent(int index){
        return index/2;
    }

    private int left(int index){
        return index*2;
    }

    private int right(int index){
        return index*2+1;
    }

    private void swap(int a, int b){
        if (a==b) return;
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void insert(int val){
        if (counter==N) throw new IndexOutOfBoundsException("Heap is full");
        heap[++counter] = val;
        int parent = parent(counter), index = counter;
        while (index>1 && heap[parent]>heap[index]){
            swap(index, parent);
            index = parent;
        }
    }

    public int extractMin(){
        int result = heap[1];
        heap[1] = heap[counter];
        heap[counter--] = 0;
        heapify(1);
        return result;
    }

    private void heapify(int index) {
        int l = left(index), r = right(index);
        int minIndex = index;
        if (l <= counter && heap[minIndex] > heap[l]) minIndex = l;
        if (r <= counter && heap[minIndex] > heap[r]) minIndex = r;
        if (minIndex!=index) {
            swap(minIndex, index);
            heapify(minIndex);
        }
    }

    public static void main(String[] args) throws Exception {
        BinaryMinHeap heap = new BinaryMinHeap(4);
        heap.insert(3);
        heap.insert(5);
        System.out.println(Arrays.toString(heap.heap));
        heap.insert(2);
        System.out.println(Arrays.toString(heap.heap));
        heap.insert(8);
        System.out.println(Arrays.toString(heap.heap));
        heap.extractMin();
        System.out.println(Arrays.toString(heap.heap));
        heap.extractMin();
        System.out.println(Arrays.toString(heap.heap));
        heap.insert(8);
        System.out.println(Arrays.toString(heap.heap));
        heap.extractMin();
        heap.extractMin();
        System.out.println(Arrays.toString(heap.heap));

    }
}
