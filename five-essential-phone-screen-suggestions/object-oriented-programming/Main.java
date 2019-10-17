/**.
 * File: Main.java
 * ---------------
 * An illustration of static initializer in Java
 **/
class Test {

  static int i;
  int j;

  /* start of static block */
  static {
    i = 10;
    System.out.println("static block called ");
  }
  /* end of static block */

  /* Test' constrcuctor */
  Test () {
    System.out.println("Constructor called");
  }
}

class Main {

  public static void main(String[] args) {
    /* Although we don't have an object of Test, static block is
     * called because i is being accessed in the following stat-
     * ement */
    System.out.println(Test.i);

    /* Although we have two objects, static block is executed
     * only once */
    Test t1 = new Test();
    Test t2 = new Test();
  }
}
