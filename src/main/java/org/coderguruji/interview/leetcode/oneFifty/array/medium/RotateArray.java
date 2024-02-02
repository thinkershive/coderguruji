package org.coderguruji.interview.leetcode.oneFifty.array.medium;

public class RotateArray {

  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int n = nums.length;
    swap(nums, 0, n - 1);
    swap(nums, 0, k - 1);
    swap(nums, k, k - 1);
  }

  public void swap(int[] nums, int left, int right) {
    while (left <= right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }

}
