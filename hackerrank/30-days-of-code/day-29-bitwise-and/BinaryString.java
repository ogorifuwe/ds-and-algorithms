/**.
 * file: BinaryString.java
 * -----------------------
 * Converts a word and an integer to binary strings
**/
class BinaryString {

  BinaryString(String string) {
    for (byte b : string.getBytes()) {
      System.out.print(Integer.toBinaryString(b)+" ");
    }
    System.out.println();
  }

  BinaryString(Integer integer) {
    System.out.println(Integer.toBinaryString(integer));
  }

  public static void main(String[] args) {
    new BinaryString("HackerRank");
    new BinaryString(8675309);
  }
}
