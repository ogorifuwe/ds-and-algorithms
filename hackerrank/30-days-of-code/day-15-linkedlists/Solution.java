class Solution {
  
  static Node insert(Node head, int data) {
    Node n = new Node(data);
    Node finger = head;
    if (finger == null)  return finger = n;
    else {
      while (finger.next != null) {
        finger = finger.next;
      }
      finger.next = n;
      finger = head;
    }
    return finger;
  }

  static Node insert(Node head, int data) {
    if (head == null) {
      return new Node(data);
    }

    else if (head.next == null) {
      head.next = new Node(data);
    } else {
      insert(head.next, data);
    }

    return head;
  }
}
