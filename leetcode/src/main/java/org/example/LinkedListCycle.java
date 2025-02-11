package org.example;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
    private ListNode root = new ListNode(99);
    private ListNode tail = root;
    public boolean hasCycle() {
//        Map numMap = new HashMap<ListNode,Integer>();
//        int i=-1;
//        ListNode cur = root;
//        while (cur != null){
//            if((int) numMap.getOrDefault(cur,-1) != -1)
//                return true;
//            numMap.put(cur,++i);
//            cur = cur.next;
//
//        }
//        return false;
        ListNode slow_p = root, fast_p = root;

        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p)
                return true;

        }

        return false;
    }

    public void addNode(int val){
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = tail.next;
    }

    public void addCycle(){
        tail.next = root;
    }
}
