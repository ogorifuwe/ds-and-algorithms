public class Solution {
  
  public static Node removeDuplicates0(Node head) {

    if (head == null || head.next == null) return head;

    Node finger = head;
    while (finger != null) {
      Node runner = finger;

      while (runner.next != null) {
        if (runner.next.data == finger.data)
         runner.next = runner.next.next;
        else runner = runner.next;
      }

      finger = finger.next;
    }

    return head;
  }

  public static Node removeDuplicates1(Node head) {
    if (head == null || head.next == null) return head;

    Node finger = head;

    while (finger.next != null) {
      if (finger.data == finger.next.data) {
        finger.next = finger.next.next;
      } else {
        finger = finger.next;
      }
    }

    return head;
  }

  public static Node removeDuplicates2(Node head) {
    if (head == null || head.next == null) return head;

    if (head.data == head.next.data) {
      head.next = head.next.next;
      removeDuplicates2(head);
    } else {
      removeDuplicates2(head.next);
    }
    return head;
  }


}
