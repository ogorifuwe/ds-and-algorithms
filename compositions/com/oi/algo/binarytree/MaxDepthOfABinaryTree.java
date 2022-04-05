/**
 * Problem Statement:
 * Given the root of a binary tree, return its maximum depth.
 */
public class MaxDepthOfBinaryTree {
  
  /** 
   * bottom-up
   * time complexity: O(n)
   * space complexity:
   *  - worst case: O(n)
   *  - best case: O(log n)
   */
  public int maxDepth1(Node root) {
    if (root == null)
      return 0;
    int leftDepth = maxDepth1(root.left);
    int rightDepth = maxDepth(root.right);
    return Math.max(leftDepth, rightDepth) + 1;
  }
}
