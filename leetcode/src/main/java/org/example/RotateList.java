package org.example;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode  split=head, tail=head;
        int siz=1;
        while (tail.next != null){
            tail = tail.next;
            siz++;
        }
        k=k%siz;
        for(int i=0;i<siz-k-1;i++)
            split =split.next;

        tail.next= head;
        head = split.next;
        split.next =null;

        return head;
    }
}
