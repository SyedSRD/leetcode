package org.example;

public class reverseLinkdList {

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if(head.next == null)
            return head;

        ListNode tmp = head;
        int count = 1;
        while(count++ < left )
            tmp = tmp.next;

        ListNode lft = tmp;

        System.out.println("tmp");
        System.out.println(tmp.val);


        ListNode dummyHad = new ListNode(tmp.val);
        ListNode dummycur = dummyHad;
        while(count++ < right ) {
            tmp = tmp.next;
            System.out.println(tmp.val);
            ListNode dummyList = new ListNode(tmp.val);
            dummycur.next = dummyList;
            dummycur = dummycur.next;

        };

        dummyHad = reverseList(dummyHad);
        System.out.println("dummyHad");
        System.out.println(dummyHad.val);
        lft.next = dummyHad;

        dummycur = dummyHad;
        while( dummycur.next != null )
            dummycur = dummycur.next;

        dummycur.next = tmp.next;

        return head;

    }

    static ListNode reverseList(ListNode list)
    {
        ListNode prev = null, curr = list, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


}
