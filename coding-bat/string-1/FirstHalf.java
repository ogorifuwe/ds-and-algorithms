class FirstHalf {

  public String firstHalf(String str) {
    int end = str.length() / 2;
    String res = str.substring(0, end);
    return res;
  }

}
