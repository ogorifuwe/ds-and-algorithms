package com.oi.algo.linearsrc;

public class App {
  
   public static void main(String[] args) {
    
     int[] nums = { 1, 4, 5, 6, 10 };

     System.out.println(nums[2]); // O(1) we know the index

     for (int i = 0; i < nums.length; ++i) {
      if (nums[i] == 10)
        System.out.println("Index of the item we are looking for is: " + i);
     }
   }
 }
