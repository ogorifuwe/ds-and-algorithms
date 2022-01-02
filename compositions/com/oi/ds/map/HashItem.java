package com.oi.ds.map;

public class HashItem {

  public int key;
  public int value;
  public HashItem nextHashItem;

  public HashItem() {}
  public HashItem(int key, int value) {
    this.key = key;
    this.value = value;
  }
}
