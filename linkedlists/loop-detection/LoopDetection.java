/**.
 * File: LoopDetecton.java
 * -----------------------
 * This class is used to detect if there's a loop in a circular linked list.
 */
public class LoopDetection {

    static Node FindBeginning(Node head) {
        Node slow = head;
        Node fast = head;

        /* Find meeting point. This will be LOOP_SIZE - k steps
         * into the linked list. */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // found collision
                break;
            }
        }

        /* error check - no meeting point, and therefore no loop */
        if (fast == null || fast.next == null) {
            return null;
        }

        /* move slow to head. keep fast at meeting point. Both are
         * k steps from the loop start. If they move at the same pace,
         * they will meet at the loop start */
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        /* both now point to the start of the loop */
        return fast;
    }

    public static void main(String[] args) {
        int list_length = 100;
        int k = 10;

        // create linked list
        Node[] nodes = new Node[list_length];
        for (int i = 0; i < list_length; ++i) {
            nodes[i] = new Node(i, null, i > 0 ? nodes[i-1] : null);
        }

        // create loop
        nodes[list_length-1].next = nodes[list_length-k];

        Node loop = FindBeginning(nodes[0]);
        if (loop == null) {
            System.out.print("No Cycle."+"\n");
        } else {
            System.out.print(loop.data+"\n");
        }
    }
}
