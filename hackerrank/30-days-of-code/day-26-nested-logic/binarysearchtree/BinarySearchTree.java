public class BinarySearchTree {
  
  public static void main(String[] args) {
    EmptyBST eBST = new EmptyBST();
    NonEmptyBST neBST = new NonEmptyBST(5);

    Testers.checkIsEmpty(eBST);
    Testers.checkIsEmpty(neBST);
  }
}
