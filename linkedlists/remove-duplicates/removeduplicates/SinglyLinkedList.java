/**.
 * File: SinglyLinkedList.java
 * ---------------------------
 * A simple int implementation of singlyLinkedList
 * @author oi, 10-20-2018  16:45
 */
package removeduplicates;

public class SinglyLinkedList {

    protected Node head;
    
    /**. An empty constructor for completeness */
    public SinglyLinkedList() {}

    /**.
     * Checks if a SinglyLinkedList is empty
     * @return Returns true iff the list has no elements
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**.
     * Inserts data into the first node of the list.
     * @param data Int data to be inserted into first/head node of list.
     */
    public Node addHead(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;

        return head;
    }

    /**.
     * @post Adds data to the end of the list.
     * @param data Int data to be added at the end of the list.
     */
    public void addTail(int data) {
        Node temp = new Node(data);
        if (head != null) {
        
            Node finger = head;
            while (finger.next != null) {
                finger = finger.next;
            }
            finger.next = temp;
        } else { head = temp; }
    }

    /**.
     * @post deletes the first node in the list.
     */
    public int deleteHead() {
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    /**.
     * @pre list is not empty
     * @post deletes the last node in the list.
     */
    public int deleteTail() {
        Node finger = head;
        Node previous = finger;

        while (finger.next != null) {
            previous = finger;
            finger = finger.next;
        }
        
        /* has one element */
        if (previous == null) {
            head = null;
        }
        previous.next = null;
        
        return finger.data;
    }

    /**.
     * @post returns the number of elements in the list.
     */
    public int size() {
        int count = 0;
        Node finger = head;
        
        while (finger != null) {
             count++;
            finger = finger.next;
        }
        return count;
    }

    /**.
     * Prints the elements of the list, from head to tail.
     */
    public void printList() {
        System.out.print("\n");
        System.out.print("LinkedListNodes: Head --> Tail"+"\n");
        Node finger = head;
        while (finger != null) {
            finger.printNode();
            finger = finger.next;
        }
        System.out.print("\n");
    }
}
