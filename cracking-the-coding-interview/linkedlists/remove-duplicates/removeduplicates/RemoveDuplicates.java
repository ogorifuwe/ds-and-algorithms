/**.
 * File: RemoveDuplicates.java
 * ---------------------------
 * This class is used to remove duplicate nodes from a
 * singly linked list. Please see README.md for details.
 */
package removeduplicates;
import java.util.HashSet;
import java.lang.NullPointerException;
public class RemoveDuplicates extends DoublyLinkedList {


    /**. Solution 1
     * @pre n is non-null.
     * @post removes duplicate nodes from an unsorted list.
     * @param finger is the node from whence we start traversing.
     */
    public void deleteDuplicates1(Node finger) {
        HashSet<Integer> set = new HashSet<Integer>();
        try {
            Node previous = null;
            
            while (finger != null) {
                if (set.contains(finger.data)) {
                    previous.next = finger.next;
                } else { 
                    set.add(finger.data);
                    previous = finger;
                }
                finger = finger.next;
            }
        } catch (NullPointerException e) { e.printStackTrace(); }
    }

    /**. Solution 2
     * @pre head is non-null.
     * @post removes duplicate nodes from an unsorted list.
     * @param head is the head node of the list.
     */
    public void deleteDuplicates2(Node head) {
        Node finger = head;
        
        while (finger != null) {
            /* remove all future nodes that have the same value */
            Node runner = finger;

            while (runner.next != null) {
                if (runner.next.data == finger.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            finger = finger.next;
        }
    }
}
