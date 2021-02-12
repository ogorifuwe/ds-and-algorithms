package com.oi.ds.stack;

public class StackArray<T> {

  private T[] data;
  private static final int SIZE = 10;
  protected int count;


  public StackArray() {

    data = (T[]) new Object[SIZE];
  }

  public StackArray(int size) {
    
    data = (T[]) new Object[size];
  }

  public void push(T item) {

    if (count == data.length) {
      resize(2 * data.length);
    }

    data[++count] = item;
  }

  public T pop() {
    
    if (isEmpty()) { return null; }

    T item = data[count];
    data[count] = null;
    --count;

    if (count > 0 && count == data.length / 4) {
        resize(data.length / 2);
    }

    return item;
  }

  public T peek() {

    return data[count]; 
  }

  public int size() {

    return count;
  }
 
  public boolean isEmpty() {

    return count == 0;
  }

  private void resize(int capacity) {
    
    System.out.println("Resizing Stack Array");

    T[] dataCopy = (T[]) new Object[capacity];

    for (int i = 0; i < data.length; ++i) {
      dataCopy[i] = data[i];
    }

    data = dataCopy;
  }
}
