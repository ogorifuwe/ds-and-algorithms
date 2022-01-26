/**
 * Problem Statement: Given the head of a linked list, return the node where the
 * cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be
 * reached again by continously following the next pointer. Internally, pos is used
 * to denote the index of the node that tail's next pointer is connected to (0-indexed).
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 */
Node {
  int value;
  Node next;

  Node(int value) { this.value = value; }
}

class LinkedListCycleII {

  public Node detectCycle1(Node head) {
    if (head == null) return null;

    java.util.Set<Node> seenNodes = new java.util.HashSet<>();
    for (Node finger = head; finger.next != null; finger = finger.next) {
      if (seeNodes.contains(finger))
        return finger;
      seenNodes.add(finger);
    }
    return null;
  }

  public Node detectCycle2(Node head) {
    if (head == null) return null;

    Node intersect = getIntersect(head);
    if (intersect == null)
      return null;

    Node ptr1 = head;
    Node ptr2 = intersect;
    
    while (ptr1 != ptr2) {
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
    }

    return ptr1;
  }

  private Node getIntersect(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast)
        return slow;
    }

    return null;
  }
}
