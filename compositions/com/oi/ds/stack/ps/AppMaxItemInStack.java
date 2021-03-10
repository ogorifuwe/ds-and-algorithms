package com.oi.ds.stack.ps;

public class AppMaxItemInStack {

  public static void main(String[] args) {

    MaxItemInStack1<Integer> miis = new MaxItemInStack1<>();
    miis.push(1);
    miis.push(10);
    miis.push(100);

    //System.out.println(miis.size());
    System.out.println(miis.getMaxItem());
  }
}

