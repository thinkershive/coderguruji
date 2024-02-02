package org.coderguruji.interview.leetcode.oneFifty.array.medium;

public class BuySellTwo {
  public int rotate(int[] profits){
    int maxProfit =  0;
    for (int i = 1; i < profits.length; i++) {
      if (profits[i]>profits[i-1]){
        maxProfit+=profits[i]-profits[i-1];
      }
    }

    return maxProfit;
  }

}
