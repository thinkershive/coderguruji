package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.topFrequency.binaryTree.TreeNode;

public class LargestValueInEachRow {

  public List<Integer> largestValues(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> result = new ArrayList<>();
    if (root==null) return result;
    queue.add(root);
    while (!queue.isEmpty()){
      int size = queue.size();
      int max= Integer.MIN_VALUE;
      for (int i = 0; i < size; i++) {
        TreeNode currentNode = queue.poll();
        max = Math.max(currentNode.val,max);
        if (currentNode.left!=null) queue.offer(currentNode.left);
        if (currentNode.right!=null) queue.offer(currentNode.right);
      }
      result.add(max);
    }
    return  result;
  }
}
