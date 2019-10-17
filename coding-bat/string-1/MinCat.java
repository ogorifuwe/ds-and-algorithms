class MinCat {

  public String minCat(String a, String b) {
    if (a.length() > b.length())
      return a.substring(a.length() - b.length()).concat(b);
    if (a.length() < b.length())
      return a.concat(b.substring(b.length() - a.length()));
    return a.concat(b);
  }

}
