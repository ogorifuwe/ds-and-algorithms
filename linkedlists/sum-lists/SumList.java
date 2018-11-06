/**.
 * File: SumList.java
 * ------------------
 * This algorithm is used to sum the nodes of two integer singly 
 * linked lists in a reverse order. Please see README.md for details.
 */

public class SumList {
    /**.
     * @pre lists are not null
     * @post sums the nodes of the two interger singly linked lists
     * @param list1 first integer singly linked list
     * @param list2 second singly integer linked list
     * @return Returns the summation of the two lists in reverse order. 
     */
    public static Node sumOfLists(Node list1, Node list2) {
        return sumOfLists(list1, list2, 0);
    }

    public static Node sumOfLists(Node list1, Node list2, int carry) {
        if (list1 == null && list2 == null && carry == 0) {
            return null;
        }

        Node result = new Node();
        int resultValue = carry;

        if (list1 != null) {
            resultValue += list1.data;
        }

        if (list2 != null) {
            resultValue += list2.data;
        }

        result.data = resultValue % 10;   /* second digit of number */

        /* recurse through the subsequent nodes of the list */
        if (list1 != null || list2 != null) {
            Node subNodes = sumOfLists(list1 == null ? null : list1.next,
                                       list2 == null ? null : list2.next,
                                       resultValue >= 10 ? 1 : 0);
            result.setNext(subNodes);
        }

        return result;
    }

    /**.
     * @post converts a linked list to integer 
     * @param n Node to be converted to integer
     */
    public static int listToInt(Node n) {
        int val = 0;
        if (n.next != null) {
            val = 10 * listToInt(n.next);
        }
        return val + n.data;
    }


    /**.
     * Follow Up
     */
   /* class PartialSum {
        public Node sum = null;
        public int carry = 0;
    }

    Node addLists(Node l1, Node l2) {
        int len1 = length(l1);
        int len2 = length(l2);
        
        // pad the shorter list with zeros 
        if (len1 < len2) {
            l1 = padList(l1, len2 - len1);
        } else {
            l2 = padList(l2, len1 - len2); 
        }

        // add lists 
        PartialSum sum = addListsHelper(l1, l2);

        // if there was a carry over value, insert it at beginning of
        // list. If not, return linked list
        if (sum.carry == 0) {
            return sum.sum;
        } else {
            Node result = insertBefore(sum.sum, sum.carry);
           return result; 
        }
    }

    PartialSum addListsHelper(Node l1, Node l2) {
        if (l1 == null && l2 == null) {
            PartialSum sum = new PartialSum();
            return sum;
        }
        // add smaller digits recursively
        PartialSum sum = addListHelper(l1.next, l2.next);

        // add carry to current data
        int val = sum.carry + l1.data + l2.data;

        // insert sum of current digits
        Node full_result = insertBefore(sum.sum, val % 10);

        // return sum so far, and the carry over
        sum.sum = full_result;
        sum.carry = val / 10;
        return sum;
    }

    // pad list with zeros
    Node padList(Node list, int data) {
        Node node = new Node(data);
        if (list != null) {
            node.next = list;
        }
        return node;
    }*/
}
