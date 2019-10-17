public class CenteredAverage {

  public static int centeredAverage(int[] nums) {
    
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    int sum = 0, len = nums.length;

    for (int i = 0; i < len; ++i) {
      if (nums[i] < min) min = nums[i];
      System.out.println("min: " + min);
      if (nums[i] > max) max = nums[i];
      System.out.println("max: " + max);

      sum += nums[i];
    }
    System.out.println("sum: " + sum);
    
    sum = sum - (min+ max);
    System.out.println("sum: " + sum);
    System.out.println("len: " + len);
    int average = sum / (len-2);
    return average;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 100};
    int average = centeredAverage(nums);
    System.out.println(average); 
  }
}
