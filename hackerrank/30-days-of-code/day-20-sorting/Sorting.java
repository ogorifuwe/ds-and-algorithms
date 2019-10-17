/**.
 * file: sorting.java
 * ------------------
 * An implementation of Bubble Sort
**/
import java.util.*;

class Sorting {

  private static void printArray(String s, int[] x) {
    System.out.print(s + " Array: ");
    for (int i : x) {
      System.out.print(i+" ");
    }
    System.out.print('\n');
  }

  public static void bubbleSort(int[] x) {
    printArray("Initial", x);// -> Arrays.toString(x)

    int endPosition = x.length-1;
    int swapPosition;

    while (endPosition > 0) {
      swapPosition = 0;

      for (int i = 0; i < endPosition; ++i) {
        if (x[i] > x[i+1]) {
          /* swap elements 'i' and 'i+1' */
          int tmp = x[i];
          x[i] = x[i+1];
          x[i+1] = tmp;

          swapPosition = i;
        } // end if
        printArray("Current", x);
      } // end for
      endPosition = swapPosition;
    } // end while
    printArray("Sorted", x);
  } // end bubble

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] unsorted = new int[n];
    for (int i = 0; i < n; ++i) {
      unsorted[i] = stdIn.nextInt();
    }
    stdIn.close();

    bubbleSort(unsorted);
  }
}
