/**.
 * A simple node class for an integer implementatio of a 
 * singly linked list.
 * @author oi, 10-31-2018 11:12:21 
 */
package returnkthtolast;

public class Node {
   
    /* instance variables of the Node class */ 
    protected int data;
    protected Node next;

    /* defaul constructor for completeness */
    public Node() {}

    /**. constructor 2
     * @param data int data to be contained by node 
     */
    public Node(int data) { this.data = data; }

    /**. prints the data in Node to console */
    public void printNode() {
        System.out.print("[" + data + "]");
    }
}

