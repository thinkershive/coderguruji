package org.coderguruji.interview.leetcode.seventyfive.list.binaryTree.medium;

import leetcode.topFrequency.binaryTree.TreeNode;

public class NoOFGoodNodes {
  public int goodNodes(TreeNode root) {
     return dfs(root, root.val);
  }

  private int dfs(TreeNode root, int maxSofar) {
    int numberOfGoodNodes = 0;
    if(root!=null){
      if(root.val>=maxSofar){
        maxSofar = root.val;
        numberOfGoodNodes++;
      }
    }
    numberOfGoodNodes+=dfs(root.left,maxSofar);
    numberOfGoodNodes+=dfs(root.right,maxSofar);
    return numberOfGoodNodes;
  }

}
