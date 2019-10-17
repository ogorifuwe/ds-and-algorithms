class MergeSort4 {
  
  static void mergesort(int[] arr) {
    mergesort(arr, new int[arr.length], 0, arr.length-1);
  }

  static void mergesort(int[] arr, int[] tmpArr, int leftStart, int rightEnd) {
    /* edge case check */
    if (leftStart >= rightEnd) return;

    /* get midpoint of the array */
    int middle = (leftStart + rightEnd) / 2;

    /* sort left half of the array */
    mergesort(arr, tmpArr, leftStart, middle);

    /* sort right half of the array */
    mergesort(arr, tmpArr, middle + 1, rightEnd);

    /* merge the sorted left half with the sorted right half */
    mergeHalves(arr, tmpArr, leftStart, rightEnd);
  }

  static void mergeHalves(int[] arr, int[] tmpArr, int leftStart, int rightEnd) {
    int leftEnd = (leftStart + rightEnd) / 2;   // get end of left half
    int rightStart = leftEnd + 1;               // get start of right half
    int size = rightEnd - leftStart + 1;        // get capacity of the entire array

    int left = leftStart;
    int right = rightStart;
    int index = leftStart;

    while (left <= leftEnd && right <= rightEnd) {
      if (arr[left] <= arr[right]) {
        tmpArr[index] = arr[left];
        ++left;
      } else {
          tmpArr[index] = arr[right];
          ++right;
      }
      ++index;
    }

    /* copy left half in tmpArr */
    System.arraycopy(arr, left, tmpArr, index, leftEnd - left + 1);

    /* copy right half in tmpArr */
    System.arraycopy(arr, right, tmpArr, index, rightEnd - right + 1);

    /* copy tmpArr back in arr */
    System.arraycopy(tmpArr, leftStart, arr, leftStart, size);
  }

  public static void main(String[] args) {
    int[] arr = {90, 56, 343, 76, 12, 468, 7, 3};
    mergesort(arr);
    System.out.println(java.util.Arrays.toString(arr));
  }
}
