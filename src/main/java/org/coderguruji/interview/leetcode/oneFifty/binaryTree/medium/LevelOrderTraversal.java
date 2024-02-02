package org.coderguruji.interview.leetcode.oneFifty.binaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.topFrequency.binaryTree.TreeNode;

public class LevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> finalList = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root==null) return finalList;
    queue.add(root);
    while (!queue.isEmpty()){
      int size = queue.size();
      List<Integer> traveresedList = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode tempNode = queue.poll();
        traveresedList.add(tempNode.val);
        if(tempNode.left!=null) queue.add(tempNode.left);
        if(tempNode.right!=null) queue.add(tempNode.right);
      }
      finalList.add(traveresedList);
    }
    return finalList;
  }

}
