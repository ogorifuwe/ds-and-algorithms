public class ValidateBSTInOrder {

    public static Integer lastPrinted = null;

    public static boolean checkBST(TreeNode node) {
        return checkBST(node, true);
    }

    /**. Allow "equal" value only for left child. 
     * This validates the BST property */
    public static boolean checkBST(TreeNode n, boolean isLeft) {
        if (n == null) return true;

        /* check if the left subtree is a BST by recursing through it */
        if (!checkBST(n.left, true)) {
            return false;
        }

        /* check current */
        if (lastPrinted != null) {
            if (isLeft) {
                /* left child "is allowed" be equal to parent */
                if (n.data < lastPrinted) {
                    return false;
                }
            } else {
                /* right child "is not allowed" be to parent */
                if (n.data <= lastPrinted) {
                    return false;
                }
            }
        }
        lastPrinted = n.data;

        /* check if the right subtree is a BST by recursing though it */
        if (!checkBST(n.right, false)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {Integer.MIN_VALUE, Integer.MIN_VALUE - 2,
            Integer.MAX_VALUE - 1, Integer.MAX_VALUE};
        TreeNode node = TreeNode.createMinimalBST(arr);
        // node.left.data = 5;
        // node.left.right.data = 3;
        System.out.print(checkBST(node)+"\n");

        test();
    }

    public static void test() {
        TreeNode node;
        boolean condition;
        System.out.print("test cases for equals condition\n");

        /* expect true: for left child: node.data <= lastPrinted

      2
     / \
    /   \
   2     3
          \
           4

         */
        int[] arr2 = {1, 2, 3, 4};
        node = TreeNode.createMinimalBST(arr2);
        node.left.data = 2;
        node.print();
        lastPrinted = null;
        condition = checkBST(node);
        System.out.print("should be true: " + condition + "\n");

        /* expect false: for right child: node.data <= lastPrinted
        
      2
    /  \
   /    \
  1      2
          \
           4
         
         */
        int[] arr3 = {1, 2, 3, 4};
        node = TreeNode.createMinimalBST(arr3);
        node.right.data = 2;
        node.print();
        lastPrinted = null;
        condition = checkBST(node);
        System.out.print("should be false: " + condition + "\n");
    }
}
