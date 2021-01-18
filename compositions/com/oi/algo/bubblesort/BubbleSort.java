package com.oi.algo.bubblesort;

import java.util.Random;

class BubbleSort {
  
  public static void main(String[] args) {

    Random random = new Random();

    int[] arrNums = new int[20000];
    for (int i = 0; i < 20000; ++i) { 
      arrNums[i] = random.nextInt(100);
    }
    
    long startTime = System.currentTimeMillis();

    int tmp = 0;
    for (int i = 0; i < arrNums.length; ++i) {
      for (int j = 1; j < (arrNums.length - i); ++j) {
        if (arrNums[j-1] > arrNums[j]) {
          tmp = arrNums[j-1];
          arrNums[j-1] = arrNums[j];
          arrNums[j] = tmp;
        }
      }
    }

    long finishTime = System.currentTimeMillis();
    
    System.out.println(java.util.Arrays.toString(arrNums));
    System.out.println(finishTime - startTime);
  }
}
