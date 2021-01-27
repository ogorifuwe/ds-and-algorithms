package com.oi.ds.linkedlist.dll;

public class Node<T extends Comparable<T>> {

  private T data;
  private Node<T> previousNode;
  private Node<T> nextNode;

  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return this.data;
  }

  public Node<T> getPreviousNode() {
    return this.previousNode;
  }

  public void setPreviousNode(Node<T> previousNode) {
    this.previousNode = previousNode;
  }

  public Node<T> getNextNode() {
    return this.nextNode;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return " data = " + this.data;
  }
} 
