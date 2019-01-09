/**.
 * File: CheckBalancedBrute.java
 * -----------------------------
 */
import checkbalanced.*;

public class  CheckBalancedBrute {

    public static int getHeight(TreeNode root) {
        if (root == null) return -1;

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return false;

        int heightDiff = Math.abs(getHeight(root.left) - getHeight(root.right));

        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static void main(String[] args) {
        // create a balanced tree
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(arr);
        System.out.print("Root? " + root.data+"\n");
        System.out.print("Is balanced? " + isBalanced(root)+"\n");

        // could be balanced, but it's very unlikely
        TreeNode unbalanced = new TreeNode(10);
        for (int i=0; i<10; ++i) {
            unbalanced.insertInOrder(CheckBalancedUtility.randomIntInRange(0, 100));
        }
        System.out.print("Root? " + unbalanced.data+"\n");
        System.out.print("Is balanced? " + isBalanced(unbalanced)+"\n");
    }
}
