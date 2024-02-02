package org.coderguruji.interview.leetcode.seventyfive.list.stack.medium;

import java.util.Stack;

public class DecodeString {
  public static String decodeString(String s){
    Stack<Integer> countS  =new Stack<>();
    Stack<String> result = new Stack<>();
    String res="";
    int index =0;
    while (index<s.length()){
      if (Character.isDigit(s.charAt(index))){
        int count = 0;
        // this loop is needed to get all digits like 60,90 >9 -> to be stored in stack
        while (Character.isDigit(s.charAt(index))) {
          count= count*10 + (s.charAt(index)-'0');
          index++;
        }
        countS.push(count);
      } else if (s.charAt(index) =='[') {
        result.push(res);
        res=""; index++;
      }else if (s.charAt(index) ==']') {
      // once we find the closing we need to pop count and append res
        StringBuilder temp = new StringBuilder(result.pop());
        int count = countS.pop();
        for (int i = 0; i < count; i++) {
          temp.append(res);
        }
        res= temp.toString();
        index++;

      }else{
        res+=s.charAt(index); // case when we have character so just append to result.
        index++;
      }
    }
  return res;
  }


}
