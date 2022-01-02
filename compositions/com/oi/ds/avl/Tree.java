package com.oi.ds.avl;

public interface Tree<T> {

  public void insert(T data);
  public void delete(T data);
  public void traverse();
  public T getMin();
  public T getMax();
  public T getKthNode();

}
