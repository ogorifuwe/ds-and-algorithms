/**
 * Problem Statement: Given the heads of two singly linked lists headA and headB,
 * return the node at which the two lists interact. If the two lists have no
 * intersection at all, return null.
 */
class IntersectionOfTwoLinkedLists {

  public Node getIntersectionNode1(Node headA, Node headB) {
    Node finger = headA
    while (finger != null) {
      Node current = headB;
      while(current != null) {
        if (finger == current) return finger;
        current = current.next;
      }
      finger = finger.next;
    }
    return null;
  }

  public Node getIntersectionNode2(Node headA, Node head2) {
    Set<Node> seenNodes = new HashSet<>();
    for (Node finger = headA; finger != null; finger = finger.next)
      seenNodes.add(finger);

    for (Node finger = headB; finger != null; finger = finger.next) {
      if (seenNodes.contains(finger))
        return finger;
    }
    return null;
  }

  public Node getIntersectionNode3(Node headA, Node headB) {
    Node ptrA = headA;
    Node ptrB = headB;

    while (ptrA != ptrB) {
      ptrA = ptrA == null ? headB : ptrA.next;
      ptrB = ptrB == null ? headA : ptrB.next;
    }
    return ptrA;
  }
}
