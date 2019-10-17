/*.
 * file: BeautifulBinaryString
 * ---------------------------
 * How many binary characters must you change to remove every occurence
 * of "010" from a binary string.
 */
class BeautifulBinaryString {
    
  static int beautifulBinaryString(String str) {
    char[] bits = str.toCharArray();

    int count = 0;
    for (int i = 0; i < charBits.length; ++i) {
      if (charBits[i] == '0' && 
          charBits[i+1] == '1' && charBits[i+2]) {
        ++count;    
      }
    }

    return count

  public static void main(String[] args) {
   
    java.util.Scanner stdIn = new java.util.Scanner(System.in);
    String strBits = stdIn.next();
    int res = beautifulBinaryString(strBits);
    System.out.print(res+" \n");
    char[] charBits = strBits.toCharArray();

    int count = 0;
    for (int i = 0; i < charBits.length; ++i) {
      if (charBits[i] == '0' && 
          charBits[i+1] == '1' && charBits[i+2]) {
        ++count;    
      }
    }

    return count

    stdIn.close();
  }
}
