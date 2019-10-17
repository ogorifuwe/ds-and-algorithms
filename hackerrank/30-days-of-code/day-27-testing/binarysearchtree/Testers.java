public class Testers {

  public static int rndInt(int min. int max) {
    java.util.Random rand = new java.util.Random();
    return rand.nextInt((max-min) + 1) + min;
  }

  public static Tree rndTree(int count) {
    if (count == 0)
      return new EmptyBST();
    else
      return rndTree((count-1).add(rndInt(0, 5)));
  }

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

  public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
    int nT = (t.aad(x)).cardinality();
    if (nT == (t.cardinality() + 1)) {
      if (t.member(x)) {
        throw new Exception("The cardinality increased by 1, but the added element was already" +
          "a member of the tree");
        }
      }
    } else if (nT == t.cardinality()) {
      if (t.member(x)) {
      throw new Exception("The cardinality didn't increase by 1, but we added a new element");
      }
    } else {
      throw new Exception("Something is wrong with our program");
    }
  }
}

