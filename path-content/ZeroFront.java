import java.util.Arrays;

public class ZeroFront {

  static int[] zeroFront(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] == 0) {
        System.out.println("count: " + count + " nums[count]: " + nums[count]);
        System.out.println("i: " + i + " nums[i]: " + nums[i]);
        nums[i] = nums[count];
        nums[count] = 0;
        count++;
        System.out.println("count incremented to: " + count);
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] nums = {1, 0, 0, 1};
    int[] result = zeroFront(nums);
    System.out.println(Arrays.toString(result));
  }
}
