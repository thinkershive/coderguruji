package org.coderguruji.interview.leetcode.topFrequency.array.medium;

public class GasStation {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int totalGain=0;
    int remaining_Fuel=0;
    int result=0;
    for (int i = 0; i < gas.length; i++) {
      totalGain += gas[i]-cost[i];
      remaining_Fuel += gas[i]-cost[i];
      if (remaining_Fuel<0){
        remaining_Fuel=0;
        result=result+1;
      }
    }
    return totalGain>0? result:-1;
  }

}
