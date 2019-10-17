class LastTwo {

  public String lastTwo(String str) {
    if (str.length() == 0) return str;
    if (str.length() == 1) return str;
    int strLen = str.length();
    return str.substring(0,strLen-2) + str.substring(strLen-1)+ str.substring(strLen-2, strLen-1);
  }
}
