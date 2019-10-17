public class XYBalance {

  static boolean xyBalance(String str) {
 /*   int x = 0, y = 0;

    for (int i = 0; i < str.length(); ++i) {
      x = str.lastIndexOf('x');
      y = str.lastIndexOf('y');  
    }
    System.out.println("x: " + x + ", y: " + y);
    if (y <= 0 && x <= 0 || y > x) {
      return true;
    }

    return false;
    */
    boolean x = false;
    boolean y = false;

    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == 'x' && y == true) {
        x = true;
        y = false;
      } else if (str.charAt(i) == 'x') {
        x = true;
      } else if (str.charAt(i) == 'y' && x == true) {
        y = true;
      }
    }

    if (x == false) {
      y = true;
    }
    
    return y;
  }

  public static void main(String[] args) {
    String str = "x";
    boolean b = xyBalance(str);
    System.out.println(b);
  }
}
