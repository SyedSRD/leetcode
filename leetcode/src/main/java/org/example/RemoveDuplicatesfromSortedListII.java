package org.example;

public class RemoveDuplicatesfromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {

        if(head.next==null || head==null)
            return head;
        ListNode lft = head, right = head.next;
        ListNode dummy = new ListNode(0);
        ListNode HadNod = dummy;



        int dup = 999 ;
        while (right!=null){
            if (lft.val == right.val) {
                right = right.next;
                dup = lft.val;
                continue;
            }
            else {
                if(dup != lft.val) {

                    ListNode node = new ListNode(lft.val);
                    dummy.next = node;
                    dummy = dummy.next;
                }
                lft = right;
                right = lft.next;
            }
        }
        if(dup != lft.val) {

            ListNode node = new ListNode(lft.val);
            dummy.next = node;
            dummy = dummy.next;
        }

        return dummy.next;

    }
}
