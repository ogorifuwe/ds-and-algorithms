/**
 * Problem Statement:
 * Given the root of a binary tree, return the inorder traversal
 * of its nodes' values.
 * Example:
 * Input: [1, null, 2, 3]
 * Ouput: [1, 3, 2]
 */
public class BinaryTreeInorderTraversal {
  
  /**
   * Time Complexity: O(N)
   * Space Complexity: O(N) or O(LogN) average case
   */
  public List<Integer> inorderTraversal(Node root) {
    List<Integer> result = new ArrayList<>();
    dfs(root, res);
    return res;
  }

  private void dfs(Node node, List<Integer> list) {
    if (node != null) {
      dfs(node.left, list);
      list.add(node.value);
      dfs(node.right, list);
    }
  }

  /**
   * Time Complexity: O(N)
   * Space Complexity: O(N)
   */
  public List<Integer> inorderTraversal1(Node root) {
    List<Integer> result = new Arrayist<>();
    Stack<Node> stack = new Stack<>();
    Node curr = root;

    while (curr != null || !stack.isEmpty()) {
      while (curr != null) {
        stack.push(curr);
        curr = curr.left;
      }

      curr = stack.pop();
      result.add(curr.value);
      curr = curr.right;
    }
    return result;
  }
}
