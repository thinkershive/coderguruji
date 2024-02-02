package org.coderguruji.interview.leetcode.topFrequency.binarySearchTree.medium;

import leetcode.seventyfive.list.ListNode;
import leetcode.topFrequency.binaryTree.TreeNode;

public class ListToBST {
  public TreeNode sortedListToBST(ListNode head) {
    if(head==null) return null;
    return toBST(head,null);
  }

  public TreeNode toBST(ListNode head, ListNode tail){
    ListNode slow = head;
    ListNode fast = head;
    if(head==tail) return null;

    while(fast!=tail && fast.next != tail){
      fast = fast.next.next;
      slow = slow.next;
    }

    TreeNode thead = new TreeNode(slow.val);
    thead.left = toBST(head,slow);
    thead.right = toBST(slow.next,tail);
    return thead;


  }

}
