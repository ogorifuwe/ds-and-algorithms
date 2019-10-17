class Concat {

  public String conCat(String a, String b) {
    if (a.length() == 0) return b;
    if (b.length() == 0) return a;
    if (a.substring(a.length()-1).equals(b.substring(0,1)))
      return a + b.substring(1);
    return a + b;
  }

}
