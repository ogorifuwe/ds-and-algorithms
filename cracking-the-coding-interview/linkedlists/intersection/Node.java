/**.
 * File: Node.java
 * ---------------
 * A simple node class for linked list implementation
 */
public class Node {

    protected int data;
    protected Node next;
    protected Node prev;
    protected Node last;

    public Node() {}

    public Node(int d) { data = d; }

    public Node(int d, Node n, Node p) {
        data = d;
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
            return data + "->" + next.data.printForward();
        } else {
            return ((Interger) data).toString();
        }
    }

    public Node clone() {
        Node next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        Node n = new Node(data, next2, null);
        return head2;
    }
}
