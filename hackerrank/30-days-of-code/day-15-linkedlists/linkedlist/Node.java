package linkedlist;

public class Node<E> {
  
  int data;
  Node next;

  /* constructors */
  public Node(int data) {
    this.data = data;
    next = null;
  }

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  /* getters and setters */
  public int getData() { return data; }
  public Node<E> getNext() { return next; }
  public void setData(int data) { this.data = data; }
  public void setNext(Node<E> next) { this.next = next; }
}
