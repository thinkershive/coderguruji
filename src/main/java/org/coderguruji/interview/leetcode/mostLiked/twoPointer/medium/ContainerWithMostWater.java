package org.coderguruji.interview.leetcode.mostLiked.twoPointer.medium;

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int maxArea = 0;
    int area = 0;
    int start = 0;
    int end = height.length - 1;
    while (start < end) {
      if (height[start] < height[end]) {
        area = (end - start) * height[start];
        start++;
      } else {
        area = (end - start) * height[end];
        end--;
      }
      maxArea = Math.max(maxArea, area);
    }
    return maxArea;
  }

}
