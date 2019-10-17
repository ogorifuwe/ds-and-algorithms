//package queue;

import java.util.List;
import java.util.LinkedList;

public class MyQueue<E> {
  
  public List<E> queue;

  public MyQueue() {
    this.queue = new LinkedList<E>();
  }

  public int size() {
    return queue.size();
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public void enqueue(E obj) {
    queue.add(obj);
  }

  public E dequeue() {
    return queue.remove(0);
  }

  public E peek() {
    return queue.get(0);
  }
}
