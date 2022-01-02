static class Node<T> {

  protected T data;
  protected Node<T> parent;
  protected Node<T> left;
  protected Node<T> right;

  public Node(T data, Node<T> parent) {
    this.data = data;
    this.parent = parent;
  }
}


class Review<T extends Comparable<T>> {

  public boolean compareBSTs(Node<T> node1, Node<T> node2) {
  
    if ((node1 == null && node2 == null) || (node1 != null && node2 == null)
        || (node1 == null && node2 != null)) {
        return node1 == node2;
        }

    if (node1.data.compare(node2.data) != 0) {
      return false;
    }

    return compareBSTs(node1.left, node2.left) && compareBSTs(node1.right, node2.right);
  } 
}
