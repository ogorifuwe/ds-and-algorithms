public class AppOrderedPair<K, V> {
  public static void main(String[] args) {
    OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 9);
    OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");
    OrderedPair<String, Box<Integer>> p3 = new OrderedPair<>("primes", new Box<Integer>());
  }
}
