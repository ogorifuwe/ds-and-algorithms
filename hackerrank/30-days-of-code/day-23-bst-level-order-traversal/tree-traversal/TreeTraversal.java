class TreeTraversal {

  public static void visit(Tree t) {
    if (t != null) {
      System.out.println(t.data);
    }
  }

  public void inOrderTraversal(Tree t) {
    if (t != null) {
      inOrderTraversal(t.left);
      visit(t);
      inOrderTraversal(t.right);
    }
  }

  /* preorder traversal aka dfs */
  public void preOrderTraversal(Tree t) {
    if (t != null) {
      visit(t);
      preOrderTraversal(t.left);
      postOrderTraversal(t.right);
    }
  }

  public void postOrderTraversal(Tree t) {
    if (t != null) {
      postOrderTraversal(t.left);
      postOrderTraversal(t.right);
      visit(t);
    }
  }

  /* level order traversal aka bsf */
  public void levelOrderTraversal(Tree t) {
    if (t != null) {
      /* enqueue current root */
      queue.enqueue(t);
    }

    /* while there are nodes to process */
    while (!(queue.isEmpty())) {
      /* dequeue next node */
      BinaryTree tree = queue.dequeue();

      visit(t);

      /* enqueue child elements from next level in order */
      if (t.left != null) {
        queue.enqueue(t.left);
      }

      if (t.right != null) {
        queue.enqueue(t.right);
      }
    }
  }
}
