package org.example;

import java.util.HashMap;

public class CopyListwithRandomPointer {
    public ListNode copyRandomList(ListNode head) {

        HashMap<ListNode,ListNode> map = new  HashMap<>();

        ListNode cur = head;

        while(cur!=null){
            ListNode node = new ListNode(cur.val);
            map.put(cur,node);
            cur =cur.next;
        }

        cur = head;
        while(cur!=null){
            ListNode copy = map.get(cur);
            copy.next = map.getOrDefault(cur.next,null);
            copy.random = map.getOrDefault(cur.random,null);
            cur =cur.next;
        }

        return map.get(head);


    }
}
