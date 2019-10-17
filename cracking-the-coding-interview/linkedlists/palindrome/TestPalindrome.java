/**.
 * File: TestPalindrome.java
 * -------------------------
 * Used to test the algorithms in Palindrome.java
 */
public class TestPalindrome {
    
    public static void main(String[] args) {
        int length = 9;
        Node[] nodes = new Node[length];
        for (int i = 0; i < length; ++i) {
            nodes[i] = new Node(i >= length / 2 ? length - i - 1: i, null, null);
        }

        for (int i = 0; i < length; ++i) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i+1]);
            }
        }
        // nodes[length - 2].data = 9;

        Node head = nodes[0];
        System.out.print(head.printForward()+"\n");
        boolean palindrome = Palindrome.isPalindrome(head);
        System.out.print(palindrome+"\n");
    }
}
