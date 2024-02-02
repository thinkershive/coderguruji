package org.coderguruji.interview.leetcode.seventyfive.list;

public class OddEvenLinkedList {
    //head = [2,1,3,5,6,4,7]
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd=head,even=head.next,evenStart = even;
        while(odd.next != null && odd.next.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenStart;
        return head;
    }
}
