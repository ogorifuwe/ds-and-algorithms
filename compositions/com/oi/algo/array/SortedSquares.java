package com.oi.algo.array;

public class SortedSquares{

  static int[] sortedSquares(int[] nums) {

    int n = nums.length;
    int positivePointer = 0;

    while (positivePointer < n && nums[positivePointer] < 0) {
      ++positivePointer;
    }
    
    int negativePointer = positivePointer - 1;
    int[] sortedSquares = new int[n];
    int index = 0;

    while (negativePointer >= 0 && positivePointer < n) {
      int squareNegativePointer = nums[negativePointer] * nums[negativePointer];
      int squarePositivePointer = nums[positivePointer] * nums[positivePointer];
      if (squareNegativePointer < squarePositivePointer) {
        sortedSquares[index] = squareNegativePointer;
        --negativePointer;
      }  else {
          sortedSquares[index] =  squarePositivePointer;
          ++positivePointer;
      }
      ++index;
    }

    while (negativePointer >= 0) {
      sortedSquares[index] = nums[negativePointer] * nums[negativePointer];
      --negativePointer;
      ++index;
    }

    while (positivePointer < n) {
      sortedSquares[index] = nums[positivePointer] * nums[positivePointer];
      ++positivePointer;
      ++index;
    }

    return sortedSquares;
  }

  public static void main(String[] args) {
    
    int[] nums = {-4, -1, 0, 3, 10};
    int[] res = sortedSquares(nums);
    System.out.println(java.util.Arrays.toString(res));
  }
}
