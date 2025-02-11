package org.example;

import java.util.Arrays;

public class AddTwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        int sum = 0, mul=1;
//        while (l1 != null && l2 !=null ){
//            sum += (l1.val + l2.val) * mul;
//            mul*=10;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        while(l1  != null) {
//            sum += (l1.val) * mul;
//            mul *= 10;
//            l1 = l1.next;
//        }
//
//        while(l2  != null) {
//            sum += (l2.val) * mul;
//            mul *= 10;
//            l2 = l2.next;
//        }
//
//        System.out.println(sum);
//        String str = String.valueOf(sum);
//
//
//        ListNode prv = null;
//        for (char ch:str.toCharArray()){
//            ListNode listNode = new ListNode(Character.getNumericValue(ch),prv);
//            prv = listNode;
//        }
//
//        return prv;
//
//    }

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    // code here
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        int carry = 0;
        ListNode head = null, prev = null;
        ListNode sum = null;

        while (l1 != null || l2 != null || carry == 1) // if any one of these is left
        // we are stil left with addition
        {
            int newVal = carry;

            if (l1 != null)
                newVal += l1.val;
            if (l2 != null)
                newVal += l2.val;

            carry = newVal / 10; // to be used in the next
            // node calculation
            newVal = newVal % 10;

            ListNode newNode = new ListNode(newVal);
            if (sum == null)
                head = newNode;
            newNode.next = sum; // appending in the beginning of the
            // final ans list, this way we do not
            // have to reverse in the end
            sum = newNode;

            if (l1 != null) // initialising nodes for
                // next iteration
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return reverseList(sum);
    }
}
