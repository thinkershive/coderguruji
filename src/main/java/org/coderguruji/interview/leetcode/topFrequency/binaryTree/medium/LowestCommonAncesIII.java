package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.HashSet;
import leetcode.topFrequency.binaryTree.TreeNode;

public class LowestCommonAncesIII {
  public TreeNode lowestCommonAncestor1(TreeNode p, TreeNode q) {
    HashSet<TreeNode> visited = new HashSet<>();

    while(p != null) {
      visited.add(p);
      p = p.parent;
    }

    while(q != null) {
      if (visited.contains(q)) {
        return q;
      }
      q = q.parent;
    }

    return null;
  }

  // o1 space
  // we are restting p_Copy,q_Copy to p and q so that both can go same no of steps and reach to common parent at same time.
  public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
    TreeNode p_Copy = p;
    TreeNode q_Copy = q;
    while(p_Copy!=q_Copy){
      p_Copy= p_Copy==null ? q : p_Copy.parent;
      q_Copy= q_Copy==null ? p : q_Copy.parent;
    }

    return p_Copy;

  }

}
