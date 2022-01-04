/**
 * Problem Statement: Array is balanced iff there exists a pivot, p,
 * at which the left sum of the array to the pivot is equal to the right
 * sum of the array from the pivot to end of the array.
 *
 * Example:  Input: arr = [1, 2, 3]
 * Output: true
 * 
 * leftSum = arr[0] + arr[1]; 1 + 2 = 3
 * rightSum = arr[3]; 3
 */
package com.oi.algo.array;

public class BalancedArray {

  static boolean isBalanced(int[] arr) {
    
    if (arr == null || arr.length == 0 || arr.length == 1) {
      return false;
    }

    int leftSum = arr[0];
    int rightSum = 0;

    for (int i = 1; i < arr.length; ++i) {
      rightSum += arr[i];
    }

    if (leftSum == rightSum) {
      return true;
    }

    for (int j = 1; j < arr.length; ++j) {
      leftSum += arr[j];
      rightSum -= arr[j];
      
      if (leftSum == rightSum) {
        return true;
      }
    }

    return false;
  }

  static boolean isBalanced1(int[] arr) {
  
    if (arr == null || arr.length == 0 || arr.length == 1) {
      return false;
    }

    if (arr.length == 2) {
      return arr[0] == arr[1];
    }

    int leftSum = 0;
    int rightSum = 0;

    int i = 0, j = arr.length - 1;
    while (i <= arr.length/2 && j > arr.length/2){
      leftSum += arr[i++];
      rightSum += arr[j--];
    }
    leftSum += arr[i++];
    System.out.println("leftSum: " + leftSum);
    System.out.println("rightSum: " + rightSum);

    if (leftSum == rightSum) {
      return true;
    }

    if (leftSum > rightSum) {
      while (i >= 0) {
        leftSum -= arr[i--];
        rightSum += arr[j--];
        if (leftSum == rightSum) {
          return true;
        }
      }
    } else if (leftSum < rightSum) {
        while (j < arr.length) {
        leftSum += arr[i++];
        rightSum -= arr[j++];

        if (leftSum == rightSum) {
          return true;
        }
      }
    }

    return false;
  }

  public static void main(String[] args) {
    
    int[][] arrList = {{}, {1}, {1, 2}, {1, 2, 3}, {4, 2, 1, 1} };

    for (int i = 0; i < arrList.length; ++i) {
      boolean result = isBalanced1(arrList[i]);
      System.out.println(result);
    }
  }
}
