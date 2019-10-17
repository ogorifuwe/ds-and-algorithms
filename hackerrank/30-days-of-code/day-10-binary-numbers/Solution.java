class Solution {

  static void consecutiveOnes(int n) {
    
    java.lang.StringBuffer binaryDigits = new java.lang.StringBuffer();
    int decimal = n;

    while (decimal > 0) {
      int bit = decimal % 2; //System.out.print(bit+"\n");
      char bitChar = (char)(bit + '0'); //System.out.print(bitChar);
      binaryDigits.append(bitChar);
      decimal /= 2;
    }
    
    System.out.println(binaryDigits);
    //int i = binaryDigits.length()
    int i = 0, count = Integer.MIN_VALUE, tmpCount = count;
    while (i < binaryDigits.length()) {
      int c =  Character.getNumericValue(binaryDigits.charAt(i)); 
      if (c == 1) ++tmpCount;
      if (!(c== 1)) tmpCount = 0;
      count = Math.max(count, tmpCount);
      ++i;
    }

    System.out.print(count+"\n");

  }

  private static void consecutiveOnes1(int n) {
    //java.lang.StringBuffer binaryDigits = new java.lang.StringBuffer();
    
    int decimal = n, count = Integer.MIN_VALUE, tmpCount = 0;
    while (decimal > 0) {
      int bit = decimal % 2;
      if (bit == 1) ++tmpCount;
      if (!(bit == 1)) tmpCount = 0;
      count = Math.max(count, tmpCount);
      decimal /= 2;
    }

    System.out.print(count+"\n");
  }
  public static void main(String[] args) {
    java.util.Scanner stdIn = new java.util.Scanner(System.in);
    int n = stdIn.nextInt();
    consecutiveOnes1(n);
    stdIn.close();
  }
}
