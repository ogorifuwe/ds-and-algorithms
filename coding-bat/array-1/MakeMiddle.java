class MakeMiddle {

  public int[] makeMiddle(int[] nums) {
    if (nums.length == 2) return nums;
    int idx = nums.length / 2 - 1;
    return new int[]{nums[idx], nums[idx+1]};
  }

}
