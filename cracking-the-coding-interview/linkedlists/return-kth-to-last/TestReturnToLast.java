/**.
 * File: TestReturnToLast.java
 * ---------------------------
 * This program is used to test ReturnToLast.java.
 * Please see ReturnToLast.java for details.
 * ----------------------------------------------
 * | Compilation:   javac TestReturnToLast.java |
 * | Execution:     java TestReturnToLast       |
 * ----------------------------------------------
 * @author oi, 11-02-2018; 12:03:16 
 */
import returnkthtolast.*;

public class TestReturnToLast {
    
    public static void main(String[] args) {
        ReturnKthToLast list = new ReturnKthToLast();

        /* add nodes to list */
        for (int i = 0; i < 10; ++i) {
            list.addHead(i);
        }
        
        /* print list */
        list.printList();
        
        Node head = list.getHead();
        
        /* testing printKthToLast */
        list.printKthToLast(list.getHead(), 5);
        
        /* testing xthToLast */
        Node k = list.xthToLast(list.getHead(), 5);
        k.printNode();

        System.out.print("\n");
    }
}
