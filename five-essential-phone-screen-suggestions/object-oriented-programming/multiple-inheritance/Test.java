/* A simple Java Program to demostrate multiple inheritance
 * through default methods. */
interface PI1 {

  /* default method */
  default void show() {
    System.out.println("Default PI1");
  }
}

interface PI2 {
  
  /* default method */
  default void show() {
    System.out.println("Default PI2");
  }
}

/* Inplementation class code */
class Test implements PI1, PI2 {
  
  /* overidding default show method */
  public void show() {
    /* use 'super' keyword to call the show method
     * of PI1 interface */
    PI1.super.show();
    /* use 'super' keyword to call the show method
     * of PI2 interface */
    PI2.super.show();
  }

  public static void main(String[] args) {  
    Test t = new Test();
    t.show();
  }
}
