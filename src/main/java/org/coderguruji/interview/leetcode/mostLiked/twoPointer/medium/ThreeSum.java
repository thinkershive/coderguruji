package org.coderguruji.interview.leetcode.mostLiked.twoPointer.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  //Input: nums = [-1,0,1,2,-1,-4]
  //Output: [[-1,-1,2],[-1,0,1]]
  
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums); //SORT : [-4,-1,-1,0,1,2]
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length-2; i++) { // nums.length-2 -> we need check 3 numbers sum so no out of bound
      if (i==0 || (i>0&& nums[i]!=nums[i-1])){ // skipping the number if it's same as previous
        int low = i+1;
        int high = nums.length-1;
        int sum = 0-nums[i];
        while (low<high){
          if(sum== nums[low]+nums[high]){
            result.add(Arrays.asList(nums[i],nums[low],nums[high]));
            while (low<high && nums[low]==nums[low+1]) low++; // to avoid the duplicate
            while (low<high && nums[high]==nums[high-1]) high--; // to avoid the duplicate
            low++;high--;
          } else if ((nums[low]+nums[high])>sum) {
            high--;
          }else low++;
        }
      }
    }
    return result;
  }
}
