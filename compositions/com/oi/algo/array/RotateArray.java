/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -2^32 <= nums[i] <= 2^31 - 1
 * 0 <= k < 10^5
 */
package com.oi.algo.array;

class RotateArray {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    int[] result0 = rotateArray0(nums, k);

    System.out.println("Rotated Array: " + java.util.Arrays.toString(result0));
  }

  protected static int[] rotateArray0(int[] nums, int k) {
    k %= nums.length;
    int temp, previous;
    for (int i = 0; i < k; ++i) {
      //System.out.println("nums: " + java.util.Arrays.toString(nums));
      previous = nums[nums.length - 1];//System.out.println("outer previous: " + previous);
      for (int j = 0; j < nums.length; ++j) {
        //System.out.println("curr state of nums: " + java.util.Arrays.toString(nums));
        temp = nums[j]; //System.out.println("temp: " + temp);
        nums[j] = previous;
        previous = temp; //System.out.println("inner previous: " + previous);
      }
    }

    return nums;
  }
}
