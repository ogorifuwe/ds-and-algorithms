package recursiongoodluck;

class RecursionGoodLuck {

  static int summation(int n) {
    if (n <= 0) return 0;
    return n + summation(n-1);
  }

  static int factorial(int n) {
    //if (n <= 0) return 0;
    if (n <= 1) return 1;
    return n * factorial(n-1);
  }

  static int exponentiation(int n, int p) {
    if (p <= 0) return 1;
    else 
      return n * exponentiation(n, p-1);
  }

  public static void main(String[] args) {
    int res0 = summation(3);
    int res1 = factorial(3);

    System.out.println(res0);
    System.out.println(res1);
  }
}
