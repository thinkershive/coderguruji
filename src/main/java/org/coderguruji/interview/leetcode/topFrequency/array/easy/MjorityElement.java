package org.coderguruji.interview.leetcode.topFrequency.array.easy;

import java.util.HashMap;
import java.util.HashSet;

public class MjorityElement {

  // version 1 use Hashmap to put value and check in same loop hvaing count > n/2
  // version 2 use Boyer-Moore algorithim

  public int majorityElement1(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
      if (map.get(nums[i])>nums.length/2) return nums[i];
    }
    return -1;
  }

//  Input: nums = [2,2,1,1,1,2,2]
//  Output: 2
  public int majorityElement(int[] nums) {
    int result= 0; int count=0;
    for(Integer num: nums){
      //set default value first // base case
      if (count ==0) result=num;
      count = (num==result) ? count+1: count-1;
    }
    return result;
  }

}
