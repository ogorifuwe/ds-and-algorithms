/**
 * Problem Statement: Design algorithm that can return the maximum item 
 * of a stack in constant time. Use extra sapce O(N) if needed.
 * Hint: Use another stack to track the max item
 */
package com.oi.ds.stack.ps;

import com.oi.ds.stack.Node;

public class MaxItemInStack<T extends Comparable<T>> {

  protected Node<T> head;
  protected T max;
  private int top;


  public T getMaxItem() {
    return max;
  }

  public T pop() {

    T result = null;

    if (isEmpty()) {
      return result;
    } else {
        result = head.getData();
        head = head.getNextNode();
    }

    --top;
    return result;
  }

  public void push(T data) {
  
    Node<T> newNode = new Node<>(data);

    if (isEmpty()) {
      head = newNode;
      max = head.getData();
    } else {
        Node<T> tmp = head;
        head = newNode;
        head.setNextNode(tmp);

        T tmpData = tmp.getData();
        if (data.compareTo(tmpData) == 1) {
          this.max = data;
        }
    }

    ++top;
  }

  public boolean isEmpty() {
    
    boolean value = size() == 0;
    return value;
  }

  public int size() {
    
    return this.top;
  }

}
