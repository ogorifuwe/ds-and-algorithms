/**.
 * File: TestSumList.java
 * ----------------------
 * This class is used to test the Sum List algorithm.
 * Sum List adds the nodes of a singly linked list in
 * reverse order. Please see README.md and SumList.java
 * for details.
 *
 * ---------------------------------------
 * | Compilation: javac TestSumList.java |
 * | Execution:   java TestSumLists      |
 * ---------------------------------------
 */
public class TestSumLists {
    
    public static void main(String[] args) {
        Node _l11 = new Node(7, null, null);
        Node _l12 = new Node(1, null, _l11);
        Node _l13 = new Node(6, null, _l12);

        Node _l21 = new Node(5, null, null);
        Node _l22 = new Node(9, null, _l21);
        Node _l23 = new Node(2, null, _l22);

        Node _listsum = SumList.sumOfLists(_l11, _l21);

        System.out.print("   " + _l11.printForward()+"\n");
        System.out.print("+  " + _l21.printForward()+"\n");
        System.out.print("   " + _listsum.printForward()+"\n");
    
        int intOfList1 = SumList.listToInt(_l11);
        int intOfList2 = SumList.listToInt(_l21);
        int intOfList3 = SumList.listToInt(_listsum);

        System.out.print(intOfList1 + " + " + intOfList2 + " = " + intOfList3+"\n");
        System.out.print(intOfList1 + " + " + intOfList2 + " = "
                + (intOfList1+intOfList2)+"\n");

    }

}
