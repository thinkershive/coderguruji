package org.coderguruji.interview.leetcode.seventyfive.list.twoPointer.easy;


//Input: s = "abc", t = "ahbgdc"
// Output: true

public class IsSubsequence {
  public boolean isSubsequence(String s, String t) {
    int p1=0; int p2=0;
    while (p1<s.length() && p2<t.length()){
      if(s.charAt(p1)==s.charAt(p2)){
        p1++;p2++;
      }else p2++;
    }

    return p1==s.length();
  }
}
