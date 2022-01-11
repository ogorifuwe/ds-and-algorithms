/**
 * Problem Statement:
 * Given an integer array nums, return the third distinct maximum number in this
 * array. If the third maximum does not exist, return the maximum number.
 */
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

class ThirdMaximumNumber {

  public static void main(String[] args) {
    int[] nums0 = new int[]{3, 2, 1};
    int[] nums1 = new int[]{12, 3, 8, 9, 7, 4, 1};
    int res0 = thirdMaximumNumber0(nums0);
    int res1 = thirdMaximumNumber0(nums1);
    int res2 = thirdMaximumNumber1(nums0);
    int res3 = thirdMaximumNumber1(nums1);
    System.out.printf("Result: %d\n", res0);
    System.out.printf("Result: %d\n", res1);
    System.out.printf("Result: %d\n", res2);
    System.out.printf("Result: %d\n", res3);
  }

  static int thirdMaximumNumber0(int[] nums) {
    Set<Integer> numsSet = new HashSet<Integer>();
    for (int num : nums)
        numsSet.add(num);
    
    int max = Collections.max(numsSet);
    if (numsSet.size() < 3)
      return max;
    
    numsSet.remove(max);
    int secondMax = Collections.max(numsSet);
    numsSet.remove(secondMax);

    return Collections.max(numsSet);
  }

  static int thirdMaximumNumber1(int[] nums) {
    Set<Integer> maxSet = new HashSet<>();

    for (int num : nums) {
      maxSet.add(num);
      if (maxSet.size() > 3) {
        int min = Collections.min(maxSet);
        maxSet.remove(min);
      }
    }

    if (maxSet.size() == 3)
      return Collections.min(maxSet);

    return Collections.max(maxSet);
  }
}
