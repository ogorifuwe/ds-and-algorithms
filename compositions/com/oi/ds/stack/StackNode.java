package com.oi.ds.stack;

public class StackNode<T> {

  private Node<T> head;
  private int capacity;

  // O(1)
  public void push(T data) {
    
    Node<T> newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
        Node<T> tmp = head;
        head = newNode;
        head.setNextNode(tmp);
    }
    
    ++capacity;
  }

  // O(1)
  public T pop() {
    T data = head.getData();
    head = head.getNextNode();
    --capacity;
    return data;
  }

  public T peek() {

    T item = head.getData();
    return item;
  }

  // O(1)
  public int size() {
    return capacity;
  }

  // O(1)
  public boolean isEmpty() {
    return capacity == 0;
  }


}
