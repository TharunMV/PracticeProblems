package com.practice.assessment;


public class ListNode {

      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode swapPairs(ListNode head) {

        ListNode helper = new ListNode(0);
        helper.next = head;

        ListNode previous = helper;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            if(next!=null){
                current.next = next.next;
                previous.next = next;
                next.next = current;
                previous = previous.next.next;
                current = current.next;
            }else{
                current = current.next;
            }
        }

        return helper.next;
    }
}

