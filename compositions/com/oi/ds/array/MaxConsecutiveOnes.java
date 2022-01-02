/**
 * Given a binary array nums, return the maximum number of consecutive 1's
 * in the array.
 */
package com.oi.ds.array;

class MaxConsecutiveOnes {
  
  public static void main(String[] args) {
    int[] nums = {1, 1, 0, 1, 1, 1};
    int result = maxConsecutiveOnes(nums);

    System.out.println("Max Consecutive Ones: " + result);
  }

  protected static int maxConsecutiveOnes(int[] nums) {
    int currCount = 0, maxCount = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] == 1) {
        ++currCount;
      } else {
          maxCount = Math.max(maxCount, currCount);
          currCount = 0;
      }
    }
    return Math.max(maxCount, currCount);
  }
}
