class More20 {

  public boolean more20(int n) {
     if (n < 0) return false;
     if (n % 20 == 1 || n % 20 == 2) return true;
     return false;
  }

}
