class ExtraEnd {

  public String extraEnd(String str) {
    int idx = str.length() - 2;
    String lastTwo = str.substring(idx);  
    return lastTwo + lastTwo + lastTwo;
  }

}
