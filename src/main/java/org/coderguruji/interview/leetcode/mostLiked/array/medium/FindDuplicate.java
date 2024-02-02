package org.coderguruji.interview.leetcode.mostLiked.array.medium;

public class FindDuplicate {
//  Sort: Sort the array and check adjacent elements for duplicates.
//  Set/Hash Table: Use a hash table to track the numbers that have appeared so far.
//  Marking in Array: Negate the value at the index corresponding to each number in the array.
//  Floyd's Cycle Detection (Fast-Slow Pointers): Treat the array as a linked list to find a cycle.
//  Binary Search: Count the numbers less than or equal to the middle element to find the duplicate.
//  Count Array: Use an auxiliary array to count the frequency of each number.



//if the input array is [1,3,3,2] then for 1, flip the number at index 1, making the array [1,−3,3,2].
 //O(n) o(1)
  public static int getDuplicateMarkingNegative(int[] nums){
    int duplicate = -1;
    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]);
      if(nums[index] < 0) {
        duplicate = index;
         break;
      }
      nums[index]*=-1;
    }

    // Restore numbers
    for (int i = 0; i < nums.length; i++)
      nums[i] = Math.abs(nums[i]);

    return duplicate;
  }

  public int getDupFloydCycleDetection(int[] nums){
    int fast = nums[0];
    int slow = nums[0];

    // first find the intersection point.
    while (slow != fast){
      slow = nums[slow];
      fast = nums[nums[fast]];
    }
    //  fast ad slow are now in intersecting point.
    //  Reset slow and move fast slow with same speed to get cycle STart point
    slow = 0;
    while (slow != fast){
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }

}
