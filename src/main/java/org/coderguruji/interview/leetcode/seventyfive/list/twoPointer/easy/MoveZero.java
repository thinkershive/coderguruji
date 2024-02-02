package org.coderguruji.interview.leetcode.seventyfive.list.twoPointer.easy;

public class MoveZero {
  public void moveZeroes(int[] nums) {
    int writeCounter=0;
    for(int i = 0; i < nums.length;i++){
      if(nums[i]!=0){
        nums[writeCounter]=nums[i];
        writeCounter++;
      }
    }
    for(int i = writeCounter;i< nums.length;i++){
      nums[writeCounter]=0;
      writeCounter++;
    }

  }

}
