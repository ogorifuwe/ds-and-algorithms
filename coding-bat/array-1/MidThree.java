class MidThree {

  public int[] midThree(int[] nums) {
    if (nums.length == 3) return nums;
        
    int idx = nums.length / 2 - 1;
    return new int[]{nums[idx], nums[idx+1], nums[idx+2]};
  }
  
}
