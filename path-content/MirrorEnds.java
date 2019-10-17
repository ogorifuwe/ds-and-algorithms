public class MirrorEnds {

  public static String mirrorEnds1(String string) {
    String mirror = "";

    int start = 0;
    int end = string.length()-1;

    while (start < end) {
      if (string.charAt(start) == string.charAt(end)) {
        mirror += string.charAt(start);
        start++;
        end--;
      }
    }

    return mirror;
  }

  public static String mirrorEnds2(String string) {
    int len = string.length();
    String tmp1 = "", tmp2 = "", fin = "";

    for (int i = 0; i < len; ++i) {
      tmp1 += string.substring(i, i+1);
      tmp2 = "";
      for (int j = tmp1.length()-1; j >= 0; --j) {
        tmp2 += tmp1.substring(j, j+1);
        if (tmp2.equals(string.substring(len-i-1, len))) {
          fin = tmp1;
        }
      }
    }
    return fin;
  }

  public static void main(String[] args) {
    String string = "abXba";
    String mirror = mirrorEnds2(string);
    System.out.println(mirror);
  }
}
