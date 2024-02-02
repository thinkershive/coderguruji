package org.coderguruji.interview.leetcode.seventyfive.list;



public class ReverseLinkedList {
    ListNode newHead=null;
    public ListNode reverseList(ListNode head){
        if(head==null || head.next == null) return head;
        reverse(head);
        return head;
    }

    public ListNode  reverse(ListNode head) {
        if (head.next == null) {
            newHead = head;
            return head;
        }
        ListNode temp = reverse(head.next);
        temp.next = head;
        head.next = null;
        return head;
    }

}
