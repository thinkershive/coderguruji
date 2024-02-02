package org.coderguruji.interview.leetcode.mostLiked.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
  Map<Integer,Integer> map ; // to delete in O1
  List<Integer> list; //insert in O1
   Random random = new Random();
  public RandomizedSet() {
    map= new HashMap<>();
    list= new ArrayList<>();
  }

  public boolean insert(int val) {
    if (map.containsKey(val))return false;
    map.put(val,list.size()); // value and its position
    list.add(val);
    return true;

  }
  public boolean remove(int val) {
    if (!map.containsKey(val))return false;
    int lastElement = list.get(list.size()-1);
    int postionOfVal = map.get(val);

    // move the last element to the place idx of the element to delete
    map.put(lastElement,postionOfVal);
    list.set(postionOfVal,lastElement);

    list.remove(list.size()-1);
    map.remove(val);

    return true;
  }

  public int getRandom() {
    return list.get(random.nextInt(list.size()));
  }
}
