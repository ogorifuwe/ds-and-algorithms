class SpecialEleven {

  public boolean specialEleven(int n) {
     if (n < 0) return false;
     if (n  % 11 == 0 || n % 11 == 1) return true;
     return false;
  }

}
