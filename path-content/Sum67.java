public class Sum67 {

  public static int sum67(int[] nums) {
    int sum = 0, annul7 = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] == 6) {
        for (int j = i; nums[j] != 7; ++j) {
          System.out.println("nums[j]: " + nums[j]);
          nums[j] = 0;
          System.out.println("j:" + j);
          annul7 = j;
          System.out.println("annul7: " + annul7);
        }
        System.out.println("nums[annul7+1]: " + nums[annul7+1]);
        nums[annul7+1] = 0;
      }
      sum += nums[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 2, 6, 4, 2, 4, 7, 1, 9};
    int sum = sum67(nums);
    System.out.println(sum);
  }
}
