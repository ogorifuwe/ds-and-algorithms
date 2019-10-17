/**.
 * Traversal.java
 * --------------
 */
public class Traversal {

    public static void visit(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + '\n');
        }
    }

    /**.
     * In-Order Traversal
     * to "visit" (often, print) the left node, then the
     * current node, and finally, the right branch.
     */
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    /**.
     * Pre-Order Traversal
     * visits the current node before its child nodes
     */
    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    /**.
     * Post-Order Traversal
     * visits the current node after its child nodes
     */
    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, , 7, 8, 9, 10};

        TreeNode root = TreeNode.createMinimalBST(array);
        inOrderTraversal(root);
    }
}
