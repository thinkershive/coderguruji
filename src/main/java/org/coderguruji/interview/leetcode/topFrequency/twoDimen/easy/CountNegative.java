package org.coderguruji.interview.leetcode.topFrequency.twoDimen.easy;

public class CountNegative {

  public int countNegatives(int[][] grid) {
    int negative=0;
    for (int[] nums:grid){
      for (int num : nums){
        if (num<0)negative++;
      }
    }
    return negative;
  }

  public int countNegativesBS(int[][] grid) {
    int cnt=0;
    for(int arr[]:grid){
      cnt+=bs(arr);
    }
    return cnt;
  }

  private int bs(int[] arr) {
    int start = 0; int end = arr.length-1;
    while (start<end){
      int mid = start + (start-end)/2;
      if(arr[mid]>=0) start=mid+1;
      else end = mid-1;
    }
    return arr.length-start;
  }

}
