public class Successor {

    public static TreeNode inorderSucc(TreeNode n) {
        if (n == null) return null;

        /* found right children -> return left most node of right subtree */
        if (n.parent == null || n.right != null) {
            return leftMostChild(n.right);
        } else {
            TreeNode q = n;
            TreeNode x = q.parent;
            /* go up until we're on left instead of right */
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    public static TreeNode leftMostChild(TreeNode n) {
        if (n == null) {
            return null;
        }
        while (n.left != null) {
            n = n.left;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(arr);
        for (int i = 0; i < arr.length; ++i) {
            TreeNode node = root.find(arr[i]);
            TreeNode next = inorderSucc(node);
            if (next != null) {
                System.out.print(node.data + "->" + next.data + "\n");
            } else {
                System.out.print(node.data + "->" + null);
            }
        }
    }
}
