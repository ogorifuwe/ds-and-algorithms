/**
 * Question:
 * Construct an algorithm to check whether two words (or phrases) are anagrams or not.
 *
 * "An anagram is a word or phrase formed by rearranging the letters of a diffrent word
 * or phrase, typically using all the original letters exactly once."
 */
package com.oi.ds.array;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    
    String str1 = "restful";
    String str2 = "fluster";

    boolean res1 = isAnagram1(str1, str2);
    boolean res2 = isAnagram2(str1, str2);

    System.out.println("isAnagram1: " + res1);
    System.out.println("isAnagram2: " + res2);
  }

  // O(nlogn) solution 
  static boolean isAnagram1(String str1, String str2) {

    boolean res;

    if (!(str1.length() == str2.length())) {
        res = false;
    } else {

      char[] charArr1 = str1.toCharArray();
      char[] charArr2 = str2.toCharArray();

      Arrays.sort(charArr1);
      Arrays.sort(charArr2);

      res = Arrays.equals(charArr1, charArr2);
    }

    return res;
  }

  // O(n) solution
  static boolean isAnagram2(String str1, String str2) {
  
    boolean res;
    int length = 256; // 256 is the total no. of extended ASCII characters. Per requirement, consider using 128 (ASCII characters) or even 26 for English Alphabets.
    int[] freq = new int[length];
    if (!(str1.length() == str2.length())) {
      res = false;
    } else {
        for (int i = 0; i < str1.length(); ++i) {
          freq[str1.charAt(i)]++;
          freq[str2.charAt(i)]--;
        }

        for (int j = 0; j < str1.length(); ++j) {
          if (!(freq[j] == 0)) {
            res = false;
            break;
          }
        }

        res = true;
    }

    return res;
  }
}
