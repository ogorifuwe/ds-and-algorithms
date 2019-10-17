class StartWord {

  public String startWord(String str, String word) {
    if (str.length() == 0 || str.length() < word.length()) return "";
    if (str.length() == 1 && word.length() == 1) return str;
    
    if (word.length() == 1) {
      if (str.substring(1,2).equals(word))
      return str.substring(0,1);
    }
    
    if (str.substring(1, word.length()).equals(word.substring(1))) 
      return str.substring(0, word.length());
    
    return "";
  }

}
