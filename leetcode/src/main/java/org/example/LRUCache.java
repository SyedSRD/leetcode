package org.example;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public class Node{
        int key;
        int value;
        Node prev;
        Node next;
    }

    Node head = new Node();
    Node tail = new Node();
    Map<Integer,Node> map;
    int cache_capacity;
    public LRUCache(int capacity) {
        this.cache_capacity = capacity;
        map = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        Node node = map.get(key);
        if(node!=null){
            result = node.value;
            remove(node);
            add(node);
        }
        return result;

    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node!= null){
            remove(node);
            node.value = value;
            add(node);
        }else {
            if(cache_capacity == map.size()){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.value = value;
            map.put(key,new_node);
            add(new_node);


        }

    }

    public void add(Node node){
        Node head_next = head.next;
        node.next = head_next;
        node.prev = head;
        head.next = node;
        head_next.prev = node;
    }
    public void remove(Node node){
        Node next_node = node.next;
        Node prev_node = node.prev;

        next_node.prev = prev_node;
        prev_node.next = next_node;
    }


}
