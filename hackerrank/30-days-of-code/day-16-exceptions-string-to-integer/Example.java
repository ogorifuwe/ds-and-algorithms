import java.util.*;

class Example {

  static LinkedList<String> list;
  static int[] intArray = new int[4];

  /* for testing Null Pointer Exception */
  Example() {
    this.list = null;
  }

  /* for testing Index Out of Bounds */
  Example(String str) {
    this.list = new LinkedList<String>();
    list.add(str);
  }

  static void exceptionDemo(int i, String str) {
    
    try {
      /* throws ArrayIndexOutOfBoundsException if index > intArray.length */
      int myInt = intArray[i];

      /* throws NullPointerException if 'list' doesn't oint to 
       * an actual list object */
      list.indexOf(str);
    } /*catch(ArrayIndexOutOfBoundsException e) {
      System.err.println("The following index is out-of-bounds: "+
          e.getMessage());
    } catch(NullPointerException e) {
      System.err.println("Oh no! You tried to perform an operation on "+
          "an object whose value is null");
    }*/ finally {
      System.out.print("This is printing regardless of whether or "+
          "not the program finished executing\n");
    }
    System.out.print("The program was able to continue execution!\n");
  }

  public static void main(String[] args) {
    /* creates an Example  object whose 'list' instance variable points to null: */
    Example eNullList = new Example();

    /* attempt to access an element of the null list, throws Exception */
    eNullList.exceptionDemo(1, "x");

    /* creates an Example object whose 'list' instance variable points to a list
     * containing 1 element ("x"): */
    Example eNotNullList = new Example("x");
    /* attempt to access an invalid index of 'intArray' instance variable, throws Exception */
    eNotNullList.exceptionDemo(100, "x");
  }
}
