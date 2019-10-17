import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    
  public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      String s = stdIn.next();

      try{
        int i = Integer.parseInt(s);
        System.out.print(i+"\n");
      } catch(NumberFormatException e) {
        System.err.print("Bad String\n");
      }
      stdIn.close();
  }
}
