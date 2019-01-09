public class ValidateBSTMinMax {

    public static boolean checkBST(TreeNode n, Integer min, Integer max) {
        if (n == null) return true;

        if ((min != null && n.data <= min) || (max != null && n.data > max))
            return false;

        if (!checkBST(n.left, min, n.data) || 
            !checkBST(n.right, n.data, max)) 
            return false;

        return true;
    }

    public static boolean checkBST(TreeNode n) {
        return checkBST(n, null, null);
    }

    public static void main(String[] args) {
        /* simple test case */
        int[] arr = {Integer.MIN_VALUE, 3, 5, 6, 10, 13, 15, Integer.MAX_VALUE};
        TreeNode node = TreeNode.createMinimalBST(arr);
        // node.left.data = 6;  // ruin the BST property
        node.print();
        boolean isBST = checkBST(node);
        System.out.print(isBST + "\n");
    }
}
