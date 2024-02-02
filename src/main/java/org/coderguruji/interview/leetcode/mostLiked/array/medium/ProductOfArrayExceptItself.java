package org.coderguruji.interview.leetcode.mostLiked.array.medium;

public class ProductOfArrayExceptItself {

  public int[] productExceptSelf(int[] nums) {
    int size = nums.length;
    int[] left_product = new int[size];
    int[] right_product = new int[size];
    int[] output= new int[size];
    left_product[0] = nums[0];
    right_product[size-1] = nums[size-1];
    for (int i = 1; i < size; i++) {
        left_product[i] = nums[i-1]*left_product[i-1];
    }
    for (int i = size-2; i >=0; i--){
      right_product[i] = nums[i+1]*right_product[i+1];
    }
    for (int i = 0; i < size; i++) {
      output[i] = left_product[i]* right_product[i];
    }
    return output;
  }

}
