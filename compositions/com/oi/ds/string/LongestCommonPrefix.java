/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings. If there is no common prefix string, return an empty string "".
 */
package com.oi.ds.string;

class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] strs = {"flower", "flow", "flight"};
    String prefix0 = longestCommonPrefix0(strs);
    //String prefix1 = longestCommonPrefix1(strs);
    String prefix2 = longestCommonPrefix2(strs);
    String prefix3 = longestCommonPrefix3(strs);

    System.out.println("Horizontal Scanning: " + prefix0);
    //System.out.println("Vertical Scanning: " + prefix1);
    System.out.println("Divide and Conquer: " + prefix2);
    System.out.println("Binary Search: " + prefix3);
  }

  /**
   * Horizontal Scanning
   * Time Complexity: O(S), where S is the sum of all the characters in all strings. 
   * Space Complexity: O(1), since no extra space is used.
   */
  static String longestCommonPrefix0(String[] strs) {
    String prefix = "";
    if (strs == null || strs.length == 0) return prefix;
    else {
      prefix = strs[0];
      for (int i = 0; i < strs.length; ++i) {
        while (strs[i].indexOf(prefix) != 0) 
          prefix = prefix.substring(0, prefix.length()-1);
      }
      return prefix;
    }
  }

  /**
   * Vertical Scanning
   * Time Complexity: O(S), where S is the sum of all the characters in all strings.
   * Space Complexity: O(1), since no extra space is used.
   */
  static String longestCommonPrefix1(String[] strs) {
    String prefix = "";
    if (strs == null || strs.length == 0) return prefix;
    else {
      prefix = strs[0];
      for (int i = 0; i < strs[0].length(); ++i) {
        char ch = strs[0].charAt(i);
        for (int j = 1; j < strs.length; ++j) {
          if (i == strs[j].length() || strs[j].charAt(i) != ch)
            prefix = prefix.substring(0, i);
          break;
        }
      }
      return prefix;
    }
  }

  /**
   * Divide and Conquer
   * Time Complexity: O(S), where S is the number of all characters in the input array
   * Space Complexity: O(mlogn), there is amemory overhead since store recursive calls
   * in the execution stack.
   */
  static String longestCommonPrefix2(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    return longestCommonPrefix(strs, 0, strs.length-1);
  }

  private static String longestCommonPrefix(String[] strs, int l, int r) {
    if (l == r) return strs[l];
    else {
      int mid = (l + r) / 2;
      String lcpLeft = longestCommonPrefix(strs, l, mid);
      String lcpRight = longestCommonPrefix(strs, mid+1, r);
      return commonPrefix(lcpLeft, lcpRight);
    }
  }

  private static String commonPrefix(String left, String right) {
    int min = Math.min(left.length(), right.length());
    for (int i = 0; i < min; ++i) {
      if (left.charAt(i) != right.charAt(i))
        return left.substring(0, i);
    }
    return left.substring(0, min);
  }

  /**
   * Binary Search
   * Time Complexity: O(Slogm), where S is the sum of all the characters in all strings
   * in the input array. The algorithm makes log m iterations, for each of them there are
   * S = m.n comparisons.
   * Space Complexity: O(1)
   */
  static String longestCommonPrefix3(String[] strs) {
    if (strs == null || strs.length == 0) return "";

    int minLen = Integer.MAX_VALUE;
    for (String str: strs)
      minLen = Math.min(minLen, str.length());

    int low = 1;
    int high = minLen;
    while (low <= high) {
      int middle = (low + high) / 2;
      if (isCommonPrefix(strs, middle))
        low = middle + 1;
      else
        high = middle - 1;
    }

    return strs[0].substring(0, (low + high) / 2);
  }

  private static boolean isCommonPrefix(String[] strs, int len) {
    String str1 = strs[0].substring(0, len);
    for (int i = 1; i < strs.length; ++i)
      if (!strs[i].startsWith(str1)) return false;
      
    return true;
  }
}
