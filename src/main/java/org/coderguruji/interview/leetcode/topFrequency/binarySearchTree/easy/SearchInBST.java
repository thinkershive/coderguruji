package org.coderguruji.interview.leetcode.topFrequency.binarySearchTree.easy;

import leetcode.topFrequency.binaryTree.TreeNode;

public class SearchInBST {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root==null || root.val==val) return root;
    return val<root.val ? searchBST(root.left,val) : searchBST(root.right,val);

  }

}
