/**.
 * File: SumFile.java
 * ------------------
 * Write a function that sums up integers from a text file, one 
 * int per line.
 **/
import java.io.BufferedReader;
import java.io.FileReader;

public class SumFile {

  static void sumFile(String fileName) {
    try {
      BufferedReader in = new BufferedReader(new FileReader(fileName));
      int total = 0;
      /* loop through the file */
      for (String s = in.readLine(); s != null; s = in.readLine()) {
        total += Integer.parseInt(s);
      }
      System.out.println(total);
      in.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    sumFile("numsFile.txt");
  }
}
