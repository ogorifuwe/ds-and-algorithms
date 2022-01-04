/**
 * Problem Statement:
 * Find duplicates in a one-dimensional array of integers where the integer values
 * are less than the length of array.
 *
 * NB: Edge case checks are not implemented in solution
 */

package com.oi.algo.array;

import java.lang.Math;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class DuplicatesInArray {


  public static void main(String[] args) {
    
    int[] intArr1 = new int[]{2, 3, -1, 4, 3, 2};

    List<Integer> res1 = getDuplicateValues1(intArr1);
    List<Integer> res2 = getDuplicateValues2(intArr1);

    System.out.println("res1: " + res1);
    System.out.println("res2: " + res2);
  }


  // O(n) using hash table
  static List<Integer> getDuplicateValues1(int[] intArr) {
    
    List<Integer> res = new LinkedList<>();
    Map<Integer, Integer> freq = new HashMap<>();


    for (int i = 0; i < intArr.length; ++i) {
      if (!freq.containsKey(intArr[i])) {
        freq.put(intArr[i], 1);
      } else {
          if (!res.contains(intArr[i])) {
            res.add(intArr[i]);
          }
      }
    }

    return res;
  }

  
  // O(n) in place
  static List<Integer> getDuplicateValues2(int[] intArr) {
    
    List<Integer> res = new LinkedList<>();

    for (int i = 0; i < intArr.length; ++i) {
      if (intArr[Math.abs(intArr[i])] > 0) {
        intArr[Math.abs(intArr[i])] = -intArr[Math.abs(intArr[i])];
      } else {
          if (!res.contains(Math.abs(intArr[i]))) {
            res.add(Math.abs(intArr[i]));
          }
      }
    }

    return res;
  }

}
