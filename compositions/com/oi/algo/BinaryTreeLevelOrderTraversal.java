/**
 * Problem Statement:
 * Given the root of a binary tree, return the level order traversal of
 * its nodes' values. (i.e. from left to right, level by level).
 * Example:
 * Input: [3, 9, 20, null, null, 15, 7]
 * Ouput: [[3], [9, 20], [15, 7]]
 */
class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> res =new ArrayList<>();
    Queue<Node> q = new LinkedList<>();
    if (root != null) {
      return q.offer(root);
    }

    Node curr;
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; ++i) {
        List<Integer> subRes = new LinkedList<>();
        curr = q.poll();
        subRes.add(curr.value);

        if (node.left != null)
          q.offer(node.left);

        if (node.right != null)
          q.offer(node.right);
      }
      res.add(subRes);
    }
    return res;
  }
}
