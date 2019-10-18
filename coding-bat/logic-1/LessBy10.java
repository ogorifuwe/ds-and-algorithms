/**
 * File: LessBy10.java
 * -------------------
 * Given three ints, a, b, c, return true if one pf then is 10 or more
 * less than one of the others.
 *
 * lessBy10(1, 7, 11) --> true
 * lessBy10(1, 7, 10) --> false
 * lessBy10(11, 1, 7) --> true
 **/
public class LessBy10 {

  public static boolean lessBy10(int a, int b, int c) {
     if (Math.abs(a-b) >= 10 || Math.abs(a-c) >= 10 || Math.abs(b-c) >= 10) return true;
     return false;
  }

  public static boolean lessBy10i(int a, int b, int c) {

    int high = Math.max(a, b);
    high = Math.max(high, c);

    if (high - a >= 10 || high - b >= 10 || high - c >= 10) {
      return true;
    }

    return false;
  }

  public static boolean lessBy10ii(int a, int b, int c) {

    int diff1 = Math.abs(a - b);
    int diff2 = Math.abs(a - c);
    int diff3 = Math.abs(b - c);

    if (diff1 >= 10 || diff2 >= 10 || diff3 >= 10) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    int a = 1, b = 7, c = 11;
    boolean output = lessBy10ii(1, 7, 11);
    System.out.println(output);
  }
}
