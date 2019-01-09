/**.
 * File: Palindrome3.java
 * ----------------------
 * Checks if a linked list is a palindrome using recursion.
 */
public class Palindrome3 {
   
    static class Result {
        public Node node;
        public boolean result;

        public Result(Node n, boolean res) {
            node = n;
            result = res;
        }
    }

    static boolean isPalindrome(Node head) {
        int length = lengthOfList(head);
        Result p = isPalindromeRecurse(head, length);
        return p.result;
    }

    static Result isPalindromeRecurse(Node head, int length) {
        if (head == null || length <= 0) {
            return new Result(head, true);
        } else if (length == 1) {
            return new Result(head.next, true);
        }

        /* recurse on sublist */
        Result res = isPalindromeRecurse(head.next, length-2);

        if (!res.result || res.node == null) {
            return res;
        }

        res.result = (head.data == res.node.data);

        res.node = res.node.next;

        return res;
    }

    static int lengthOfList(Node n) {
        int size = 0;
        while (n != null) {
            size++;
            n = n.next;
        }
        return size;
    }


    public static void main(String[] args) {
        int length = 9;
        Node[] nodes = new Node[length];
        for (int i = 0; i < length; ++i) {
            nodes[i] = new Node(i >= length/2 ? length-i-1 : i, null, null);
        }

        for (int i = 0; i < length; ++i) {
            if (i < length-1) {
                nodes[i].setNext(nodes[i+1]);
            }
            else if (i > 0) {
                nodes[i].setPrevious(nodes[i-1]);
            }
        }
        
        //nodes[length-2].data = 5;

        Node head = nodes[0];
        System.out.print(head.printForward()+"\n");
        System.out.print(isPalindrome(head)+"\n");
    }

}
