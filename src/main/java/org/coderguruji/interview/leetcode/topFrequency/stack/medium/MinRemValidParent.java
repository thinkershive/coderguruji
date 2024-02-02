package org.coderguruji.interview.leetcode.topFrequency.stack.medium;

import java.util.HashSet;
import java.util.Stack;

//Input: s = "lee(t(c)o)de)"
//Output: "lee(t(c)o)de"
public class MinRemValidParent {
  public String minRemoveToMakeValid(String s) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isAlphabetic(ch))
        continue;
      if (ch == '(') {
        stack.push(i);
      } else {
        if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
          stack.pop();
        } else
          stack.push(i);
      }
    }
    StringBuilder result = new StringBuilder();
    HashSet<Integer> set = new HashSet<>(stack);
    System.out.println("set" + set.size() );
    for (int i = 0; i < s.length(); i++)
      if (!set.contains(i))
        result.append(s.charAt(i));
    return result.toString();
  }


}
