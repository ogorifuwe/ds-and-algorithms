/**
 * Problem Statement: Implement a queue using a stack.
 */
package com.oi.ds.queue.ps;

import java.util.Stack;

public class QueueWithStack<T> {

  private Stack<T> enqueueStack;
  private Stack<T> dequeueStack;

  public QueueWithStack() {
    this.enqueueStack = new Stack<>();
    this.dequeueStack = new Stack<>();
  }

  public void enqueue(T element) {
    
    this.enqueueStack.push(element);
  }

  public T dequeue() {
    
    if (enqueueStack.empty() && dequeueStack.empty()) {
      throw new RuntimeException("Stacks are empty...");
    }

    if (dequeueStack.empty()) {
      while (!enqueueStack.empty()) {
        T element = enqueueStack.pop();
        dequeueStack.push(element);
      }
    }

    T result = dequeueStack.pop();
    return result;
  }

}
