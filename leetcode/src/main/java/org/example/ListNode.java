package org.example;

public class ListNode {
    int val;
      ListNode next;
      ListNode random;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
