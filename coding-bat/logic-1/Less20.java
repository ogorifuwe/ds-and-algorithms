class Less20 {

  public boolean less20(int n) {
    int expr = 20 - (n % 20);
    return expr == 2 || expr == 1;
  }

}
