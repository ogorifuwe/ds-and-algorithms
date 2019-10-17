public class Solution {

  java.util.Queue<Node> queue = new LinkedList<Node>();

  static void levelOrder(Node root) {
    /* add the tree to queue by adding the root node */
    if (root != null) {
      queue.add(root);
    }

    while (!queue.isEmpty()) {
      Node finger = queue.remove();
      
      visit(finger);

      if (finger.left != null) queue.add(finger.left);
      if (finger.right != null) queue.add(finger.right);
    }
  }

  public static void visit(Node n) {
    if (n != null) {
      System.out.println(n.data);
    }
  }
}
