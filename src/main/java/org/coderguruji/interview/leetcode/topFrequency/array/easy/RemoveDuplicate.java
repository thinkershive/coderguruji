package org.coderguruji.interview.leetcode.topFrequency.array.easy;

public class RemoveDuplicate {
  //Return unque element
  //nums = [0,0,1,1,1,2,2,3,3,4]
  public int removeDuplicates(int[] nums) {
    int writeCounter=0;
    for (int readCounter = 0; readCounter < nums.length; readCounter++) {
      if (readCounter==0 || nums[readCounter]!=nums[readCounter-1]){
        nums[writeCounter++]=nums[readCounter];
      }
    }
    return writeCounter;
  }

}
