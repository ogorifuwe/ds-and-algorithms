class Solution {
  
  public static void main(String[] args) {
    java.util.Scanner stdIn = new java.util.Scanner(System.in);
    int t = stdIn.nextInt();

    for (int i = 0; i < t; ++i) {
      String[] nk = stdIn.nextLine().split(" ");

      int n = Integer.parseInt(nk[0]);
      int k = Integer.parseInt(nk[1]);

      if (((k-1)|k) > n && k%2==0) {
        System.out.println(k-2);
      } else {
        System.out.println(k-1);
      }
    }
    stdIn.close();

  }
}
