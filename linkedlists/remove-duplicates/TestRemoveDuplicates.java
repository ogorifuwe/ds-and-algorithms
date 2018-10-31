/**.
 * File: TestRemoveDuplicates.java
 * -------------------------------
 * This program is used to test the functionality of
 * RemoveDuplicates.java.
 * --------------------------------------------------
 * | Compilation: javac TestRemoveDuplicates.java   |
 * | Exceution:   java TestRemoveDuplicates         |
 * --------------------------------------------------
 */
import removeduplicates.*;

public class TestRemoveDuplicates {

    public static void main(String[] args) {
      
        RemoveDuplicates list = new RemoveDuplicates();
        list.addHead(2);

        for (int i = 1; i < 8; ++i) {
            list.addTail(i%2);
        }

        list.printList();
        //list.deleteDuplicates1(list.getHead());
        list.deleteDuplicates2(list.getHead());
        list.printList();
    }
}
