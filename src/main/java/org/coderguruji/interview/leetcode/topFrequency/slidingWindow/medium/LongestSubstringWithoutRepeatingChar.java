package org.coderguruji.interview.leetcode.topFrequency.slidingWindow.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar   {


//  Input: s = "abcabcbb"
//  Output: 3
//  Explanation: The answer is "abc", with the length of 3.

  public int lengthOfLongestSubstring(String s) {
    int a_pointer=0; int b_pointer =0; int max= 0;
    HashSet<Character> set = new HashSet<>();
    while (b_pointer<s.length()){
      if(!set.contains(s.charAt(b_pointer))){
        set.add(s.charAt(b_pointer));
        max= Math.max(set.size(),max);
        b_pointer++;
      }else{
        set.remove(s.charAt(a_pointer));
        a_pointer++;
      }
    }
    return max;
  }
}
