/**
 * TwoE.java
 * ---------
 * Illustrates:
 * 1. Traversing a String using a For Loop.
 * 2. String slicing using the substring method.
 * 3. String comparison using the equals Method.
 * 4. Characters of a String using charAt method.
 */
class TwoE {

  public static void main(String[] args) {
    System.out.println(twoE("Expose".toLowerCase())); 
    System.out.println(twoE2("Expose".toLowerCase()));
  }

  static boolean twoE(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); ++i) {
      String substr = str.substring(i, i+1);
      if (substr.equals("e")) ++count;
    }
    boolean res = count == 2 ? true : false;
    return res;
  }

  static boolean twoE2(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == 'e') ++count;
    }
    return (count == 2);
  }
}
