package com.oi.ds.array;

class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {
    // check for edge cases
    if (nums == null) {
      return 0;
    }

    int writePointer = 1;
    for (int readPointer = 1; readPointer < nums.length; ++readPointer) {
      if (nums[readPointer] != nums[readPointer - 1]) {
        nums[writePointer] = nums[readPointer];
        ++writePointer;
      }
    }
    return writePointer;
  }
}
