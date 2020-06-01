package gfg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MessageTransfer {

    static class Node {
        Node[] child;
        int val;
        int size;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
            this.child = new Node[10];
            this.size = 0;
        }

        public static void addChild(Node root, Node ch) {
            root.child[root.size] = ch;
            root.size++;
        }
    }

    public static void main(String[] args) {
        Node nodeClass= new Node();
        Node a= new Node(1);
        Node b= new Node(2);
        Node c = new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
        Node g= new Node(7);
        Node h= new Node(8);
        Node i= new Node(9);
        Node j= new Node(10);
        Node k= new Node(11);
        Node l= new Node(12);
        Node m= new Node(13);
        Node n= new Node(14);
        Node o= new Node(15);
        Node p= new Node(16);
        Node q= new Node(17);
        nodeClass.addChild(a,b);
        nodeClass.addChild(a,c);
        nodeClass.addChild(a,d);
        nodeClass.addChild(a,e);
        nodeClass.addChild(a,f);
        nodeClass.addChild(b,g);
        System.out.println(findMinItr(a));
    }

    private static int findMinItr(Node a) {
        if(height(a)==0){
            return 0;
        }
        else if(height(a)==1){
            return a.size;
        }
        else {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < a.size; i++) {
                arr.add(findMinItr(a.child[i]));
            }
            Collections.sort(arr);
            int min = a.size;
            for (int i = arr.size()-1; i >=0; i--) {
                min = Math.max(min, arr.get(i) + arr.size()-i);
            }
            return min;
        }
    }

    public static int height(Node a){
        if(a.size==0){
            return 0;
        }
        int h=0;
        for(int i=0; i< a.size ; i++){
            h= Math.max(h, 1+height(a.child[i]));
        }
        return h;
    }
}