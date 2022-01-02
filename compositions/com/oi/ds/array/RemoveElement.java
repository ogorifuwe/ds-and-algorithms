/**
 * Given an array and a value, remove all instances of that value in place
 * and return the new length
 */
package com.oi.ds.array;

class RemoveElement {

  public static void main(String[] args) {
    int[] arr0 = {3, 6, 7, 2, 7, 2, 6, 1, 6, 8, 9};
    int[] arr1 = {3, 6, 7, 2, 7, 2, 6, 1, 6, 8, 9};
    int val = 6;

    int result0 = removeElement0(arr0, val);
    int result1 = removeElement1(arr1, val);

    System.out.println("New Length 0: " + result0);
    System.out.println("New Length 1: " + result1);
  }

  /**
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  protected static int removeElement0(int[] arr, int val) {
    int j = 0;

    for (int i = 0; i < arr.length; ++i) {
      if (arr[i] != val) {
        arr[j] = arr[i];
        ++j;
      }
    }
    return j;
  }

  /**
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  protected static int removeElement1(int[] arr, int val) {
    int i = 0, n = arr.length;
    while (i < n) {
      if (arr[i] == val) {
        arr[i] = arr[n-1];
        --n;
      } else {
          ++i;
      }
    }

    return n;
  }
}
