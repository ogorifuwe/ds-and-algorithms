package com.oi.ds.array;
import java.util.Arrays;

public class ReverseArrayInPlace {

  public static void main(String[] args) {
    
    int[][] intArrs = {
      new int[]{},
      new int[]{1},
      new int[]{1, 2},
      new int[]{1, 2, 3},
      new int[]{1, 2, 3, 4},
      new int[]{1, 2, 3, 4, 5},
    };


    // reverse arrays using either reverseIntArray or reverseIntArray1
    for (int i = 0; i < intArrs.length; ++i) {
        int[] res0 = reverseIntArray(intArrs[i]);
        System.out.println(Arrays.toString(res0));

        int[] res1 = reverseIntArray1(intArrs[i]);
        System.out.println(Arrays.toString(res1));
      }
    }


  // initial solution
  static int[] reverseIntArray(int[] arr) {
    
    int arrLength = arr.length;

    if (arrLength <= 1) {
      return arr;
    } else if (arrLength == 2) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        return arr;
    }
      
    for (int i = 0; i < arrLength; ++i) {
      if (i == arrLength/2) {
         break;
      } else {
          int tmp = arr[arrLength - i - 1];
          arr[arrLength - i - 1] = arr[i];
          arr[i] = tmp;
      }
    }

    return arr;
  }

  // modified solution
  static int[] reverseIntArray1(int[] arr) {
    
    int startIndex = 0;
    int endIndex = arr.length - 1;

    while (endIndex > startIndex) {
      intSwap(arr, startIndex, endIndex);
      ++startIndex;
      --endIndex;
    }

    return arr;
  }

  // utility method
  private static void intSwap(int[] intArr, int index1, int index2) {
    int temp = intArr[index1];
    intArr[index1] = intArr[index2];
    intArr[index2] = temp;
  }
}
