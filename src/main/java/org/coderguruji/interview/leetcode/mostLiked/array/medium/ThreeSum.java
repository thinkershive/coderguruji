package org.coderguruji.interview.leetcode.mostLiked.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length-2; i++) { //nums.length-2 -> we need check 3 numbers sum so no out of bound


    }

    return result;
    }
  }

}
