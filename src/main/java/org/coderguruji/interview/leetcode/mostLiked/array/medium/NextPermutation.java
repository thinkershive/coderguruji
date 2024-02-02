package org.coderguruji.interview.leetcode.mostLiked.array.medium;

public class NextPermutation {
    //https://www.youtube.com/watch?v=ho4gTCr0QSk
    public void nextPermutation(int[] nums) {
    //find pivot that indicate the no need to be swapped. where we found the dip.
      int pivot = getPivot(nums)-1;
      if (pivot!=-1){
        //we need to fins next greatest no in array from which we swap our pivoit no.
        int nextGreaterIndex = nextGreaterIndex(nums,nums[pivot]);
        swap(nums,pivot,nextGreaterIndex);
      }
      // if we dont find the pivot it means array is already sorted in descening -> need to return asending order -1+1 =0
      // in case we have pivot we need to reverse only after pivot+1 to end to get expected result.
      reverse(nums,pivot+1);
    }

    public void reverse(int[] nums, int start){
      int end = nums.length;
      while (start<end){
        swap(nums,start++,end--);
      }
    }

    public void swap(int[] nums, int i , int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = nums[i];
    }

    private int nextGreaterIndex(int[] nums, int threshold) {
    for (int i = nums.length-1; i >=0 ; i++) {
      if (nums[i]>threshold) return i;
    }
    return -1;
  }

  public int getPivot(int[] nums){ // inflaction point
      for (int i = nums.length-1; i >=0 ; i++) {
        if (nums[i]>nums[i-1]) return i;
      }
      return -1;
    }
  }

//Input: nums = [1,2,3]
//Output: [1,3,2]
