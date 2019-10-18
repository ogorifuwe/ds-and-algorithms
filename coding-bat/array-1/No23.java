class No23 {

  public boolean no23(int[] nums) {
    int first = nums[0];
    int last = nums[nums.length-1];
    return(!(first == 2 || first == 3 || last == 2 || last == 3));
  }

}
