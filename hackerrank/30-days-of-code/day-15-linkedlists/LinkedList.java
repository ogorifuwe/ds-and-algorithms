package linkedlist;

public class LinkedList<E> {

  /* properties */
  Node<E> head;
  int count;

  /* constructor */
  public LinkedList() {
    head = null;
    count = 0;
  }

  public LinkedList(Node<E> head) {
    this.head = head;
    count = 1;
  }

  /* methods */

  /* adds a new node to the list */
  public void add(int data) {
    Node n = new Node(data);

    if (head == null) {
      head = n;
      count = 1;
    }

    Node<E> finger = head;
    while (finger.getNext() != null) {
      finger = finger.getNext();
    }
    finger.setNext(n);
    n.next = null;
    ++count;
  }

  /* get */
  public int get(int index) {
    if (index <= 0) throw new IllegalArgumentException();

    int idx = 1;
    Node<E> finger = head;
    while (idx < index) {
      finger = finger.getNext();
      ++idx;
    }
    return finger.getData();
  }

  /* size */
  public int size() {
    return count;
  }

  /* isEmpty */
  public boolean isEmpty() {
    return head == null;
  }

  /* remove */
  public void remove() {
    Node<E> finger = head;

    while (finger.getNext().getNext() != null) {
      finger = finger.getNext();
    }
    finger.setNext(null);
    --count;
  }
}
