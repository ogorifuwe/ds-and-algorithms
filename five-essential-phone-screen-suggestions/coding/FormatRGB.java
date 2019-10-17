/**.
 * File: FormatRGB.java
 * --------------------
 * Format an RGB value (three 1-byte numbers) as a 6-digit
 * hexadecimal string.
 **/
public class FormatRGB {

  static String formatRGB1(int r, int g, int b) {
    return (toHex(r) + toHex(g) + toHex(b)).toUpperCase();
  }

  static String toHex(int c) {
    String s = Integer.toHexString(c);
    return (s.length() == 1) ? "0" + s : s;
  }

  static String formatRGB2(int r, int g, int b) {
    return String.format("%02X%02X%02X", r, g, b);
  }

  public static void main(String[] args) {
    int r = 255, g = 255, b = 255;
    String rgb_to_hex = formatRGB2(r, g, b);
    System.out.print(rgb_to_hex + "\n");

  }
}
