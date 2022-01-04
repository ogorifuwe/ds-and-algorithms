/**
 * Problem Statement: An element in a sorted array can be found in O(log n) time using
 * binary search. Suppose an ascending order sorted array is rotated at some pivot
 * unknown to you beforehand, write an algo to find an element in the rotated array.
 */

package com.oi.algo.array;

public class RotatedArraySearch {


  /* searches an element key in a pivoted sorted array of size n */
  public static int search(int[] arr, int low, int high, int key) {
    
    if ( low > high) {
      return -1;
    }

    int mid = (low + high) / 2;

    if (arr[mid] == key) {
      return mid;
    }

    // if first half of arr is sorted
    if (arr[low] <= arr[mid]) {
      if (key >= arr[low] && key <= arr[mid]) {
        return search(arr, low, mid-1, key);
      }

      return search(arr, mid+1, high, key);
    }

    if (key >= arr[mid] && key <= arr[high]) {
      return search(arr, mid+1, high, key);
    }

    return search(arr, low, mid-1, key);
  }

  public static void main(String[] args) {
    
    int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
    int n = arr.length;
    int key = 6;
    int res = search(arr, 0, n-1, key);
    System.out.println("index: " + res);
  }
}
