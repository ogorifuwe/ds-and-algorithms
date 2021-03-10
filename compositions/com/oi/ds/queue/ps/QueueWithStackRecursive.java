/**
 * Problem statement: Implement a queue using a single stack.
 * Hint: Use recursion to dequeue the stack.
 */
package com.oi.ds.queue.ps;

import java.util.Stack;

public class QueueWithStackRecursive<T> {

  private Stack<T> queueStack;

  public QueueWithStackRecursive() {
    this.queueStack = new Stack();
  }

  public void enqueue(T element) {
    queueStack.push(element);
  }

  public T dequeue() {
  
    if (queueStack.size() == 1) {
      return queueStack.pop();
    }

    T element = queueStack.pop();

    T lastElement = dequeue();

    enqueue(element);

    return lastElement;
  }

}
