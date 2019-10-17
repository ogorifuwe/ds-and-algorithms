class AlternatingCharacters {

  private static int alternatingCharacters(String str) {
    StringBuffer sb = new StringBuffer();

    int count = 0;
    for (int i = 0; i < str.length()-1; ++i) {
      if (str.charAt(i) == str.charAt(i+1)) {
        ++count;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    String[] str = {"AAAA", "BBBBB", "ABABABAB", "BABABA", "AAABBB"};

    for (String s : str) {
      int res = alternatingCharacters(s);
      System.out.println(res);
    }
  }
}
