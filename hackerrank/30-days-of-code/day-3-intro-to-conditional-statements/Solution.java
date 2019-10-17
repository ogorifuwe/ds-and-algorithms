class Solution {
  
  private static final java.util.Scanner scanner =
                                new java.util.Scanner(System.in);


  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\2029\u0085])?");
    
    if (!(n % 2 == 0)) { System.out.print("Weird\n"); }
    else if (n % 2 == 0 && n >= 2 && n <= 5) { System.out.print("Not Weird"); }
    else if (n % 2 == 0 && n >= 6 && n <= 20) { System.out.print("Weird"); }
    else if (n % 2 == 0 && n > 20) { System.out.print("Not Weird"); }
    
    scanner.close();
  }

}
