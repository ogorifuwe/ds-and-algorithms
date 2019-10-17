/**.
 * File: Node.java
 * ---------------
 * A simple node class for integer singly linked list implementation
 * @author oi, 11-02-2018; 20:10:04 
 */
package deletemiddlenode;

public class Node {

    protected int data;
    protected Node next;

    /**. an empty constructor; just for completeness */
    public Node() {}

    /**. used to initialize a new node with data */
    public Node(int data) { this.data = data; }

    /**. used to print the data contained by node to console */
    public void printNode() {
        System.out.print("[ " + data + " ]");
   }
}
