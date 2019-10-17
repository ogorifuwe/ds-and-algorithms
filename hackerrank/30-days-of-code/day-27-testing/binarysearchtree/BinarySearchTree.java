public class BinarySearchTree {
  
  public static void main(String[] args) {
    EmptyBST eBST = new EmptyBST();
    
    NonEmptyBST neBST = new NonEmptyBST(5);

    Testers.checkIsEmpty(eBST);
    Testers.checkIsEmpty(neBST);

    int tests = 1000;
    for (int i = 0; i < tests; ++i) {
      Tree t;
      if (i % 10 == 0)
        t = Testers.rndTree(0);
      else
        t = Testers.rndTree(10);
    }
    Testers.checkAddMemberCardinality(t, i);
  }
}
