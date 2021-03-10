package com.oi.ds.queue.ps;

public class AppQueueWithStack {

  public static void main(String[] args) {
    QueueWithStackRecursive<Integer> queue = new QueueWithStackRecursive<>();
    queue.enqueue(10);
    queue.enqueue(100);
    queue.enqueue(1000);

    int count = 0;
    while (count < 3) {
      System.out.println(queue.dequeue());
      ++count;
    }
  }
}
