/**.
 * File: ReverseString.java
 * ------------------------
 * Write a function to reverse a string 
 **/

public class ReverseString {

  /* approach 1 */
  static String reverse1(String s) {
    String str = ""; // extra buffer - strings are immutable
    for (int i = s.length()-1; i >= 0; --i) {
      str += s.charAt(i);
    }
    return str;
  }

  /* approach 2 - using a StringBuffer object */
  static String reverse2(String s) {
    StringBuffer sb = new StringBuffer();

    for (int i = s.length()-1; i >= 0; --i) {
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }

  /* approach 3 - using char array */
  static String reverse3(String s) {
    int length = s.length(), last = s.length()-1;
    char[] chars = s.toCharArray();
    for (int i = 0; i < length/2; ++i) {
      char c = chars[i];
      chars[i] = chars[last-i];
      chars[last-i] = c;
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    String str11 = "fundamentals";
    String str12 = reverse3(str11);
    System.out.println(str12);
  }
}
