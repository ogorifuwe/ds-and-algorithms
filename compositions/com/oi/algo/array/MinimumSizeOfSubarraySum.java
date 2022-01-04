/**
 * Given an array of positive integrs nums and a positive integer target,
 * return the minimal length of a contiguous subarray [nums1, nums1+1, ...,
 * numsr-1, numsr] of which the sun is greater than or equal to target. If
 * there is no such subarray, return 0 instead.
 */
package com.oi.algo.array;

class MinimumSizeOfSubarraySum {

  public static void main(String[] args) {
    int[] nums = {2, 3, 1, 2, 4, 3};
    int target = 7;

    int result0 = minSubarrayLength0(nums, target);
    int result1 = minSubarrayLength1(nums, target);
    int result2 = minSubarrayLength2(nums, target);

    System.out.println("Min size of Subarray: " + result1);
    System.out.println("Min size of Subarray: " + result0);
    System.out.println("Min size of Subarray: " + result2);
  }

  protected static int minSubarrayLength0(int[] nums, int target) {
    int result = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; ++i) {
      for (int j = i; j < nums.length; ++j) {
        int sum = 0;
        for (int k = i; k <= j; ++k) {
          sum += nums[k];
        }
        if (sum >= target) {
          result = Math.min(result, (j - i + 1));
          break;
        }
      }
    }
    return (result != Integer.MIN_VALUE) ? result : 0;
  }

  protected static int minSubarrayLength1(int[] nums, int target) {
    if (nums.length == 0) return 0;

    int result = Integer.MAX_VALUE;
    int[] sums = new int[nums.length];
    sums[0] = nums[0];

    for (int i = 1; i < nums.length; ++i)
      sums[i] = sums[i - 1] + nums[i];

    for (int i = 0; i < nums.length; ++i) {
      for (int j = i; j < nums.length; ++j) {
        int sum = sums[j] - sums[i] + nums[i];
        if (sum >= target) {
          result = Math.min(result, (j - i + 1));
          break;
        }
      }
    }
    return (result != Integer.MIN_VALUE) ? result : 0;
  }

  protected static int minSubarrayLength2(int[] nums, int target) {
    int result = Integer.MAX_VALUE;
    int left = 0, sum = 0;
    for (int i = 0; i < nums.length; ++i) {
      sum += nums[i];
      while (sum >= target) {
        result = Math.min(result, i + 1 - left);
        sum -= nums[left++];
      }
    }

    return (result != Integer.MAX_VALUE) ? result : 0;
  }

}
