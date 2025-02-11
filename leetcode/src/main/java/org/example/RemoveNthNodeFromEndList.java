package org.example;

import java.util.HashMap;

public class RemoveNthNodeFromEndList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode lft = dummy, right = head;
        while (n>0){
            right =right.next;
            n--;
        }

        while (right != null){
            lft = lft.next;
            right = right.next;
        }

        lft.next = lft.next.next;
        return dummy.next;
    }

}
