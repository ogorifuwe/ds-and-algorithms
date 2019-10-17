class TheEnd {

  public String theEnd(String str, boolean front) {
    if (!front)
      return str.substring(str.length()-1);
    else 
      return str.substring(0,1);
  }

}
