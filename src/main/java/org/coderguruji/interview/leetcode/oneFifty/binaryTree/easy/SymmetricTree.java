package org.coderguruji.interview.leetcode.oneFifty.binaryTree.easy;

import leetcode.topFrequency.binaryTree.TreeNode;

public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {
    return dfs(root,root);
  }

  private boolean dfs(TreeNode root1, TreeNode root2) {
    if (root1==null && root2==null) return true;
    if (root1==null || root2==null) return false;
    if (root1.val!=root2.val) return false;
    return dfs(root1.left,root2.right) && dfs(root1.right, root2.left);
  }

}
