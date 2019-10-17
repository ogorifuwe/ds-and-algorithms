public class TwoSum {

  static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; ++i) {
      for (int j = i+1; j < nums.length; ++j) {
        if (nums[j] == target - nums[i]) {
          return new int[] { i, j };
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  static int[] twoSum1(int[] nums, int target) {
    java.util.Map<Integer, Integer> map = 
                  new java.util.HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; ++i) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; ++i) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[] { i, map.get(complement) };
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  static int[] twoSum2(int[] nums, int target) {
    java.util.Map<Integer, Integer> map =
                    new java.util.HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; ++i) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] twoSum = twoSum2(nums, target);
    System.out.println(java.util.Arrays.toString(twoSum));
  }
}
