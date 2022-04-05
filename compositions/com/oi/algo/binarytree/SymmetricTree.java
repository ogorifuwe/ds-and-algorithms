/**
 * Problem Statement:
 * Given the root of a binary tree, check whether it is a mirror
 * of itself (i.e., a symmetric around its center).
 * Example:
 * Input: [1, 2, 2, 3, 4, 4, 3]
 * Output: true
 */
public class SymmetricTree {

  /**
   * recursive solution
   * time complexity: O(n)
   * space complexity: O(n)
   */
  public boolean isSymmetric(Node root) {
    if (root == null) return false;
    return isSymmetric(root, root);
  }

  private boolean isSymmetric(Node node1, Node node2) {
    if (node1 == null && node2 == null) return true;
    if (node1 == null || node2 == null) return false;
    return node1.value == node2.value
      &&  isSymmetric(node1.left, node2.right)
      &&  isSymmetric(node1.right, node2.left);
  }

  /**
   * iterative solution
   * time complexity: O(n)
   * space complexity: O(n)
   */
  public boolean isSymmetric1(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(root);
    while (!q.isEmpty()) {
      Node node1 = q.poll();
      Node node2 = q.poll();
      if (node1 == null && node2 == null) continue;
      if (node1 == null || node2 == null) return false;
      if (node1.value != node2.value) return false;
      q.add(node1.left);
      q.add(node2.right);
      q.add(node1.right);
      q.add(node2.left);
    }
    return true;
  }
}
