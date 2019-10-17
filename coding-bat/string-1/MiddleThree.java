class MiddleThree {

  public String middleThree(String str) {
    if (str.length() == 3) return str;
    int idx = (str.length()/2)-1;
    return str.substring(idx, idx+3);
  }

}
