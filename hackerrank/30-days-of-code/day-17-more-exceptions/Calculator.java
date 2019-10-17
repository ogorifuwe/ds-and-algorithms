class Calculator {

  public static int power(int n, int p) throws NonNegativeException {
    if (n < 0 || p < 0) throw new NonNegativeException();
    if (p == 0) return 1;
    if (n == 0) return 0;
    return n * power(n, p-1);
  }

  public static void main(String[] args) throws NonNegativeException {
    try {
      int n = 2, p = 0;
      int res = power(n, p);
      System.out.println(res);
    } catch(NonNegativeException e) {
        System.out.println("n and p should be non-negative");
    }
  }
}
