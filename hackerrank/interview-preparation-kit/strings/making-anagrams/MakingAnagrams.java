class MakingAnagrams {

  private static int makingAnagrams(String s, String t) {
    /* read all of string s a char array  */

    int[] charsCount = new int[26];

    for (char c : s.toCharArray()) {
      charsCount[c-'a']++;
    }

    for (char c : t.toCharArray()) {
      charsCount[c-'a']--;
    }

    int count = 0;
    for (int i : charsCount) {
      count += Math.abs(i);
    }

    return count;
  }

  public static void main(String[] args) {
    String s = "cde";
    String t = "abc";

    int res = makingAnagrams(s, t);
    System.out.println(res);
  }
}
