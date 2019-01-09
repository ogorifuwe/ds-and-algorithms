/**.
 * File: SinglyLinkedList.java
 * ---------------------------
 * A simple integer implementation of a singly linked list.
 * @author oi, 11-03-2018; 10:21:11
 */
package partition;

public class SinglyLinkedList {
    
    private Node head;
    private int elementCount;

    /**. gets the head of the list */
    public Node getHead() { return head; }
   
    /**. retrieves the number of nodes in the list */
    public int size() { return elementCount; }

    /**. returns true if list is empty */
    public boolean isEmpty() {
        return (head == null);
    }

    /**. adds node with data to the beginning of the list */
    public void addHead(int data) {
        Node n = new Node1(data);
        
        n.next = head;
        head = n;
        elementCount++;
    }

    /**. deletes node from the beginning of the list */
    public int deleteHead() {
        Node temp = head;
        head = head.next;
        
        elementCount--;
        return temp.data;
    }

    /**. adds node the end of the list
     * @pre list is not empty */
    public void addTail(int data) {
        Node n = new Node1(data);
        /* list has only head node */
        if (head.next == null) {
            head.next = n;
        } else {

            Node currNode = head;
            while(currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = n;
        }
        elementCount++;
    }

    /**. deletes node at the end of the list */
    public int deleteTail() {
        Node currNode = head;
        Node prevNode = null;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;

        elementCount--;
        return currNode.data;
    }
    
    /**. retrieves a node from the list using its data as key */
    public Node1 getNode(int key) {
        Node currNode = head;
        while(currNode != null) {
            if (currNode.data == key) return currNode;
            currNode = currNode.next;
        }
        return null;
    }

    /**. prints the list; starting from head to tail */
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
