package org.coderguruji.interview.leetcode.topFrequency.array.easy;

import java.util.HashSet;

public class ContainDuplicate {

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) return true;
      set.add(nums[i]);
    }
    return false;
  }
}
