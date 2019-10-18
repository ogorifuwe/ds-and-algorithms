class BiggerTwo {

  public int[] biggerTwo(int[] a, int[] b) {
    int aSum = a[0] + a[1];
    int bSum = b[0] + b[1];
          
    if (aSum == bSum) return a;
    return aSum > bSum ? a : b;
  }

}
