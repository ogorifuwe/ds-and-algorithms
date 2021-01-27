package com.oi.ds.linkedlist.dll;

public interface List<T> {

  public void insertHead(T data);
  
  public void insertTail(T data);

  public void remove(T data);

  public void removeHead();

  public void removeTail();

  public void traverseForward();

  public void traverseBackward();

  public int size();
}
