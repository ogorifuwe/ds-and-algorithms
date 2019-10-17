class Without2 {

  public String without2(String str) {
    if (str.length() < 2) return str;
    if (str.length() == 2) return "";
          
    String front = str.substring(0,2);
    if (str.substring(0,2).equals(front)
        && str.substring(str.length()-2).equals(front))
          return str.substring(2);        
    return str;
  }
}
