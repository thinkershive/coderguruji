package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.LinkedList;
import java.util.Queue;
import leetcode.topFrequency.binaryTree.TreeNode;

public class MaxLevelSum {

  // Need to get level only of maxlevel Sum.
  // use same approch to calculate sum of each level as in deepestlevelSum.
  // take 3 extra variable for tracking level and maxLevel and maxlevelSum
  public int maxLevelSum(TreeNode root){
    Queue<TreeNode> queue = new LinkedList<>();
    if (root==null) return 0;
    int levelSum=0;
    int level=0;
    int maxLevel=0;
    int maxLevelSum= Integer.MIN_VALUE;
    while (!queue.isEmpty()){
      level++;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode currentNode = queue.poll();
        levelSum +=currentNode.val;
        if (currentNode.left!=null)queue.offer(currentNode.left);
        if (currentNode.right!=null)queue.offer(currentNode.right);
      }
      if (maxLevelSum<levelSum){
        maxLevelSum = levelSum;
        maxLevel = level;
      }
    }
    return maxLevel;
  }

}
