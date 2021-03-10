package com.oi.ds.queue;

public class Queue<T extends Comparable<T>> {

  private Node<T> firstNode;
  private Node<T> lastNode;
  private int count;


  public void enqueue(T data) {
    
    Node<T> oldLastNode = this.lastNode;
    this.lastNode = new Node<>(data);
    lastNode.setNextNode(null);

    if (isEmpty()) {
      this.firstNode = this.lastNode;
    } else {
        oldLastNode.setNextNode(this.lastNode);
    } 

    ++count;
  }

  public T dequeue() {

    T result = null;

    if (isEmpty()) {
      lastNode = null;
    } else {
        result = this.firstNode.getData();
        Node<T> tmp = this.firstNode;
        this.firstNode = this.firstNode.getNextNode();
        tmp = null;
    }

    --count;
    return result;

  }

  public boolean isEmpty() {

    return firstNode == null;
  }

  public int size() {

    return count;
  }
}
