/**
 * Problem Statement: Given the head of a singly linked list, reverse the list,
 * and return the reversed list.
 */

class ReverseLinkedList {
  
  public Node reverse(Node head) {
    Node previousNode = null;
    Node currentNode = head;

    while (currentNode != null) {
      Node buffer  = currentNode.next;
      currentNode.next = previousNode;
      previousNode = currentNode;
      currentNode = buffer ;
    }

    return head;
  }
}
