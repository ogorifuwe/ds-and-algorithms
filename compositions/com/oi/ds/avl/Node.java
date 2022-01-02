package com.oi.ds.avl;

public class Node<T> {

  public T data;
  public Node<T> parent;
  public Node<T> left;
  public Node<T> right;

  public Node() {}

  public Node(T data, Node<T> parent) {
    this.data = data;
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "[ " + data + " ]";
  }
}
