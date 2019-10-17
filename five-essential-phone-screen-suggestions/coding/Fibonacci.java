/**.
 * File: Fibonacci.java
 * --------------------
 * Write a function to compute the Nth fibonacci number
 **/
public class Fibonacci {

  /* approach 1 */
  static int fib1(int n) {
    if (n == 0) return 0;
    else if (n == 1) return 1;
    return fib1(n-1) + fib1(n-2);
  }
  
  /*approach 2 */
  static int fib2(int n) {
    return n <= 1 ? n : fib2(n-1) + fib2(n-2);
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 10; ++i) {
      System.out.println("fibonacci of " + i + ": " + fib2(i));
    }
  }
}
