/**.
 * File: TestPartition.java
 * -------------------------
 * Tests the implementation of partioning a singly linked list
 * around a pivot. See README.md for details.
 *
 * -------------------------------------------
 * | Compilation: javac TestPartition.java   |
 * | Execution:   java TestPartition         |
 * -------------------------------------------
 * 
 * @author oi, 11-03-2018; 10:15:46
 */
import partition.*;

public class TestPartition {

    public static void main(String[] args) {
        System.out.print(linkedList().printForward()+"\n");
        
        /* test partition algorithms */
        Node part1 = PartitionLinkedList.partition1(linkedList(), 3);
        Node part2 = PartitionLinkedList.partition2(linkedList(), 3);

        /* print partitioned list */
        System.out.print(part1.printForward()+"\n");
        System.out.print(part2.printForward()+"\n");
    }

    public static Node linkedList() {
        /* new linked list */
        int[] vals = {33, 9, 2, 3, 10, 10389, 838, 874578, 5};
        Node head = new Node(vals[0], null, null);
        Node currNode = head;

        for (int i = 0; i < vals.length; ++i) {
            currNode = new Node(vals[i], null, currNode);
        }
        return head;
    }
}
