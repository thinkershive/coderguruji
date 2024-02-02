package org.coderguruji.interview.leetcode.topFrequency.twoDimen.easy;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

  public boolean canAttendMeetings(int[][] intervals) {
    //Arrays.sort(intervals, (a,b)->a[0]-b[0]);
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    for (int i = 1; i < intervals.length; i++) {
      if(intervals[i][0] < intervals[i-1][1]) return false;
    }
    return true;
  }

}
