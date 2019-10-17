class Solution {

  static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.next();
    int[] a = new int[n];

    for (int i = 0; i < n; ++i) {
      a[i] = stdIn.nextInt();
    }

    int numberOfSwaps = 0;
    for (int i = 0; i < n; ++i) {

      for (int j = 0; j < n-1; ++j) {
        if (a[j] > a[j+1]) {
          int tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
          ++numberOfSwaps;
        }
      }

      if (numberOfSwaps == 0) {
        break;
      }
    }

    System.out.print("Array is sorted in "+numberOfSwaps+" swaps.\n");
    System.out.print("First Element: "+a[0]+'\n');
    System.out.print("Last Element: "+a[n-1]+'\n');
  }

}
