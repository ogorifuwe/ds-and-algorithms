class TwoStrings {

  static String twoStrings(String s1, String s2) {
    
    java.util.Set<Character> content = 
      new java.util.HashSet<Character>();

    for (char c : s1.toCharArray()) {
      content.add(c);
    }

    for (char c : s2.toCharArray()) {
      if (content.contains(c)) {
        return "Yes";
      }
    }
    return "No";
  }

  public static void main(String[] args) {

    String s1 = "Hello", s2 = "world";
    String res = twoStrings(s1, s2);
    System.out.println(res);
  }
}
