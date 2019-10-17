class AppMyQueue {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();

    queue.enqueue("hi");
    queue.enqueue("there");
    queue.enqueue("hey hey");
    System.out.println(queue.dequeue());
    System.out.println(queue.peek());
    queue.enqueue("howdy");
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.size());
    System.out.println(queue.dequeue());
    System.out.println(queue.isEmpty());
  }
}
