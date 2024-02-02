package org.coderguruji.interview.leetcode.topFrequency.twoDimen.easy;

public class RichestCustomerWealth {
  public int maximumWealth(int[][] accounts) {
    int maxValue = 0;
    for (int[] account : accounts){
      int customerWealth=0;
      for (int amount : account){
        customerWealth = customerWealth+amount;
      }
      maxValue = Math.max(maxValue,customerWealth);
    }
  return maxValue;
  }

}
