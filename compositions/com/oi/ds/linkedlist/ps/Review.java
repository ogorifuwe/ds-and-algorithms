public class Review {

  static Node<T> findMiddleNode(LinkedList<T> list) {

    Node<T> slowFinger = list.root;
    Node<T> fastFinger = list.root;

    while (fastFinger.next != null && fastFinger.next.next != null) {
      slowFinger = slowFinger.next;
      fastFinger = fastFinger.next.next;
    }

    return slowFinger;
  }

  static LinkedList<T> reverseLinkedList(LinkedList<T> list) {
    
    Node<T> curr = list.root;
    Node<T> prev = null;
    Node<T> next = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    list.root = prev;
    return list;
  }
}
