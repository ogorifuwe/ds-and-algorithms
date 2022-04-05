/**
 * Problem Statement:
 * Given the root of a binary tree, return the preorder traversal
 * of its nodes' values.
 *
 * Example 1:
 *
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTreePreorderTraversal {

  /**
   * Time Complexity: O(N)
   * Space Complexity: O(N)
   */
  public List<Integer> preorderTraversal(Node root) {
    return dfs(root, new ArrayList<Integer>());
  }

  private List<Integer> dfs(Node node, List<Integr> list) {
    if (node == null) return list;
    list.add(node.value);
    list = dfs(node.left, list);
    return dfs(node.right, list);
  }

  public List<Integer> preorderTraversal2(Node root) {
    LinkedList<Node> stack = new LinkedList<>();
    List<Integer> result = new LinkedList<>();
    if (root == null) return result;

    stack.add(root);
    while (!stack.isEmpty()) {
      Node node = stack.pollLast();
      result.add(node.value);
      if (node.right != null) stack.add(node.right);

      if (node.left != null) stack.add(node.left);
    }
    return result;
  }
}
