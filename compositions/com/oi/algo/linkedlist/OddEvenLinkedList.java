/**
 * Problem Statement:
 * Given the head of a singly linked list, group all the nodes with
 * odd indices together followed by the nodes with even indices, and
 * return the reordered list.
 *
 * The first node is considered even , and the second node is even,
 * and so on.
 *
 * Note that the relative order inside both even and odd groups
 * should remain as it was in the input.
 *
 * You must solve this problem in O(1) extra space complexity and
 * O(N) time complexity.
 */
public class OddEvenLinkedList {

  public Node oddEvenList(Node head) {
    if (head == null) return null;

    Node even = head.next;
    Node evenHead = even;
    Node odd = head;

    while (even != null && even.next != null) {
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }

    odd.next = evenHead;
    return head;
  }

}
