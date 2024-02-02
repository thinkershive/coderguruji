package org.coderguruji.interview.leetcode.oneFifty.binarySearchTree.medium;

import java.util.ArrayList;
import java.util.List;
import leetcode.topFrequency.binaryTree.TreeNode;

public class KthSmallestElement {

  public List<Integer> dfsInorder(TreeNode root, List<Integer> result){
    if (root==null) return  result;
    dfsInorder(root.left,result);
    result.add(root.val);
    dfsInorder(root.right,result);
    return result;
  }

  public int kthSmallest(TreeNode root, int k) {
    List<Integer> list = dfsInorder(root,new ArrayList<>());
    return list.get(k-1);
  }

}
