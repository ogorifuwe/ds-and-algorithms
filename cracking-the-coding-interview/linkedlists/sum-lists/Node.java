/**.
 * File: Node.java
 * ---------------
 * A node design for linked list implementation
 */

public class Node {

    protected int data;
    protected Node next;
    protected Node prev;
    protected Node last;

    /**. an empty constructor for completeness */
    public Node() {}

    /**.
     * @post initializes a new node with data
     * @param data integer data to be stored in node 
    */
    public Node(int data) { this.data = data; }

    /**.
     * @post initializes a new node with data, pointer to next,
     * prev nodes
     * @param d integer data to be stored in node
     * @param n reference/pointer to next node
     * @param p reference/pointer to previous node
     */
    public Node(int d, Node n, Node p) {
        data = d;
        setNext(n);
        setPrevious(p);
    }

    /**. @post sets the next node to n */
    public void setNext(Node n) {
        next = n;
        if (this == last) {
            last = n;
        }

        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    /**. sets the previous node to n */
    public void setPrevious(Node p) {
        prev = p;
        if(p != null && p.next != this) {
            p.setNext(this);
        }
    }

    /**. print the nodes in the list from first to last */
    public String printForward() {
        if (next != null) {
            return data + "->" + next.printForward();
        } else {
            return ((Integer) data).toString();
        }
    }

    /**. clones this node */
    public Node clone() {
        Node next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        Node head2 = new Node(data, next2, null);
        return head2;
    }
}
