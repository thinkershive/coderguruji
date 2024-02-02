package org.coderguruji.interview.leetcode.topFrequency.binarySearchTree.medium;

import leetcode.topFrequency.binaryTree.TreeNode;

public class LCABST {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(p.val< root.val && q.val < root.val)
      return lowestCommonAncestor(root.left, p , q);

    if(p.val >  root.val && q.val  > root.val)
      return lowestCommonAncestor(root.right , p , q);

    return root;
  }

}
