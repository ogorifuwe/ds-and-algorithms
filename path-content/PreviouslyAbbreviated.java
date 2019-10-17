public class PreviouslyAbbreviated {
  
  public static String prevAbbrev(String str) {
    String result = "";
    int frontB = Character.getNumericValue('[');
    int rearB = Character.getNumericValue(']');
    
    /* loop through input */
    for (int i = 0; i < str.length(); ++i) {
      if (Character.isDigit(str.charAt(i)) && Character.getNumericValue(str.charAt(i+1)) == frontB) { 
        int n = Integer.parseInt(str.substring(i, i+1));
        //System.out.println(n);
        //System.out.println(str.charAt(i+2));
        if (!Character.isDigit(str.charAt(i+2))) {
          for (int j = i+2; j < str.length(); ++j) {
            if (Character.getNumericValue(str.charAt(j)) == rearB) {
              String tmp = str.substring(i+2, j);
                int idx = n, k = 0;
                while (k < idx) {
                  result += tmp;
                  k++;
                }
              }
            }
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String input = "3[a2[bc]]";
    String result = prevAbbrev(input);
    System.out.println(result);
  }
}
