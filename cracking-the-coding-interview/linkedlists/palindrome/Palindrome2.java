/**.
 * File: Palindrome2.java
 * ----------------------
 * Checks if an integer linked list is a palindrome.
 * Solutions uses runner technique.
 */
public class Palindrome2 {
    
    static boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;

        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

        /* push elements from the half of the list onto stack
         * when fast runner reaches end of list, slow runner
         * will be at the middle */
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        /* if list has odd number of elements, skip middle */
        if (fast != null) {
            slow = slow.next;
        }
        
        /* compare elements in the other half of the list with stack */
        while (slow != null) {
            int top = stack.pop().intValue();
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
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
            if (i > 0) {
                nodes[i].setPrevious(nodes[i-1]);
            }
        }

        //nodes[length-2].data = 15;

        Node head = nodes[0];
        System.out.print(head.printForward()+"\n");
        System.out.print(isPalindrome(head)+"\n");
    }
}
