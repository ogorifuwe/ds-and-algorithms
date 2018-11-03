/**.
 * File: SinglyLinkedLst.java
 * --------------------------
 * A simple implementation of an integer singly linked list.
 * @author oi, 11-02-2018; 20:05:41 
 */
package deletemiddlenode;

public class SinglyLinkedList {
    
    private Node head;
    private int nodeCount;

    /**. used to retrieve the head node */
    public Node getHead() { return head; }
    
    /**. used to get the number of nodes in the list */
    public int getNodeCount() { return nodeCount; } 
    
    /**. used to add a node to head of list */
    public void addHead(int data) {
        Node n = new Node(data);

        n.next = head;
        head = n;
        
        nodeCount++;
    }

    /**. used to delete head node from the list */
    public int deleteHead() {
        Node temp = head;

        head = head.next;
        
        nodeCount--;
        return temp.data;
    }

    /**. 
     * used to add node to the tail of the list
     * assumes list is not empty
     */
    public void addTail(int data) {
        Node currNode = head;
        
        if (currNode == null) {
            addHead(data); 
        } else {
        
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            Node n = new Node(data);
            currNode.next = n;
        }
        nodeCount++;
    }

    /**. used to delete node from the tail of the list */
    public int deleteTail() {
        Node currNode = head;
        Node previous = null;

        while (currNode.next != null) {
            previous = currNode;
            currNode = currNode.next;
        }

        previous.next = null;
        
        nodeCount--;
        return currNode.data;
    }

    /**. used to get a node in the list using a key */
    public Node getNode(int key) {
        Node currNode = head;
        
        if (currNode == null) return null;
        
        while (currNode != null) {
            if (currNode.data == key) {
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }

    /**. used to print list from head to tail */
    public void printList() {
        System.out.print("\n");
        Node currNode = head;

        while (currNode != null) {
            currNode.printNode();
            currNode = currNode.next;
        }
        System.out.print("\n");
    }
}
