package org.coderguruji.interview.leetcode.topFrequency.stack.medium;

import java.util.Stack;

public class BrowserHistory {

  Stack<String> historyStack;
  Stack<String> futureStack;
  String currentUrl;

  public BrowserHistory(String homepage) {
    historyStack = new Stack<>();
    futureStack = new Stack<>();
    currentUrl= homepage;
  }
  public void visit(String url) {
    historyStack.add(url);
    currentUrl= url;
    futureStack= new Stack<>();
  }
  public String back(int steps) {
    while (!historyStack.isEmpty() && steps>0){
      futureStack.push(currentUrl);
      currentUrl=historyStack.pop();
      steps--;
    }
    return currentUrl;
  }
  public String forward(int steps) {
    while (!futureStack.isEmpty() && steps>0){
      historyStack.push(currentUrl);
      currentUrl=futureStack.pop();
      steps--;
    }
    return currentUrl;
  }

}
