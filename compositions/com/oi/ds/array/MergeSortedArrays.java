/**
 * Problem Statement: Given two sorted integer arrays nums1 and nums2,
 * merge nums2 into nums1 as one sorted array.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has a size equal to m + n such that it has enough space
 * to hold additional elements from nums2.
 */
package com.oi.ds.array;
import java.util.Arrays;

public class MergeSortedArrays {

  static int[] mergeSortedArrays(int[] nums1, int[] nums2, int m, int n) {
    
    int i = 0, j = 0, k = 0;
    int[] res = new int[m+n];

    while (i < m && j < n) {
      if (nums1[i] < nums2[j]) {
        System.out.println("k: " + k + " i: " + i);
        res[++k] = nums1[++i];
        //++k; ++i;
      } else {
          res[k] = nums2[j];
          ++k; ++j;
      }
    }

    while (i < m) {
      res[k] = nums1[i];
      ++k; ++i;
    }

    while (j < n) {
      res[k] = nums2[j];
      ++k; ++j;
    }

    return res;
  }

  public static void main(String[] args) {
    
    int[] nums1 = { 1,2,3,0,0,0}; 
    int[] nums2 = {2,5,6}; 
    int m = 3, n = 3;
    // Output: [1,2,2,3,5,6]
    int[] res = mergeSortedArrays(nums1, nums2, m, n);
    System.out.println(Arrays.toString(res));
  }
}
