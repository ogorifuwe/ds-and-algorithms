/**.
 * File: Palindrome.java
 * ---------------------
 * Checks if two integer singly linked lists are palindromes of
 * each other.
 */
public class Palindrome1 {
    
    public static boolean isPalindrome(Node head) {
        Node reversed = cloneAndReverse(head);
        return isEqual(head, reversed);
    }

    /**.
     * @pre list is not null
     * @post reverse and clone list
     * @param node is head node of list to be cloned and reversed
     * @return cloned and reversed list
     */
    public static Node cloneAndReverse(Node node) {
        Node head = null;

        /* clone and reverse list */
        while (node != null) {
            Node n = new Node(node.data); // clone
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    public static boolean isEqual(Node one, Node two) {
        while (one != null && two != null) {
            if (one.data == two.data) {
                return true;
            }
            one = one.next;
            two = two.next;
        }

        return (one == null && two == null);
    }


    public static void main(String[] args) {
        int length = 9;
        Node[] nodes = new Node[length];

        for (int i = 0; i < length; ++i) { 
            nodes[i] = new Node(i >= length/2 ? length-i-1 : i,null,null);
        }

        for (int i = 0; i < length; ++i) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i+1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i-1]);
            }
        }
        
        //nodes[length - 2].data = 9;
        
        Node head = nodes[0];
        System.out.print(head.printForward()+"\n");
        System.out.print(isPalindrome(head)+"\n");
    }   
}
