package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.topFrequency.binaryTree.TreeNode;

public class RightSideView {
//The main difference between add() and offer() is that if the queue is full, add() will
// throw an IllegalStateException, while offer() will simply return false.
  public List<Integer> rightSideView(TreeNode root){
    List<Integer> finalList = new ArrayList<>();
    if (root==null) return finalList;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()){
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode currentNode = queue.poll();
        if (i == 0) finalList.add(currentNode.val);
//        if (currentNode.right!=null)queue.add(currentNode.right);
//        if (currentNode.left!=null)queue.add(currentNode.left);

        if (currentNode.right!=null)queue.offer(currentNode.right);
        if (currentNode.left!=null)queue.offer(currentNode.left);
      }
    }

    return finalList;

  }

}
