/**
 * Problem Statement:
 * Given the head of a linked list, remove the nth node from
 * the end of the list and return its head.
 */
class RemoveNthNodeFromEndOfList {

  /**
   * Time Complexity: O(N)
   * Space Complexity: O(1)
   */
  public Node removeNthFromEnd1(Node head, int n) {
    int length = 0;
    for (Node finger = head; finger != null; finger = finger.next)
      ++length;

    if (length == n) return head.next;

    int pos = length - n -1;
    Node finger = head;
    for (int i = 0; i <= pos; ++i) {
      finger = finger.next;
    }

    currentNode.next = currentNode.next.next;
    return head;
  }

  /**
   * Time Complexity: O(N)
   * Time Complexity: O(1)
   */
  public Node removeNthFromEnd2(Node head, int n) {
    Node ptrCurrentNode = head;

    for (int i = 0; i < n; ++i) {
      ptrCurrentNode = ptrCurrentNode.next;
    }

    if (ptrCurrentNode == null)
      return head.next;
    
    Node ptrBeforeNodeToRemoved = head;
    while (ptrCurrentNode.next != null) {
      ptrCurrentNode = ptrCurrentNode.next;
      ptrBeforeNodeToRemoved = ptrCurrentNode;
    }

    ptrBeforeNodeToRemoved.next = ptrBeforeNodeToRemoved.next.next;
    return head;
  }
}
