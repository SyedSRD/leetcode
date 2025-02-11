package org.example;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {

//         ListNode dummy = new ListNode(0,head);
//        ListNode cur=dummy,lft=dummy,right=dummy;
//
//        int siz =0;
//        while (cur.next!=null){
//            cur = cur.next;
//            if(cur.val < x && siz!=0){
//                right.next = right.next.next;
//                cur.next = lft.next;
//                lft.next = cur;
//                cur = right;
//                lft = lft.next;
//            }else if(cur.val < x && siz==0){
//                lft = lft.next;
//                right=right.next;
//            }else {
//                right=right.next;
//            }
//            siz++;
//
//        }
//
//        return dummy.next;



        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode ltail =left;
        ListNode rtail = right;
        ListNode cur = head;
        while (cur != null){
            if(cur.val <x){
                ltail.next =cur;
                ltail = ltail.next;
            }else {
                rtail.next = cur;
                rtail = rtail.next;
            }
            cur =cur.next;
        }

        ltail.next = right.next;
        rtail.next = null;

    return left.next;


    }
}
