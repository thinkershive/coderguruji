package org.coderguruji.interview.leetcode.topFrequency.binaryTree.medium;

import java.util.HashMap;
import leetcode.topFrequency.binaryTree.TreeNode;

public class PathSumIII {

  HashMap<Integer, Integer>  map;
  int pathSumCount=0;
  public int pathSum(TreeNode root, int targetSum) {
    map= new HashMap<>();
    dfs(root,0,targetSum);
    return pathSumCount;
  }

  private void dfs(TreeNode root, int prefixSum, int targetSum){
    if (root==null) return;;
    prefixSum+=root.val;

    // If map contains a sum equal to (prefixSum - targetSum), we need to increment count that many times
    if (map.containsKey(prefixSum-targetSum)) pathSumCount+= map.get(prefixSum-targetSum);
    // There can be cases when the prefixSum is directly equal to targetSum, we need to increment count
    if (targetSum==prefixSum) pathSumCount++;
    // Update the prefixSum till current node and it's count
    map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

    // Recurse
    dfs(root.left,prefixSum,targetSum);
    dfs(root.right,prefixSum,targetSum);

    // Backtrack
    map.put(prefixSum, map.get(prefixSum) - 1);
  }

}
