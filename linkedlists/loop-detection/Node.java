/**.
 * File: Node.java
 * ---------------
 * A a simple node class for implementing a circular linked list
 */
public class Node {

    protected int data;
    protected Node next;
    protected Node prev;
    protected Node last;

    public Node() {}

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node n, Node p) {
        this.data = data;
        setNext(n);
        setPrevious(p);
    }

    public void setNext(Node n) {
        next = n;
        if (next == last) {
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
