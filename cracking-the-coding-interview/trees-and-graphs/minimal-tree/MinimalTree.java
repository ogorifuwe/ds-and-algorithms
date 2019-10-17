/**.
 * File: MinimalTree.java
 * ----------------------
 */
public class MinimalTree {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        TreeNode root = TreeNode.createMinimalBST(arr);
        System.out.print("Root? " + root.data+"\n");
        System.out.print("Created BST? " + root.isBST()+"\n");
        System.out.print("Height: " + root.height());
    }
}
