/**.
 * File: DoublyLinkedList.java
 * ---------------------------
 * An implementaion of a doubly linked list
 * @author oi; 10-30-2018 18:43:07
 */
package removeduplicates;

public class DoublyLinkedList {

    private Node head;      // pointer to head node
    private Node tail;      // pointer to tail node
    private int count;      // keeps count of number of nodes
    /**. constructor for completeness */
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    /**. getters for head, tail and count respectively */
    public Node getHead() { return head; }
    public Node getTail() { return tail; }
    public int getCount() { return count; }
    /**.
     * Checks whether the list is empty
     * @return Returns true iff first node is null.
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**.
     * Creates a new node with an integer and prepends 
     * it to the list.
     * @pre data is integer
     * @post creates a new node with data and adds it to the
     * first position of the list.
     * @param data is the integer contained by node. 
     */
    public void addHead(int data) {
        Node temp = new Node(data);
        /* if empty, last will point to temp */
        if (head == null) {
            tail = temp;
        } else { 
            temp.next = head;
            head.previous = temp;
        }
        head = temp;
        count++;
    }

    /**.
     * Deletes the head node of list.
     * @pre list is not empty.
     * @post deletes head node of the list and decreases count by 1.
     * @return returns the data contained in head node.
     */
    public int deleteHead() {
        if (head == null) return -1;

        Node temp = head;
        if (head.next == null) { tail = head; }
        head.next.previous = null;
        head = head.next;

        count--;
        return temp.data;
    }

    /**.
     * Creates a new node with an integer and appends it
     * to the list.
     * @pre data is integer.
     * @post creates a new node with data and adds it to tail of list.
     * @param data is the integer contained by node
     */
    public void addTail(int data) {
        Node temp = new Node(data);

        if (tail == null) {
            head = temp;
        }

        tail.next = temp;
        temp.previous = tail;
        tail = temp;

        count++;
    }

    /**.
     * Deletes the tail node of the list.
     * @pre list is not empty.
     * @post deletes tail node and decreases count by 1.
     * @return returns the integer data contained in node.
     */
    public int deleteTail() {
        if (tail == null) return -1;
        
        Node temp = tail;
        if (tail.previous == null) { head = tail; }
        
        tail.previous.next = null;
        tail.previous = tail.previous.next;
        
        count--;
        return temp.data;
    }

    /**.
     * @pre list is not empty
     * @post Returns the number of elements in the list.
     */
    public int size() {
        int count = 1;
        Node finger = head;
        
        while (finger.next != null) {
            count++;
            finger = finger.next;
        }
        return count;
    }

    /**.
     * @post displays the data contained in the list by each node.
     */
    public void printList() {
        System.out.print("Nodes in List: Head --> Tail\n");
        Node finger = head;
        
        while (finger != null) {
            finger.printNode();
            finger = finger.next;
        }
        System.out.print("\n");
    }
}
