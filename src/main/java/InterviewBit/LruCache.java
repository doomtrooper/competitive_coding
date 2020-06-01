package InterviewBit;

import java.util.HashMap;

public class LruCache {
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;


    public LruCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, Node>();
    }

    public int get(int key){
        if (map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.val;
        }
        return -1;
    }

    public void set(int key, int val){
        if (map.containsKey(key)){
            Node node = map.get(key);
            node.val = val;
            remove(node);
            setHead(node);
        }else {
            Node node = new Node(key,val);
            if (map.size()==capacity){
                map.remove(tail.key);
                remove(tail);
            }
            map.put(key, node);
            setHead(node);
        }
    }

    private void setHead(Node node){
        node.prev = null;
        node.next = head;
        if (head!=null) head.prev =node;
        head = node;
        if (tail==null) tail = head;
    }

    private void remove(Node node){
        if (node.prev!=null){
            node.prev.next = node.next;
        }else {
            head = node.next;
        }

        if (node.next!=null){
            node.next.prev = node.prev;
        }else {
            tail = node.prev;
        }
    }

    static class Node{
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            next = null;
            next = null;
        }

    }

    public static void main(String[] args) throws Exception {
        LruCache cache = new LruCache(2);
        System.out.println(cache.get(1));
        cache.set(1, 8);
        System.out.println(cache.get(1));
        cache.set(2, 4);
        System.out.println(cache.get(2));
        cache.set(3, 5);
        System.out.println(cache.get(2));
        cache.set(4, 6);
        System.out.println(cache.get(2));
        System.out.println(cache.get(4));
    }
}


