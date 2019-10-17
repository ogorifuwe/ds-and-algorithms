class Solution {

  private static final java.util.Scanner stdIn =
    new java.util.Scanner(System.in);

  public static void main(String[] args) {
    int n = stdIn.nextInt();
    stdIn.skip("(\r\n|[\n\r\u2028\u2029])?");

    for (int i = 1; i <= 10; ++i) {
      int product = n * i;

      System.out.print(n+" x "+i+" = "+product+"\n");
    }
  }
}
