package org.coderguruji.interview.leetcode.topFrequency.stack.medium;

import java.util.Stack;

//MinStack() initializes the stack object.
//    void push(int val) pushes the element val onto the stack.
//    void pop() removes the element on the top of the stack.
//    int top() gets the top element of the stack.
//    int getMin() retrieves the minimum element in the stack.
public class MinStack {
  Stack<Integer> actualStack;
  Stack<Integer> minStack;

  MinStack(){
    actualStack = new Stack<>();
    minStack = new Stack<>();
  }
  public int top(){
    if (!actualStack.isEmpty()) return actualStack.peek();
    return -1;
  }
  public int getMin(){
    if (!minStack.isEmpty()) return minStack.peek();
    return -1;
  }
  public void push(int num){
    actualStack.push(num);
   if (minStack.isEmpty() || num<minStack.peek()) minStack.push(num);
  }
  public void pop(){
    if (!actualStack.isEmpty()) {
      int pop = actualStack.pop();
      if (!minStack.isEmpty() && pop == minStack.peek())
        minStack.pop();
    }
  }

}
