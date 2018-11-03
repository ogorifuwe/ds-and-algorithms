/**.
 * File: DeleteMiddleNode.java
 * ---------------------------
 * This class deletes a node in the middle of a singly linked list
 * given access to only that node. See README.md for details.
 * @author oi, 11-02-2018 21:25:21
 */
package deletemiddlenode;

public class DeleteMiddleNode extends SinglyLinkedList {

    /**. used to delete the a node in the middle of a
     * singly linked list, given access to only that node */
    public boolean deleteNode(Node n) {
        /* head is null or only one element in the list */
        if (n == null || n.next == null) return false;
        
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }
}
