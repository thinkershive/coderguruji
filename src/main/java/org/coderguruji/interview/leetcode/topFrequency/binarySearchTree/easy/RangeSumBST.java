package org.coderguruji.interview.leetcode.topFrequency.binarySearchTree.easy;

import leetcode.topFrequency.binaryTree.TreeNode;

public class RangeSumBST {
  int ans = 0;
  public int rangeSumBST(TreeNode root, int low, int high) {
    dfs(root,low,high);
    return ans;
  }

  public void dfs(TreeNode root, int low, int high){
    if(root!=null){
      if (root.val>=low && root.val<=high) ans+=root.val;
      dfs(root.left,low,high);
      dfs(root.right,low,high);
    }
  }

}
