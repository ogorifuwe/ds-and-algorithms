public class Solution {
  
  public static String prime(int n) {
    if (n == 1) return "Not prime";
    for (int i = 2; i <= Math.sqrt(n); ++i) {
      if (n % i == 0) return "Not prime";
    }
    return "Prime";
  }

  public static void main(String[] args) {
    java.util.Scanner stdIn = new java.util.Scanner(System.in);
    int t = stdIn.nextInt();

    int[] a = new int[t];

    for (int i = 0; i < a.length; ++i) {
      a[i] = stdIn.nextInt();
    }
    stdIn.close();

    for (int i = 0; i < a.length; ++i) {
      System.out.println(prime(a[i]));
    }
  }
}
