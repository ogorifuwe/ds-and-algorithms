class EndsLy {

  public boolean endsLy(String str) {
    if (str.length() <= 1) return false;
    int idx = str.length() - 2;
    String strEnd = str.substring(idx);
    return strEnd.equals("ly");
  }

}
