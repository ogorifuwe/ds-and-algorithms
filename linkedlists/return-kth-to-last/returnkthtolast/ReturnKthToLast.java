/**.
 * File: ReturnKthToLast.java
 * --------------------------
 * This program returns the Kth to last element of a singly linked list.
 * See README.md for details.
 * 10-31-2018; 16:03:06
 */
package returnkthtolast;

public class ReturnKthToLast extends SinglyLinkedList {

    /**. Solution 2A
     * Returns the Kth to last element of a singly linked list.
     * @pre list is not empty
     * @post prints the element at the kth to last position
     * @param head is the head node of the list
     * @param k is the kth position of the list
     * @return idx the index of the kth to last element  
     */
    public int printKthToLast(Node head, int k) {
        if (head == null) return 0;

        int idx = printKthToLast(head.next, k) + 1;
        if (idx == k) {
            System.out.print(k + "th to last node is " + head.data +"\n");
        }
        return idx;
    }

    /**. Solution 2B */
    /* wrapper class for index */
    /*class Index {
        public int value = 0;
    }

    public Node kthToLast(Node head, int k) {
        Index idx = new Index();
        return kthToLast(head, k, idx);
    }

    public Node kthToLast(Node head, int k, Index idx) {
        if (head == null) return null;

        Node node = new kthToLast(head.next, k, idx);
        idx.value = idx.value + 1;
        if (idx.value == k) {
            return head;
        }
        return node;
    }*/


    /**. Solution 3
     * @pre list is not empty
     * @post returns the kth to last node of the list
     * @param head is the head node of the list
     * @param k is the kth position of the list
     * @return the node at the kth position of the list
     */
    public Node xthToLast(Node head, int k) {
        Node p1 = head;
        Node p2 = head;

        /* move p1 k nodes into the list. */
        for (int i = 0; i < k; ++i) {
            if (p1 == null) return null; // out of bounds
            p1 = p1.next;
        }
        /* move them at the same pace. When p1 hits the end, p2 wwill
         * be at the right element. */
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
