/**
 * Problem Statemment:
 * Given the head of a singly linked list, return true if is a palindrome.
 *
 * Example 1:
 * Input: head = [1, 2, 2, 1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1, 2]
 * Output: false
 */
import java.util.List;
import java.util.ArrayList;

class PalindromeLinkedList {

  /**
   * Time Complexity: O(2n) -> O(n)
   * Space Complexity: O(n)
   */
  public boolean isPalindrome1(Node head) {
    boolean result = true;
    List<Integer> list = new ArrayList<>();

    for (Node curr = head; curr != null; curr = curr.next)
      list.add(curr.val);

    for (int i = 0; i < list.size(); ++i) {
      if (list.get(i) != list.get(list.size()-i)) {
        result = false;
        break;
      }
    }
    return result;
  }

  /**
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public boolean isPalindrome2(Node head) {
    Node frontPointer = head;
    return recursivelyCheck(head, frontPointer);
  }

  private boolean recursivelyCheck(Node currentNode, Node frontPointer) {
    if (currentNode != null) {
      if (!recursivelyCheck(currentNode.next)) return false;
      if (currentNode.val != frontPointer.val) return false;
      frontPointer = frontPointer.next;
    }
    return true;
  }

  /**
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public boolean isPalindrome3(Node head) {
    if (head == null) return false;

    Node firstHalfEnd = endOfFirstHalf(head);
    Node secondHalfStart = reverseList(firstHalfEnd.next);

    Node p1 = head;
    Node p2 = secondHalfStart;
    boolean result = true;
    while (result && p2 != null) {
      if (p1.val != p2.val) {
        result = false;
        break;
      }
      p1 = p1.next;
      p2 = p2.next;
    }

    firstHalfEnd.next = reverseList(secondHalfStart);
    return result;
  }

  private Node reverseList(Node head) {
    Node previous = null;
    Node current = head;
    while (current != null) {
      Node buffer = current.next;
      current.next = previous;
      previous = current;
      current = buffer;
    }
    return previous;
  }

  private Node endOfFirstHalf(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }


}
