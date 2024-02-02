package org.coderguruji.interview.leetcode.seventyfive.list.binaryTree.medium;

import leetcode.topFrequency.binaryTree.TreeNode;

public class SumRootToLeaf {

  int sumRootToLeaf=0;
  public int sumNumbers(TreeNode root) {
      preOder(root,0);
      return sumRootToLeaf;
  }

  private void preOder(TreeNode root, int currentNumber) {
    if (root!=null){
      currentNumber = currentNumber*10+root.val;
      if (root.left==null && root.right==null){
        sumRootToLeaf=+currentNumber;
      }
      preOder(root.left,currentNumber);
      preOder(root.right,currentNumber);
    }
  }


}
