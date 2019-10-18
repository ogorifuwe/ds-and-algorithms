class MaxTriple {

  public int maxTriple(int[] nums) {
    int middle = nums[nums.length/2];
    int initMax = Math.max(nums[0], middle);
    return Math.max(initMax, nums[nums.length-1]);
  }

}
