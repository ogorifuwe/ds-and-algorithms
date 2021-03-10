package com.oi.ds.bst;

public class Node<T> {

  private T element;
  private Node<T> leftChild;
  private Node<T> rightChild;
  private Node<T> parentNode;

  public Node(T element, Node<T> parentNode) {
    this.element = element;
    this.parentNode = parentNode;
  }

  @Override
  public String toString() {
    return "[ " + element + " ]";
  }
}
