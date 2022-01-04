/**
 * Reverse the elements in an array
 */
package com.oi.algo.array;

class ReverseArray {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    int[] res = reverseArray(arr);
    System.out.println("Reversed arr: " + java.util.Arrays.toString(res));
  }

  static int[] reverseArray(int[] arr) {
    int start = 0, end = arr.length - 1;

    while (start < end) {
      swap(arr, start, end);
      ++start;
      --end;
    }
    return arr;
  }

  private static void swap(int[] arr, int firstValue, int secondValue) {
    int tempBuffer = arr[firstValue];
    arr[firstValue] = arr[secondValue];
    arr[secondValue] = tempBuffer;
  }
}
