/**
 * Problem Statement:
 * Given the head of a linked list and an integer val,
 * remove all the nodes of the linked list that has
 * Node.val == val and return the new head. 
 */

class RemoveLinkedListElements {

  /**
   * Time Complexity: O(N)
   * Space Complexity: O(1)
   */
  public Node removeElement(Node head, int val) {
    Node sentinel = new Node();
    sentinel.next = head;

    Node previous = sentinel, current = head;
    while (current != null) {
      if (current.val == val) {
        previous.next = current.next;
      } else {
          previous = current;
      }
      current = current.next;
    }

    return sentinel.next;
  }
}
