package org.coderguruji.interview.leetcode.topFrequency.binarySearchTree.easy;

import leetcode.topFrequency.binaryTree.TreeNode;

public class SortedArrayToBST {

  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums==null || nums.length==0) return null;
    return dfs(nums,0,nums.length-1);
  }

  private TreeNode dfs(int[] nums, int left, int right) {
    if (left>right) return null;
    int mid = left+ (right-left)/2;
    TreeNode node = new TreeNode(mid);
    node.left = dfs(nums,left,mid-1);
    node.right = dfs(nums,mid+1,right);
    return node;
  }

}
