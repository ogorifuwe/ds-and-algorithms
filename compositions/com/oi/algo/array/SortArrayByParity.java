/**
 * Problem Statement: Given an integer array nums, move all the even integers at the
 * beginning of the array followed by all the odd integers.
 * Return aby array that satifies this condition.
 */
import java.util.Arrays;

class SortArrayByParity {

  public static void main(String[] args) {
    int[] nums0 = new int[]{3, 1, 2, 4};
    int[] res0 = sortArrayByParity0(nums0);
    System.out.println("Result 0: " + Arrays.toString(res0));

    int[] res1 = sortArrayByParity1(nums0);
    System.out.println("Result 1: " + Arrays.toString(res1));
  }

  /**
   * Custom Comparator Solution
   * Time Complexity: O(NLogN)
   * SPace ComplexityL O(N)
   */
  static int[] sortArrayByParity(int[] nums) {
    Integer[] res = new Integer[nums.length];
    for (int i = 0; i < nums.length; ++i) {
      res[i] = nums[i];
    }

    Arrays.sort(res, (x, y) -> Integer.compare(x%2, y%2));

    for (int i = 0; i < nums.length; ++i) {
      nums[i] = res[i];
    }
    return nums;
    /*return Arrays.stream(nums).boxed()
      .sorted((x, y) -> Integer.compare(x%2, y%2))
      .mapToInt(i -> i)
      .toArray();
    */
  }

  /**
   * Time and Space Complexity: O(N)
   */
  static int[] sortArrayByParity0(int[] nums) {
    int n = nums.length, j = 0;
    int[] res = new int[n];
    for (int i = 0; i < n; ++i) {
      if (nums[i] % 2 == 0) {
        res[j++] = nums[i];
      }
    }

    for (int i = 0; i < n; ++i) {
      if (nums[i] % 2 != 0) {
        res[j++] = nums[i];
      }
    }
    return res; 
  }

  /**
   * Time Complexity: O(N)
   * Space Complexity: O(1)
   */
  static int[] sortArrayByParity1(int[] nums) {
    int i = 0; int j = nums.length-1;
    while(i < j) {
      if (nums[i] % 2 > nums[j] % 2) {
        swap(nums, i, j);
      }
      if (nums[i] % 2 == 0) i++;
      if (nums[j] % 2 == 1) j--;
    }
    return nums;
  }

  private static void swap(int[] arr, int x, int y) {
    int buffer = arr[x];
    arr[x] = arr[y];
    arr[y] = buffer;
  }
}
