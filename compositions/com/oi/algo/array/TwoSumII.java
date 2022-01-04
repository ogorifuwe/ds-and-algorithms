/**
 *
 */
package com.oi.algo.array;

class TwoSumII {

  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;

    int[] result = twoSum(numbers, target);

    System.out.println("result: " + java.util.Arrays.toString(result));
  }

  /**
   * Two pointers
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  protected static int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];

    int low = 0, high = numbers.length-1;
    while (low < high) {
      int summation = numbers[low] + numbers[high];
      if (target == summation) {
        result[0] = low + 1;
        result[1] = high + 1;
        break;
      } else if (summation < target)
          ++low;
      else
        --high;
    }

    return result;
  }
}
