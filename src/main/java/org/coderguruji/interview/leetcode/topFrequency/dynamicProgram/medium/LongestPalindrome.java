package org.coderguruji.interview.leetcode.topFrequency.dynamicProgram.medium;

public class LongestPalindrome {

  public String longestPalindrome(String word){
    if (word==null || word.length()==0) return "";
    int start =0;int end=0;
    for (int i = 0; i < word.length(); i++) {
      int len1 = expandFromMiddle(word,i,i);
      int len2= expandFromMiddle(word,i,i+1);
      int len= Math.max(len2,len1);
      if (len>start-end){
        end = i+(len/2);
        start = i- ((len-1)/2);
      }
    }
    return word.substring(start,end+1);
  }
  public int expandFromMiddle(String word, int start, int end){
    if (word==null || start>end) return 0;
    while (  start>=0 && end < word.length() && word.charAt(start)==word.charAt(end)){
      start--;
      end++;
    }

  return end-start-1;
  }

}
