package org.coderguruji.interview.leetcode.topFrequency.binaryTree.easy;

import leetcode.topFrequency.binaryTree.TreeNode;

public class DiameterBT {

  int diameter=0;
  public int diameterOfBinaryTree(TreeNode root) {
    if (root==null) return 0;
    dfs(root);
    return diameter;
  }

  private int dfs(TreeNode root) {
    if (root==null) return 0;
    int left = dfs(root.left);
    int right = dfs(root.right);
    diameter = Math.max(diameter,left+right);
    return 1+Math.max(left,right);
  }

}
