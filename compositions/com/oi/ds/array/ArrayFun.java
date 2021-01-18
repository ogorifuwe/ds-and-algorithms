class ArrayFun {
  
  public static void main(String[] args) {
    
    int[] nums = new int[5];

    System.out.println(nums[1]);
    for (int i = 1; i < nums.length; ++i)
      nums[i] = i;

    int num = nums[4];
    System.out.println(num);
  }
}
