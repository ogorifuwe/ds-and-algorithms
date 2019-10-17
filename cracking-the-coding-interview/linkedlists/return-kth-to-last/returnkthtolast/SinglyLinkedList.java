/**.
 * File: SinglyLinkedList.java
 * ---------------------------
 * A simple implementation of an integer singly linked list. 
 * @author oi, 10-31-2018 11:48:12
 */
package returnkthtolast;

public class SinglyLinkedList {

    private Node head;
    private int elementCount;

    /**. getter for the head node */
    public Node getHead() { return head; }

    /**.
     * Checks if the list is empty
     * @return returns true iff the list is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**.
     * Adds node with int data to the head of the list
     * @post adds node with int data to the head of the list
     * and increments count by one.
     */
    public void addHead(int data) {
        Node temp = new Node(data);
        
        temp.next = head;
        head = temp;    
    }

    /**.
     * Deletes head node from the list
     * @pre list is not empty
     * @post deletes head node and decrements elements count by 1
     * @return returns data in node.
     */
    public int deleteHead() {
        if (head == null) return -1;

        if (head.next == null) { head = null; }
        Node temp = head;
        head = head.next;

        elementCount--;
        return temp.data;
    }

    /**.
     * Adds node to the tail of the list
     * @pre list is not empty
     * @post adds node to the 
     */
    public void addTail(int data) {
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        Node tail = new Node(data);
        currNode.next = tail;
        elementCount++;
    }

    /**.
     * Deletes the tail of the list
     * @pre list is not empty
     * @post deletes tail of the list and decrements element count by 1
     * @return returns the data contained in node.
     */
    public int deleteTail() {
        Node currNode = head;
        Node previous = null;

        while (currNode.next != null) {
            previous = currNode;
            currNode = currNode.next;
        }
        previous.next = null;

        elementCount--;
        return currNode.data;
    }

    /**.
     * Prints the nodes of the list starting at from the head to
     * tail to console
     */
    public void printList() {
        System.out.print("List Nodes: Head --> Tail\n");

        Node currNode = head;
        while (currNode != null) {
            currNode.printNode();
            currNode = currNode.next;
        }
        System.out.print("\n");
    }
}
