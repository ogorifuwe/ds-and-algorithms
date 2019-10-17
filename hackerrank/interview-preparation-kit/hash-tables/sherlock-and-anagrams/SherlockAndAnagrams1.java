class SherlockAndAnagrams1 {

  static int sherlockAndAnagrams1(String s) {
    
    int[] chars = new int[128];
    
    for (int i = 0; i < s.length(); ++i) {
      chars[s.charAt(i)]++;
    }

    int count = 0;
    for (int i = s.length()-1; i >= 0; --i) {
      chars[s.charAt(i)]--;

      if (chars[s.charAt(i)] < 0) {
        ++count;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String str = "abba";
    //String str = "abcd";

    int res = sherlockAndAnagrams1(str);
    System.out.print(res+"\n");
  }
}
