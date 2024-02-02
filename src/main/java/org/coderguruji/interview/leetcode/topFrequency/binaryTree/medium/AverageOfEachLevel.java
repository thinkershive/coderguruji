package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.topFrequency.binaryTree.TreeNode;

public class AverageOfEachLevel {

  // Same algorithm for calculting levelSum in deepest level sum.
  //In order to calculate avaerage avarge = levelSum/size and add to list.
  public List<Double> averageOfLevels(TreeNode root){
    List<Double> result = new ArrayList<>();
    if (root==null)return result;
    Queue<TreeNode> queue  = new LinkedList<>();
    queue.add(root);
    double levelSum = 0;
    while (!queue.isEmpty()){
      int size = queue.size();
      levelSum=0;
      for (int i = 0; i < size; i++) {
        TreeNode currentNode  = queue.poll();
        levelSum+=currentNode.val;
        if (currentNode.left!=null)queue.add(currentNode.left);
        if (currentNode.right!=null)queue.add(currentNode.right);
      }
      result.add(levelSum/size);
    }
return result;
  }

}
