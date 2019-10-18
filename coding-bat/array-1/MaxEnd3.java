class MaxEnds3 {

  public int[] maxEnd3(int[] nums) {
    int newVal = nums[0] > nums[nums.length-1] ? nums[0] : nums[nums.length-1];

    return new int[]{newVal, newVal, newVal};
  }
  
}
