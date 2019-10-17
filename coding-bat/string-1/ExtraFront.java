class ExtraFront {

  public String extraFront(String str) {
    if (str.length() < 2) return str + str + str;
    else {
      String res = str.substring(0, 2);
      return res + res + res;
    }
  }

}
