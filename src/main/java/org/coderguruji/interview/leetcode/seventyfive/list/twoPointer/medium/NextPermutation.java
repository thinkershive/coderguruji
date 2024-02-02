package org.coderguruji.interview.leetcode.seventyfive.list.twoPointer.medium;

public class NextPermutation {
  public void nextPermutation(int[] nums) {
    //find pivot - index before peek
    // if pivot exist get lastIndexGreater to pivot and swap
    // reverse in both case pivot exist or not.
    int pivot= indexOfLastPeek(nums) - 1;
    // partitions nums into [prefix pivot suffix]
    if(pivot!=-1){
      int nextPrefix = lastIndexGreater(nums, nums[pivot]);
      swap(nums, pivot,nextPrefix);
    }
    reverseSuffix(nums,pivot+1);
  }


  public int lastIndexGreater(int[] nums, int threshold){
    for(int i = nums.length-1; i>=0; i--){
      if(nums[i]>threshold) return i;
    }
    return -1;
  }
  public int indexOfLastPeek(int[] nums){
    for(int i = nums.length-1; i >0; i--){
      if(nums[i]>nums[i-1]) return i;
    }
    return 0;
  }

  public void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  public void reverseSuffix(int[] nums, int start){
    int end = nums.length-1;
    while(start<end){
      swap(nums,start++, end--);
    }
  }

}
