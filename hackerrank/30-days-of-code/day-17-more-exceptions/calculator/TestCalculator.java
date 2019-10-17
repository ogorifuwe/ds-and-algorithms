class TestCalculator {

  static int powerIteration(int n, int p) {
    int idx = 1;
    while (idx < p) {
      System.out.println("idx: "+idx +" n: "+n);
      n *= n;
      ++idx;
    }
    return n;
  }

  static int powerRecursion(int n, int p) {
    if (p <= 0) return 1;
    else
      return n * powerRecursion(n, p-1);
  }

  public static void main(String[] args) {
    int n = 2, p = 3;
    int res = powerRecursion(n, p);
    System.out.println(res);
  }
}
