public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    private int size;

    public TreeNode(int d) {
        data = d;
        size = 1;
    }

    public void setLeftChild(TreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    public void setRightChild(TreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }

    public void setInOrder(int d) {
        if (d <= data) {
            if (left == null) {
                setLeftChild(new TreeNode(d));
            } else {
                left.setInOrder(d);
            }
        } else {
            if (right == null) {
                setRightChild(new TreeNode(d));
            } else {
                right.setInOrder(d);
            }
        }
        size++;
    }

    public TreeNode find(int d) {
        if (d == data) return this;

        else if (d < data)
            return left != null ? left.find(d) : null;
        else if (d > data)
            return right != null ? right.find(d) : null;
        return null;
    }

    public int height() {
        int leftHeight = left != null ? left.height() : 0;
        int rightHeight = right != null ? right.height() : 0;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBST() {
        if (left != null) {
            if (data < left.data || !left.isBST())
            return false;
        }
        if (right != null) {
            if (data > right.data || !right.isBST())
                return false;
        }
        return true;
    }

    public static TreeNode createMinimalBST(int[] arr, int start, int end) {
        if (end < start) return null;

        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.setLeftChild(createMinimalBST(arr, start, mid-1));
        n.setRightChild(createMinimalBST(arr, mid+1, end));
        return n;
    }

    public static TreeNode createMinimalBST(int[] arr) {
        return createMinimalBST(arr, 0, arr.length-1);
    }
}
