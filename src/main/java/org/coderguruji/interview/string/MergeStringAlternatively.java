package org.coderguruji.interview.string;

/**
 * Example 1:
 * <p>
 * Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged string will be
 * merged as so: word1:  a   b   c word2:    p   q   r merged: a p b q c r Example 2:
 * <p>
 * Input: word1 = "ab", word2 = "pqrs" Output: "apbqrs" Explanation: Notice that as word2 is longer,
 * "rs" is appended to the end. word1:  a   b word2:    p   q   r   s merged: a p b q   r   s
 * <p>
 * <p>
 * https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
 * <p>
 * 1768. Merge Strings Alternately
 * <p>
 * Amazon 8 Apple 7 Google 4 Microsoft 3 Uber 2 Adobe 2
 */
public class MergeStringAlternatively {

  public static void main(String[] args) {
    String result = mergeAlternately("ab", "pqrs");
    System.out.println(result);
  }

  public static String mergeAlternately(String word1, String word2) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < word1.length() && i < word2.length(); i++) {
      sb.append(word1.charAt(i)).append(word2.charAt(i));
    }
    String longerStr = word1.length() > word2.length() ? word1 : word2;
    int minLength = word1.length() > word2.length() ? word2.length() : word1.length();
    sb.append(longerStr.substring(minLength));
    return sb.toString();
  }
}
