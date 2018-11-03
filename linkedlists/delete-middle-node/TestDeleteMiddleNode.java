/**.
 * File: TestDeleteMiddleNode.java
 * -------------------------------
 * This program is used to test the implementation of
 * deleting a middle node. Please see README.md for
 * details.
 *
 * --------------------------------------------------
 * | Compilation: javac TestDeleteMiddleNode.java   |
 * | Execution:   java TestDeleteMiddleNode         |
 * --------------------------------------------------
 * @author oi, 11-02-2018 20:56:53 
 */
import deletemiddlenode.*;

public class TestDeleteMiddleNode {
   
    public static void main(String[] args) { 
        DeleteMiddleNode list = new DeleteMiddleNode();

        for (int i = 0; i < 10; ++i) {
            list.addTail(i);
        }

        list.printList();
        
        Node n = list.getNode(5);

        /* testing delete middle node */
        list.deleteNode(n);
        list.printList();
    }
}
