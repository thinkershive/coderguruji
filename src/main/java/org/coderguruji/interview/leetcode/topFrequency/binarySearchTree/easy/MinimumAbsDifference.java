package org.coderguruji.interview.leetcode.topFrequency.binarySearchTree.easy;

import java.util.ArrayList;
import java.util.List;
import leetcode.topFrequency.binaryTree.TreeNode;

public class MinimumAbsDifference {
  //do DFS in ORDER and save in Array
  List<Integer> nodeValues = new ArrayList<>();

  public void dfs(TreeNode root){
    if (root==null) return ;
      dfs(root.left);
      nodeValues.add(root.val);
      dfs(root.right);
  }
  // iterate array and get min
  public int getMin(TreeNode root){
    dfs(root);
    int min=Integer.MAX_VALUE;
    for (int i = 1; i < nodeValues.size(); i++) {
      min= Math.min(min, nodeValues.get(i)-nodeValues.get(i-1));
    }
    return min;
  }

}
