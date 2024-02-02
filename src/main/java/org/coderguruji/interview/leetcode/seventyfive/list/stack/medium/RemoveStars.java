package org.coderguruji.interview.leetcode.seventyfive.list.stack.medium;

import java.util.Stack;

public class RemoveStars {
  // Input: s = "leet**cod*e"
  // Output: "lecoe"
  public String removeStars(String s) {
    Stack<Character> characterStack = new Stack<>();
    for (Character character : s.toCharArray()){
      if(character!='*'){
        characterStack.push(character);
      }else characterStack.pop();
    }
    StringBuilder sb = new StringBuilder();
    while (!characterStack.isEmpty()){
      sb.append(characterStack.pop());
    }

    return sb.reverse().toString();

  }

}
