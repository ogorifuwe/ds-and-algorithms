public class HaveThree {

  static boolean haveThree(int[] nums) {
    boolean found = false;
    int count = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 3) {
        found = false;
        System.out.println("if nums[i] != 3 => " + nums[i] != 3
            + "i: " + i + ", nums[i]" + nums[i] + ", found: " + found);
        System.out.println("found is set to: " + found);
      }

      if (nums[i] == 3 && found == true) {
        System.out.println((nums[i] == 3 && found == true));
        return false;
      }

      if (nums[i] == 3 && found == false) {
        System.out.println("if nums[i] == 3 && found = false => "
            + "i: " + i + " nums[i]: " + nums[i] + ", found: " + found);
        found = true;
        System.out.println("found is set to: " + found);
        count++;
      }
    }
    return count == 3;
  }

  public static void main(String[] args) {
    int[] nums = {3, 1, 3, 3};
    boolean found = haveThree(nums);
    System.out.println(found);
  }
}
