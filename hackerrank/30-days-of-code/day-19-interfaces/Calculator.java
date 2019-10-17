class Calculator {
  
  static int divisorSum(int n) {
    
    java.util.List<Integer> list = new java.util.ArrayList<Integer>();
    for (int i = 1; i <= n; ++i) {
      if (n % i == 0) { list.add(i); }
    }

    System.out.println(list.size());
    int total = 0;

    java.util.Iterator i = list.iterator();
    for (Integer it : list) {
      total += it;
    }
    return total;
  }

  static int divisorSum1(int n) {
    int total = 0;
    for (int i = 1; i <= n; ++i) {
      if (n % i == 0) {
        total += i;
      }
    }

    return total;
  }

  public static void main(String[] args) {
    
    int res = divisorSum1(6);
    System.out.println(res);
  }
}
