/**.
 * File: PreviouslyAbbreviated1.java
 * --------------------------------
 **/
public class PreviouslyAbbreviated1 {

  private static int frontSB = Character.getNumericValue('[');
  private static int rearSB = Character.getNumericValue(']');
  private static String result = "";

  static String prevAbb(String str) {

    
    
    /* loop from the back*/
    for (int i = str.length()-1; i >= 0; --i) {
      if (Character.getNumericValue(str.charAt(i)) == rearSB 
          && Character.getNumericValue(str.charAt(i-1)) == rearSB) {
        int j;
        for (j = i-2; j >= 0; --j) {
          if (Character.getNumericValue(str.charAt(j)) == frontSB) {
            break;
          }
        }    
        
        String tmp = str.substring(j+1, i-1); //System.out.println(tmp);
        result += tmp;
        i = j-1; // update i
        if (Character.isDigit(str.charAt(i))) {
          int n = Character.getNumericValue(str.charAt(i));
          int idx = 1;
          while (idx < n) {
            result += result;
            idx++;
          }
        }
        
        i = j - 2; // update i

        if (!Character.isDigit(str.charAt(i)) && i-1 >=0) {
          if (Character.getNumericValue(str.charAt(i-1)) == frontSB) {
            result = str.charAt(i) + result;
          }
        }

        i--; //update i;
        if (Character.getNumericValue(str.charAt(i)) == frontSB &&
            Character.isDigit(str.charAt(i-1))) {
          int n = Character.getNumericValue(str.charAt(i-1));
          int idx = 1;
          while (idx < n-1) {
            result += result;
            idx++;
          }
        }
        return result;
      }
      

      /*(Character.getNumericValue(str.charAt(i)) == rearSB) {
        //System.out.println(i);
        int j;
        for (j = i-1; j >= 0; --j) {
          if (Character.getNumericValue(str.charAt(j)) == frontSB) {
            break;
          }
        }
        //System.out.println(j);
        String tmp = str.substring(j+1, i); // get string inside the square brackets
        //System.out.println(tmp);
        i = j-1;  // update i
        //System.out.println(i);
        *//* if i is a digit */
        /*if (Character.isDigit(str.charAt(i))) {
        int n = Character.getNumericValue(str.charAt(i)); // get the numeric value of i
        //System.out.println(n);
        int idx = 0;
          while (idx < n) {
            result += tmp;
            idx++;
          }
        }
        return result;
      }
      */
      /* if i is a letter */
      /*else if (Charaacter.isL:1
       *etter(str.charAt(i))) {
      
      }*/
    }

    return result;
  }

  public static void main(String[] args) {
    String input1 = "3[a]";
    String input2 = "3[a2[bc]]";
    String input3 = "2[m]3[pw]rq";

    String output1 = prevAbb(input1);
    String output2 = prevAbb(input2);
    String output3 = prevAbb(input3);

    System.out.println(output1);
    System.out.println(output2);
    System.out.println(output3);
  }

}
