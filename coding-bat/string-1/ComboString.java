class ComboString {

  public String comboString(String a, String b) {
    int aLen = a.length(), bLen = b.length();
    return (aLen < bLen) ? a + b + a : b + a + b;
  }

}
