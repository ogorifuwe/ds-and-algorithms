/**
 * Problem Statement: A school is trying to take an annual photo of all the students.
 * The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array 'expected' where 'expected[i]' is
 * the expected height of the ith student in line.
 *
 * You are given an integer array 'heights' representing the current order that the students
 * are standing in. Each 'heights[i]' is the height of the ith student in line (0-indexed).
 *
 * Return the number of indices where heights[i] != expected[i].
 */
import java.util.Arrays;

class HeightChecker {

  public static void main(String[] args) {
    int[] heights0 = new int[]{1, 1, 4, 2, 1, 3};
    int[] heights1 = new int[]{5, 1, 2, 3, 4};
    int[] heights2 = new int[]{1, 2, 3, 4, 5};
    int res0 = heightChecker1(heights0);
    System.out.println("Result 0: " + res0);
  }

  /**
   * Time Complexity: O(NLogN)
   * Space Complexity: O(N)
   */
  static int heightChecker0(int[] heights) {
    int[] expected = Arrays.copyOf(heights, heights.length);  
    Arrays.sort(expected);
    int res = 0;
    
    for (int i = 0; i < heights.length; ++i) {
      if (heights[i] != expected[i]) ++res;
    }
    return res;
  }
}
