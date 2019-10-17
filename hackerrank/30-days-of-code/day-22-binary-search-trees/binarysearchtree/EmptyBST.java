public class EmptyBST<E extends Comparable> implements Tree<E> {

  public EmptyBST() {}

  public boolean isEmpty() { return true; }

  public int cardinality() { return 0; }

  public boolean member(E elt) { return false; }

  public NonEmptyBST<E> add(E elt) { 
    return new NonEmptyBST<E>(elt); 
  }
}
