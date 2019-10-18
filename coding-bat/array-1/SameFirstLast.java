class SameFirstLast {

  public boolean sameFirstLast(int[] nums) {
    if (nums.length < 1) return false;
        
    int firstElement = nums[0];
    int lastElement = nums[nums.length-1];
    return (firstElement == lastElement);
  }

}
