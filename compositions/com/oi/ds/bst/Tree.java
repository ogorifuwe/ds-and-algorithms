package com.oi.ds.bst;

public interface Tree<T> {

  public Node<T> getRoot();
  public void insert(T element);
  public void remove(T element);
  public void traverse();
  public T getMin();
  public T getMax();
}
