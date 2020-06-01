package gfg;

import java.util.*;

public class MessageTransferAnand {

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
        nodeClass.addChild(a, c);
        nodeClass.addChild(a, d);
        nodeClass.addChild(c, e);
        nodeClass.addChild(e, f);
        nodeClass.addChild(f, g);
        nodeClass.addChild(d, h);
        nodeClass.addChild(d, i);
        nodeClass.addChild(d, j);
        nodeClass.addChild(d, k);
        System.out.println(findMinItr(a)-1);
    }

    private static int findMinItr(Node a) {
        if (a==null) return 0;
        int curMax = 0;
        for (int i = 0; i < a.size; i++) {
            curMax = Math.max(curMax, findMinItr(a.child[i]));
        }
        return Math.max(a.size, curMax)+1;
    }
}