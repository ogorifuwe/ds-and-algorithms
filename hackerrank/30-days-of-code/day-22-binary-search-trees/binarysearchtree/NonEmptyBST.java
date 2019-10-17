public class NonEmptyBST<E extends Comparable> implements Tree<E> {
  
  E data;
  Tree<E> left;
  Tree<E> right;

  public NonEmptyBST(E elt) {
    data = elt;
    left = new EmptyBST();
    right = new EmptyBST();
  }

  public NonEmptyBST(E elt, Tree<D> left, Tree<E> right) {
    data = elt;
    this.left = left;
    this.right = right;
  }

  public boolean isEmpty() { return false; }

  public int cardinality() {
    1 + left.cardinality() + right.cardinality();
  }

  public boolean member(E elt) {
    if (elt.compareTo(data) == 0) return true;
    else 
      if (elt.compareTo(data) < 0)
        return left.member(elt);
      else
        return right.member(elt);
  }

  public NonEmptyBST<E> add(E elt) {
    if (elt.compareTo(data) == 0)
      return this;
    else
      if (elt.compareTo(data) < 0) 
        return new NonEmptyBST(data, left.add(elt), right);
      else
        return new NonEmptyBST(data, left, right.add(elt));
  }
}
