class TwoAsOne {

  public boolean twoAsOne(int a, int b, int c) {
    if (a + b == c) return true;
    if (a + c == b) return true;
    if (b + c == a) return true;  
    return false;
  }

}
