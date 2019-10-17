/**.
 * File: LargestInt.java
 * ---------------------
 * Find the largest int value in an array
 **/
public class LargestInt {

  static int largestInt(int[] arr) {
    /* init largest to ist element */
    //int largest = arr[0];
    int largest = Integer.MIN_VALUE;

    /* loop through the array cheacking for larger elements */
    for (int i = 1; i < arr.length; ++i) {
      if (arr[i] > largest)
        largest = arr[i];
    }
    return largest;
  }

  public static void main(String[] args) {
    int[] arr = {1, 5, 9, 4, 2};
    int largest = largestInt(arr);
    System.out.println(largest);
  }
}
