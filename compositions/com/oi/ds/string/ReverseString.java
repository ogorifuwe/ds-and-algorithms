/**
 * Write a function that reverses a string. The input string is given as
 * an array of characters s.
 */
package com.oi.ds.string;

class ReverseString {

  public static void main(String[] args) {
    char[] ch = {'h', 'e', 'l', 'l', 'o'};
    char[] res0 = reverseString0(ch);

    System.out.println("Iterative reversed String: " + java.util.Arrays.toString(res0));
  }

  /**
   * Iterative
   * Time COmplexity: O(n/2) => O(n)
   * Space Complecity: O(1)
   */
  protected static char[] reverseString0(char[] ch) {

    int i = 0, j = ch.length - 1;
    while (i < j) {
      swap(ch, i, j);
      ++i;
      --j;
    }
    
    return ch;
  }

  private static void swap(char[] ch, int start, int end) {
    char buffer = ch[start];
    ch[start] = ch[end];
    ch[end] = buffer;
  }

}
