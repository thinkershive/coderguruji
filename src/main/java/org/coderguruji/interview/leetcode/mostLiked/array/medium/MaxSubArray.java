package org.coderguruji.interview.leetcode.mostLiked.array.medium;

public class MaxSubArray {

//  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//  Output: 6
//  Explanation: The subarray [4,-1,2,1] has the largest sum 6.

  public int maxSubArray(int[] nums) {
    if (nums==null) return 0;
    int sum=0;
    int finalSum=nums[0];
    for (int i = 0; i < nums.length; i++) {
      if(sum<0) sum=nums[i];
      else sum+=nums[i];
      finalSum = Math.max(finalSum,sum);
    }
    return finalSum;
  }
}
