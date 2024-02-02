package org.coderguruji.interview.leetcode.seventyfive.list.stack.medium;

import java.util.Stack;

public class AsteroidCollision {

  public int[] asteroidCollision(int[] asteroids){
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < asteroids.length; i++) {
      if(stack.isEmpty() || asteroids[i]>0) stack.push(asteroids[i]);
      else{
        //get last element from stach and compare with current.
        while (true){
          int peek = stack.peek();
          if(peek<0) { // current and peek both negative
            stack.push(asteroids[i]); break;
          } else if (peek == -asteroids[i]) { // current and peek are same but opposite sign
            stack.pop(); break;
          } else if (peek > -asteroids[i]) {
            break;
          }else {
            stack.pop();
            if (stack.isEmpty()) stack.push(asteroids[i]);break;
          }
        }
      }
      }
      int[] result = new int[stack.size()];
    for (int i = stack.size()-1; i >=0 ; i++) {
      result[i] = stack.pop();
    }
  return result;
  }
  }



