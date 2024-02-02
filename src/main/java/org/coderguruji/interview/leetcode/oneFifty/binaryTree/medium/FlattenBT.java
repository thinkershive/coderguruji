package org.coderguruji.interview.leetcode.oneFifty.binaryTree.medium;

import java.util.Stack;
import leetcode.topFrequency.binaryTree.TreeNode;

public class FlattenBT {

  public void flatten(TreeNode root) {
    if (root==null) return;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()){
      TreeNode node = stack.pop();
      if (node.right!=null) stack.push(node.right);
      if (node.left!=null) stack.push(node.left);

      //check for empty and setting right of root as stack peek.
      if(!stack.isEmpty()){
        root.right = stack.peek();
      }
    }
    // setting Every left node to null
    root.left=null;
  }

}
