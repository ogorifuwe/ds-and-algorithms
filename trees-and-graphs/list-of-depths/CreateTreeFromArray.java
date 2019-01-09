public class CreateTreeFromArray {

    public static TreeNode createTreeFromArray(int[] arr) {
        if (arr.length > 0) {
            TreeNode root = new TreeNode(arr[0]);
            java.util.Queue<TreeNode> queue = new java.util.LinkedList<TreeNode>();
            queue.add(root);
            boolean done = false;
            int i = 1;
            while (!done) {
                TreeNode r = (TreeNode) queue.element();
                if (r.left == null) {
                    r.left = new TreeNode(arr[i]);
                    ++i;
                    queue.add(r.left);
                } else if (r.right == null) {
                    r.right = new TreeNode(arr[i]);
                    ++i;
                    queue.add(r.right);
                } else {
                    queue.remove();
                }
                if (i == arr.length) {
                    done = true;
                }
            }
            return root;
        } else {
            return null;
        }
    }
}
