package com.oi.ds.stack.ps;

import java.util.Stack;

public class MaxItemInStack1<T extends Comparable<T>> {

  private Stack<T> mainStack;
  private Stack<T> maxStack;
  private int count;

  public MaxItemInStack1() {
    this.mainStack = new Stack<>();
    this.maxStack = new Stack<>();
  }

  public void push(T item) {
    
    mainStack.push(item);

    if (mainStack.size() == 1) {
      maxStack.push(item);
      return;
    }

    if (item.compareTo(maxStack.peek()) == 1) {
      maxStack.push(item);
    } else {
        // duplicate current max
        maxStack.push(maxStack.peek());
    }

    ++count;
  }

  public T getMaxItem() {
    T item = maxStack.pop();
    return item;
  }

}
