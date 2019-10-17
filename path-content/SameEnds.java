public class SameEnds {

  static boolean sameEnds(int[] nums, int len) {
    boolean result = false;
    int i = 0, j = nums.length-len;

    while (i <  len) {
      if (nums[i] == nums[j]) {
        result = true;
      }
      i++;
      j--;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {5, 6, 45, 99, 13, 5, 6};
    int len = 2;
    boolean outcome = sameEnds(nums, len);
    System.out.println(outcome);
  }
}
