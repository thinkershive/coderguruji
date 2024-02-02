package org.coderguruji.interview.leetcode.seventyfive.list.binaryTree.medium;

import leetcode.topFrequency.binaryTree.TreeNode;

public class LowestCommonAncestor {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    return dfs(root,p,q);
  }

  private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
    //Base Case
    if (root==null) return null;
    if(root.val==p.val || root.val==q.val) return root;
    //recursive call
    TreeNode leftSearchNode = dfs(root.left,p,q);
    TreeNode rightSearchNode = dfs(root.right,p,q);
    //if leftNode is null rightNode is LCA
    // if rightNode is null leftNode is LCA
    if(leftSearchNode ==null) return rightSearchNode;
    if (rightSearchNode==null) return leftSearchNode;
    // leftNode and rightNode !=null root is the LCA
    return root;
  }

}
