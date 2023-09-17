package org.coderguruji.interview.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 * <p>
 * Difficulty - Easy
 * <p>
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
 * <p>
 * Companies 0 - 6 months Amazon 5 6 months - 1 year Apple 3 1 year - 2 years Google 3 Adobe 3
 */
public class KidsWithGreatestCandies {

  public static void main(String[] args) {
    List<Boolean> result = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
    System.out.println(result);
  }

  /**
   * First find
   *
   * @param candies
   * @param extraCandies
   * @return
   */
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>(candies.length);
    int max = candies[0];
    for (int i = 1; i < candies.length; i++) {
      if (candies[i] > max) {
        max = candies[i];
      }
    }
    for (int i = 0; i < candies.length; i++) {
      result.add(candies[i] + extraCandies >= max);
    }
    return result;
  }


}
