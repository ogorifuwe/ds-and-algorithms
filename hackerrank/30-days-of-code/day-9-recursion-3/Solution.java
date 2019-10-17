import java.io.*;

class Solution {

  static int factorial(int n) {

    if (n == 0) throw new IllegalArgumentException();

    if (n == 1) return 1;
    return n * factorial(n-1);
  }

  public static void main(String[] args) {
    java.util.Scanner stdIn =
            new java.util.Scanner(System.in);
    
    int n = stdIn.nextInt();

    int res = factorial(n);
    System.out.print(res+"\n");
  }
}
