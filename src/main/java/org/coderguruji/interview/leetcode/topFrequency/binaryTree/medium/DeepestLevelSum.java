package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.LinkedList;
import java.util.Queue;
import leetcode.topFrequency.binaryTree.TreeNode;

public class DeepestLevelSum {
  public int deepestLeavesSum(TreeNode root){
    int level_sum=0;
    Queue<TreeNode> queue = new LinkedList<>();
    if(root==null) return level_sum;
    queue.add(root);
    while (!queue.isEmpty()){
      level_sum=0;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode currentNode = queue.poll();
        level_sum+=currentNode.val;
        if (currentNode.left!=null) queue.offer(currentNode.left);
        if (currentNode.right!=null) queue.offer(currentNode.right);
      }
    }
    return level_sum;
  }

}
