package org.coderguruji.interview.leetcode.oneFifty.binaryTree.easy;

import leetcode.topFrequency.binaryTree.TreeNode;

public class SameTree {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p==null && q == null) return true;  // If both p and q are null, then they are the same tree
    if (p==null || q == null) return false; // If only one of p and q is null, then they are not the same tree
    if(p.val!=q.val) return false;  // If the values of p and q are different, then they are not the same tree
    return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

  }

}
