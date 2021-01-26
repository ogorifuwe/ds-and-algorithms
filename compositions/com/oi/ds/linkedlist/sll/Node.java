package com.oi.ds.linkedlist.sll;


public class Node<T extends Comparable<T>> {

  private T data; // data to be stored in node
  private Node<T> nextNode; // reference to the next node in list

  public Node(T data) { 
    this.data = data;
  }

  public T getData() { 
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node<T> getNextNode() {
    return this.nextNode;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return "[" + data + "] -> ";
  }
}
