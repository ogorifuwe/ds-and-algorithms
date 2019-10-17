import java.util.Set;
import java.util.HashSet;

class SockMerchant1 {

  static int sockMerchant(int n, int[] arr) {
    
    Set<Integer> colors = new HashSet<Integer>();
    int pairs = 0;

    for (int i = 0; i < n; ++i) {
      if (!colors.contains(arr[i])) {
        colors.add(arr[i]);
      } else {
        pairs++;
        colors.remove(arr[i]);
      }
    }
    return pairs;
  }

  public static void main(String[] args) {
    int n = 9;
    int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 2};

    int res = sockMerchant(n, arr);
    System.out.println(res);
  }
}
