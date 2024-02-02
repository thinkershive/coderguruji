package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.topFrequency.binaryTree.TreeNode;
import leetcode.topFrequency.binaryTree.TreeNode.*;

public class ZigZagLevelTraverse {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> finalList = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root==null) return finalList;
    queue.add(root);
    int level=0;
    while (!queue.isEmpty()){
      List<Integer> tempList = new ArrayList<>();
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode temp = queue.poll();
        if(level%2==0){
          tempList.add(temp.val);
        }else{
          tempList.add(0,temp.val);
        }
        if(temp.left!=null)queue.add(temp.left);
        if(temp.right!=null)queue.add(temp.right);
      }
      level++;
      finalList.add(tempList);

    }

    return finalList;

  }

}
