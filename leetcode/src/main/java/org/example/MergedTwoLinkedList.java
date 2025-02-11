package org.example;

public class MergedTwoLinkedList {
//     Definition for singly-linked list.
      public class ListNode1 {
          int val;
          ListNode1 next;
          ListNode1() {}
          ListNode1(int val) { this.val = val; }
          ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }

      }



        public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {

            ListNode1 cur1 = list1;
            ListNode1 cur2 = list2;
            ListNode1 list3 = new ListNode1();
            ListNode1 cur3 = list3;
            while (cur1 != null && cur2 != null){
                if(cur1.val <= cur2.val) {
                    cur3.next = new ListNode1(cur1.val);
                    cur1 = cur1.next;
                }
                else{
                    cur3.next = new ListNode1(cur2.val);
                    cur2 = cur2.next;
                }
                cur3 =cur3.next;
            }
            while(cur2 != null){
                cur3.next = new ListNode1(cur2.val);
                cur2 = cur2.next;
                cur3 =cur3.next;
            }
            while(cur1 != null){
                cur3.next = new ListNode1(cur1.val);
                cur1 = cur1.next;
                cur3 =cur3.next;
            }

            list3 = list3.next;

            return list3;
        }


}
