/**
 * Problem Statement: Given head, the head of a linked list, determine if the
 * linked list has a cycle in it.
 *
 * There is a circle in a linked list if there is some node in the list that
 * can be reached again by continously following the next pointer. Internally,
 * pos is used to denote the index of the node that tail's next pointer is
 * connected to. Note that pos is not passes as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
Node {
  int value;
  Node next;
  Node(int value) { this.value = value; }
}

class LinkedListCycle {

  public boolean hasCycle(Node head) {
    if (head == null) return false;

    java.util.Set<Node> seenNodes = new java.util.HashSet<>();
    for (Node finger = head; head.next != null; head = head.next) {
      if (seenNodes.contains(finger)) return true;
      seenNodes.add(finger);
    }
    return false;
  }

  public boolean hasCycle(Node head) {
    if (head == null) return false;

    Node slow = head;
    Node fast = head.next;

    while (slow != fast) {
      if (fast == null || fast.next == null)
        return false;
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }
}
