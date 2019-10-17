class MiddleTwo {

  public String middleTwo(String str) {
    int startIdx = str.length() / 2 - 1;
    int endIdx = str.length() / 2 + 1;
    return str.substring(startIdx, endIdx);
  }
  
}
