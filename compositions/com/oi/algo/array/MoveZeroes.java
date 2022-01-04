/**
 * Problem Statement: Given an integer array nums, move all 0's to the end
 * of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {

  public static void main(String[] args) {
    int[] nums0 = new int[]{0, 1, 0, 3, 12};
    int[] nums1 = new int[]{0};

    int[] res0 = moveZeroes0(nums0);
    int[] res1 = moveZeroes0(nums1);
    System.out.println("Result 1: " + Arrays.toString(res0));
    System.out.println("Result 2: " + Arrays.toString(res1));

    int[] res2 = moveZeroes1(nums0);
    int[] res3 = moveZeroes1(nums1);
    System.out.println("Result 3: " + Arrays.toString(res2));
    System.out.println("Result 4: " + Arrays.toString(res3));

    int[] res4 = moveZeroes2(nums0);
    int[] res5 = moveZeroes2(nums1);
    System.out.println("Result: " + Arrays.toString(res4));
    System.out.println("Result: " + Arrays.toString(res5));
  }

  /**
   * Time and Space Complexity: O(N)
   */
  static int[] moveZeroes0(int[] nums) {
    int n = nums.length;

    int[] ans = new int[n];
    int j = 0;
    for (int i = 0; i < n; ++i) {
      if (nums[i] != 0) {
        ans[j] = nums[i];
        ++j;
      }
    }

    for (int i = 0; i < n; ++i) {
      nums[i] = ans[i];
    }
    return nums;
  }

  /**
   * Time Complexity: O(N)
   * Space Complexity: O(1)
   */
  static int[] moveZeroes1(int[] nums) {
    int lastNonZeroFoundAt = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 0) {
        nums[lastNonZeroFoundAt++] = nums[i];
      }
    }

    for (int i = lastNonZeroFoundAt; i < nums.length; ++i) {
      nums[i] = 0;
    }
    return nums;
  }

  /**
   * Time Complexity: O(N)
   * Space Complexity: O(1)
   */
  static int[] moveZeroes2(int[] nums) {
    for (int lastNonZeroFoundAt = 0, curr = 0; curr < nums.length; ++curr) {
      if (nums[curr] != 0) {
        swap(nums[lastNonZeroFoundAt++], nums[curr]);
      }
    }
    return nums;
  }

  private static void swap(int x, int y) {
    int buffer = x;
    x = y;
    y = buffer;
  }
}
