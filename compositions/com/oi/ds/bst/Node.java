package com.oi.ds.bst;

public class Node<T> {

  public T element;
  public Node<T> leftChild;
  public Node<T> rightChild;
  public Node<T> parent;

  public Node(T element, Node<T> parent) {
    this.element = element;
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "[ " + element + " ]";
  }
}
