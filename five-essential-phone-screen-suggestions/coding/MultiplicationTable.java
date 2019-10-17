/**.
 * File: MultiplicationTable.java
 * ------------------------------
 * Print out the grade school multiplcaton table up tp 12x12
 **/
public class MultiplicationTable {

  static void multTables(int max) {
    for (int i = 1; i <= max; ++i) {
      for (int j = 1; j <= max; ++j) {
        System.out.print(String.format("%4d", j * i));
        //System.out.print(j * i + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int max = 12;
    multTables(12);
  }
}
