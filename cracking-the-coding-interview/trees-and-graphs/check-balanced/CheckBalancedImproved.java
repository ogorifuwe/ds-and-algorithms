/**.
 * File: CheckBalancedImproved.java
 * --------------------------------
 */
import checkbalanced.*;

public class CheckBalancedImproved {
    
    public static int checkHeight(TreeNode root) {
        if (root == null) return -1;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return (checkHeight(root) != Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        // create balanced tree
        int[] arr = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(arr);

        System.out.print("Is balanced? " + isBalanced(root)+"\n");
        root.insertInOrder(4);  // Add 4 to make it unbalanced
        System.out.print("Is balanced? " + isBalanced(root)+"\n");
    }
}
