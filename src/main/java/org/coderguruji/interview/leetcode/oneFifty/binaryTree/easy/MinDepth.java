package org.coderguruji.interview.leetcode.oneFifty.binaryTree.easy;

import leetcode.topFrequency.binaryTree.TreeNode;

public class MinDepth {


  public int minDepth(TreeNode root) {
  if (root==null) return 0;
  if (root.left==null) return 1+minDepth(root.right);
  if (root.right==null) return 1+minDepth(root.left);
  return 1+ Math.min(minDepth(root.left),minDepth(root.right));
  }

}
