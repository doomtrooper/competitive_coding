package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryMinHeap {
    static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private ListNode[] heap;
    private int N;
    private int counter;

    public BinaryMinHeap(int size) {
        N = size;
        heap = new ListNode[N+1];
        counter = 0;
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
        if (r<= counter && heap[max].val>heap[r].val) max = r;
        if (l<= counter && heap[max].val>heap[l].val) max = l;
        if (max!=index) {
            swap(max, index);
            heapify(max);
        }
    }

    private void swap(int a, int b){
        ListNode temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void insert(ListNode node){
        if (counter ==N) throw new IllegalStateException("dbj");
        heap[++counter] = node;
        int i = counter;
        while (i>1 && heap[i].val<heap[parent(i)].val) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private ListNode extractMin(){
        if (counter ==0) return null;
        ListNode root = heap[1];
        heap[1] = root.next!=null?root.next:new ListNode(Integer.MAX_VALUE);
        heapify(1);
        return root;
    }

    public static void main(String[] args) throws Exception {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(7);
        listNode.next.next = new ListNode(9);

        ListNode listNode2 = new ListNode(3);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(11);

        ArrayList<ListNode> listNodes = new ArrayList<ListNode>();
        listNodes.add(listNode);
        listNodes.add(listNode2);
        sortLists(listNodes);
    }

    public static ListNode sortLists(ArrayList<ListNode> listNodes){
        ListNode result = new ListNode(), temp = listNodes.get(0);
        int count = 0;
        while (temp!=null) {
            temp = temp.next;
            count++;
        }
        BinaryMinHeap heap = new BinaryMinHeap(listNodes.size());
        for (int i = 0; i < listNodes.size(); i++) {
            heap.insert(listNodes.get(i));
        }
        temp = result;
        for (int i = 0; i < listNodes.size()*count; i++) {
            temp.next = heap.extractMin();
            temp = temp.next;
        }
        ListNode tem = result.next;
        while (tem!=null) {
            System.out.println(tem.val +" ");
            tem = tem.next;
        }
        return result.next;
    }
}
