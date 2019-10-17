public class AppUtil {
  
  public static void main(String[] args) {
    Pair<Integer, String> p1 = new Pair<>(1, "apple");
    Pair<Integer, String> p2 = new Pair<>(2, "pear");
    boolean same0 = Util.<Integer, String>compare(p1, p2);
    boolean same1 = Util.compare(p1, p2);

    System.out.println(same0);
    System.out.println(same1);
  }
}
