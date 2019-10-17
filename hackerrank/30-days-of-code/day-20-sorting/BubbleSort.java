class BubbleSort {

  static void printArray(String s, int[] a) {
    System.out.print(s + " Array: ");
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.print('\n');
  }

  static void bubbleSort(int[] a) {
    printArray("Initial", a);

    int endPosition = a.length-1;
    int swapPosition;

    while(endPosition > 0) {
      swapPosition = 0;

      for (int i = 0; i < endPosition; ++i) {
        if (a[i] > a[i+1]) {
        /* swap a[i] and a[i+1] */
          int tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;

          swapPosition = i;
        } // end if
        printArray("Current", a);
      } // end for
      endPosition = swapPosition;
    } // end while
    printArray("Sorted", a);
  } // end bubbleSort

  public static void main(String[] args) {
    try {
      java.util.Scanner stdIn = new java.util.Scanner(System.in);
      int n = stdIn.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; ++i) {
        arr[i] = stdIn.nextInt();
      }
      stdIn.close();

      bubbleSort(arr);
    } catch(NumberFormatException e) {
        System.err.println(e.getMessage());
    }
  }
}
