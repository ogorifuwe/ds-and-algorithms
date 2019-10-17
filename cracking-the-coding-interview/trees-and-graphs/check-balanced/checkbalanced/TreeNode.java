/**.
 * File: TreeNode.java
 * -------------------
 */
package checkbalanced;

public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    private static int size;

    public TreeNode(int d) { 
        data = d; 
        size = 0;
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

    public void insertInOrder(int d) {
        if (d <= data) {
            if (left == null) {
                setLeftChild(new TreeNode(d));
            } else {
                left.insertInOrder(d);
            }
        } else {
            if (right == null) {
                setRightChild(new TreeNode(d));
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }

    public int size() { return size; }

    public static TreeNode createMinimalBST(int[] arr, int strt, int end) {
        if (end < strt) return null;

        int mid = (strt+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.setLeftChild(createMinimalBST(arr, strt, mid-1));
        root.setRightChild(createMinimalBST(arr, mid+1, end));
        return root;
    }

    public static TreeNode createMinimalBST(int[] arr) {
        return createMinimalBST(arr, 0, arr.length-1);
    }

    public TreeNode find(int d) {
        if (d == data) return this;

        else if (d < data)
            return left != null ? left.find(d) : null; 
        else if (d > data)
            return right != null ? right.find(d) : null;
        return null;
    }

    public boolean isBST() {
        if (left != null) {
            if (data < left.data || !left.isBST()) {
                return false;
            }
        }
        if (right != null) {
            if (data > right.data || !right.isBST()) {
                return false;
            }
        }
        return true;
    }
}
