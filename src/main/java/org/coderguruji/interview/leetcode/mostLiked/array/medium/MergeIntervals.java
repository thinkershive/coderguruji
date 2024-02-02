package org.coderguruji.interview.leetcode.mostLiked.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
  public int[][] merge(int[][] intervals) {
    if (intervals.length<1) return intervals;
    Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
    //Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    List<int[]> outputList = new ArrayList<>();
    int[] current_int = intervals[0]; // having two values only
    outputList.add(current_int);

    for (int i =1; i < intervals.length;i++){
      int current_start = current_int[0];
      int current_end = current_int[1];

      int next_start = intervals[i][0];
      int next_end = intervals[i][1];

      if(current_end>=next_start){
        current_int[1] = Math.max(current_end,next_end);
      }else {
        current_int= intervals[i];
        outputList.add(current_int);
      }
    }
    return outputList.toArray(new int[0][]);
  }

}
