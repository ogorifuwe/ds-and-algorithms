package com.oi.ds.map;

public class HashTable {

  private HashItem[] hashTable;

  public HashTable() {
    hashTable = new HashItem[Constants.TABLE_SIZE];
  }

  public void put(int key, int value) {
    
    HashItem newHashItem = new HashItem(key, value);
    int hashArrayIndex = hash(key);

    if (hashTable[hashArrayIndex] == null) {
      hashTable[hashArrayIndex] = newHashItem;
    } else {
        HashItem currHashItem = hashTable[hashArrayIndex];

        while (currHashItem.nextHashItem != null) {
          currHashItem = currHashItem.nextHashItem;
        }

        currHashItem.nextHashItem = newHashItem;
    }
  }

  public int get(int key) {
    
    int arrayIndex = hash(key);

    HashItem hashItem = hashTable[arrayIndex];

    if (hashItem == null) { return -1; }

    while (hashItem != null && hashItem.key != key) {
      hashItem = hashItem.nextHashItem;
    }

    int value = hashItem.value;
    return value;
  }

  private int hash(int key) {
    return key % Constants.TABLE_SIZE;
  }
}
