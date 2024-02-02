package org.coderguruji.interview.leetcode.topFrequency.binaryTree;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;
  public TreeNode parent;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
  public TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent) {
    this.val = val;
    this.left = left;
    this.right = right;
    this.parent=parent;
  }

}
