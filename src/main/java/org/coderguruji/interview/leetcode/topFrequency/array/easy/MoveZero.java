package org.coderguruji.interview.leetcode.topFrequency.array.easy;

public class MoveZero {

//  Input: nums = [0,1,0,3,12]
//  Output: [1,3,12,0,0]

  public void moveZeroes(int[] nums) {
    int write=0;
    for (int read = 0; read < nums.length; read++) {
      if (nums[read]!=0){
        nums[write++] =nums[read];
      }
    }

    for (int i = write; i < nums.length; i++) {
      nums[write++] =0;
    }
  }



}
