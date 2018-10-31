/**.
 * File: Node.java
 * ---------------
 * This class creates a new node for a simple linked list implementation
 */
package removeduplicates;

public class Node {
    
    protected Node next;
    protected Node previous;
    protected int data;

    /* an empty constructor; for completeness */
    public Node() {}

    /**. initializes a new node with data */
    public Node(int data) {
        this.next = null;
        this.previous = null;
        this.data = data;
    }

    /**. prints value of data contained in node */
    public void printNode() {
        System.out.print("[ " + data + " ]");
    }
}
