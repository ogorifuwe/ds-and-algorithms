import java.lang.StringBuffer;

class RepeatedString {

  static long repeatedString(String s, long n) {
    StringBuffer sb = new StringBuffer();
    sb.append(s);
    int sLen = s.length();

    for (int i = 0; i < n - sLen; ++i) {
      System.out.println("i: "+i + " char: "+sb.charAt(i));
      sb.append(sb.charAt(i));
    }

    String str = sb.toString();

    long count = 0;
    for (char c : str.toCharArray()) {
      if (c == 'a')
        ++count;
    }
    return count;
  }

  static long repeatedString1(String s, long n) {
    double r = 0;

    for (char c : s.toCharArray()) {
      if (c == 'a') {
        ++r;
      }
    }

    int sLen = s.length();
    double count = (n * r/sLen);

    for (int i = 0; i < n % sLen; ++i) {
      if (s.charAt(i) == 'a') {
        ++count;
      }
    }

    return (long)count;
  }

  public static void main(String[] args) {
    String s = "aba";
    long n = 10;

    long res = repeatedString1(s, n);
    System.out.println(res);
  }
}
