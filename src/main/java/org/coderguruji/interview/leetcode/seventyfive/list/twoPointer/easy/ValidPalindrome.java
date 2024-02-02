package org.coderguruji.interview.leetcode.seventyfive.list.twoPointer.easy;

//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    int p1=0; int p2 = s.length();
    while (p1<p2){
      char c1= s.charAt(p1);
      char c2 = s.charAt(p2);
      if(!Character.isAlphabetic(c1))p1++;
      else if (!Character.isAlphabetic(c2)) p2--;
      else {
        if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)) return false;
        else {p1++;p2--;}
      }
    }
  return false;
  }
}
