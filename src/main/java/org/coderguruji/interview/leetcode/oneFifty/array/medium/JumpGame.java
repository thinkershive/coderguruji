package org.coderguruji.interview.leetcode.oneFifty.array.medium;

public class JumpGame {

  // i+nums[i] = maximum jump can make at current position i is current position and num[i] is no of jumps
  // ex i= 2, nums[1] = 2 = maximum 2 steps can reach from position 2 
  public boolean canJump(int[] jumps){
    int lastGoodIndex = jumps.length-1;
    for (int i = jumps.length-1; i >=0 ; i++) {
      if(i+jumps[i]>lastGoodIndex){
        lastGoodIndex = i;
      }
    }
    return lastGoodIndex==0;
  }
}
