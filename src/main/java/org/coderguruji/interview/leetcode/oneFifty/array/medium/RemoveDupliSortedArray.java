package org.coderguruji.interview.leetcode.oneFifty.array.medium;

public class RemoveDupliSortedArray {

  //[1,1,1,2,2,3]
  public int removeDuplicates(int[] nums) {
    if (nums.length<=2) return nums.length;
    int writeCounter =2;
    for (int i = 2; i <nums.length ; i++) {
          if (nums[i]!=nums[i-2]){
            nums[writeCounter] = nums[i];
            writeCounter++;
          }
    }
    return writeCounter;
  }

}
