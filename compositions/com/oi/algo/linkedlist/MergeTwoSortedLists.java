/**
 * Problem Statement:
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by
 * splicing together the nodes of the first two lists. Return the head
 * of the merged linked list.
 *
 * Example:
 * Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
 * Ouput: [1, 1, 2, 3, 4, 4]
 */
class MergeTwoSortedLists {

  /**
   * Time Complexity: O(n + m)
   * Space Complexity: O(n)
   */
  public Node mergeTwoLists(Node l1, Node l2) {
    if (l1 == null) return l2;
    else if (l2 == null) return l1;
    else if (l1.value < l2.value) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }

  /**
   * Time Complexity: O(n + m)
   * Space Complexity: O(1)
   */
  public Node mergeTwoLists(Node l1, Node l2) {
    Node prehead = new Node(-1);
    Node prev = prehead;
    while (l1 != null && l2 != null) {
      if (l1.value < l2.value) {
        prev.next  = l1;
        l1 = l1.next;
      } else {
        prev.next  = l2;
        l2 = l2.next;
      }
      prev = prev.next;
    }
    prev.next = l1 == null ? l2 : l1;
    return prehead.next;
  }
}
