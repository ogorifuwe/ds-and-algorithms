class CountingValleys {

  static int countValleys(int n, String s) {
    int level = 0, valleys = 0;

    for (int i = 0; i < n; ++i) {
      if (s.charAt(i) == 'U') {
        ++level;
      }

      if (s.charAt(i) == 'D') {
        --level;
      }

      if (level == 0 && s.charAt(i)  == 'U') {
        System.out.println(s.charAt(i));
        ++valleys;
        System.out.println(valleys);
      }
    }
    
    return valleys;
  }

  public static void main(String[] args) {
    int n = 12;
    String s = "DDUUDDUDUUUD";

    int res = countValleys(n, s);
    System.out.println(res);
  }
}
