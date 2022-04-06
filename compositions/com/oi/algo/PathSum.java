/**
 * Problem Statement:
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals targetSum.
 *
 * A leaf is a node with no children.
 */
class PathSum {

  /**
   * time complexity: O(n)
   * space complexity: O(n)
   */
  boolean hasPathSum(Node root, targetSum) {
    if (root == null)
      return false;

    targetSum -= root.val;
    if (root.left == null && root.right == null) {
      return targetSum == 0;
    }

    return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
  }

  /**
   * time complexity: O(n)
   * space complexity: O(n)
   */
  boolean hasPathSum1(Node root, targetSum) {
    LinkedList<Node> nodeStack = new LinkedList<>();
    LinkedList<Integer> sumStack = new LinkedList<>();

    nodeStack.add(root);
    sumStatack.add(targetSum - root.value);
    
    while (!stack.isEmpty()) {
      Node node = nodeStack.pollLast();
      int currSum = sumStack.pollLast();
      if (node.left == null && node.right == null && currSum == 0) 
        return true;

      if (node.right != null) {
        nodeStack.add(node.right);
        sumStack.add(currSum - node.right.value)
      }

      if (node.left != null) {
        nodeStack.add(node.left);
        sumStack.add(currSum - node.left.value);
      }
    }

    return false;
  }

}
