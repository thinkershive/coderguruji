package org.coderguruji.interview.leetcode.oneFifty.array.medium;

public class TrappingRainWater {

  public int getWater(int[] heights){
    int n = heights.length;
    int[] maxLeft = new int[n];
    int[] maxRight = new int[n];
    int max = Integer.MIN_VALUE;
    int result = 0;
    for (int i = 0; i < n; i++) {
      max = Math.max(max,heights[i]);
      maxLeft[i]= max;
    }
    max = Integer.MIN_VALUE;
    for (int i = n-1; i >= 0; i--) {
      max = Math.max(max,heights[i]);
      maxLeft[i]= max;
    }
    for (int i = 0; i < n; i++) {
      result+=Math.min(maxLeft[i],maxRight[i])-heights[i];
    }
  return result;
  }

}
