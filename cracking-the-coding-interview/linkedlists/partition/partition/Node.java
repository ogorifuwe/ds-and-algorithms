/**.
 * File: Node.java
 * ---------------
 * A simple node class for an integer singly linked list implementation.
 * @author oi, 11-03-2018; 10:08:59
 */
package partition;

public class Node {

    protected int data;
    protected Node next;
    protected Node prev;
    protected Node last;

    /**. an empty constructor for completeness */
    public Node() {}

    /**. constructor for initializing a new node */
    public Node(int data) { this.data = data; }

    /**. initializes a new node with data and pointer to
     * previous and next nodes */
    public Node(int d, Node n, Node p) {
        data = d;
        setNext(n);
        setPrevious(p);
    }

    public void setNext(Node n) {
        next = n;
        if (this == last) {
            last = n;
        }
        
        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    public void setPrevious(Node p) {
        prev = p;
        if (p != null && p.next != this) {
            p.setNext(this);
        }
    }

    public String printForward() {
        if (next != null) {
            return data + "->" + next.printForward();
        } else {
            return ((Integer) data).toString();
        }
    }

    public Node clone() {
        Node next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        Node head2 = new Node(data, next2, null);
        return head2;
    }
}
