/**
 * Problem Statement:
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all integers in the range [1, n] that do not appear
 * in nums.
 */
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

class FindDisappearedNumbers {
  public static void main(String[] args) {
    int[] nums0 = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> resList = findDisappearedNumbers(nums0);
    Integer[] resArr = resList.toArray(new Integer[resList.size()]);
    System.out.println("Result: " + Arrays.toString(resArr));
  }

  static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> res = new LinkedList<>();
    Set<Integer> numsSet = new HashSet<Integer>();
    
    for (int num : nums)
      numsSet.add(num);

    for (int i = 1; i <= nums.length; ++i) {
      if (!numsSet.contains(i)) res.add(i);
    }

    return res;
  }
}
