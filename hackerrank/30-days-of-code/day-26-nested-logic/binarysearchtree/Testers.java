public class Testers {

  public static void checkIsEmpty(Tree t) throws Exception {
    if (t instanceof EmptyBST) {
      if (t.isEmpty()) {
        throw new Exception("The tree is an EmptyBST and it is empty");
      } else if (t instanceof NonEmptyBST) {
        if (!t.isEmpty()) {
          throw new Exception("The tree is a NonEmptyBST and it is non-empty");
        }
      }
    }
  }
}

