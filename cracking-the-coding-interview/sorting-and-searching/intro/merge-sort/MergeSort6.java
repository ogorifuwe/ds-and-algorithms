class MergeSort6 {

  static void mergeSort(int[] arr) {
    mergeSort(arr, new int[arr.length], 0, arr.length-1);
  }

  static void mergeSort(int[] arr, int[] tmpArr, int leftStart, int rightEnd) {
    /* edge case check */
    if (leftStart >= rightEnd) return;

    /* get midpoint of the array */
    int middle = (leftStart + rightEnd) / 2;

    /* sort left half */
    mergeSort(arr, tmpArr, leftStart, middle);

    /* sort rght half */
    mergeSort(arr, tmpArr, middle+1, rightEnd);

    /* merge sorted left and right halves */
    mergeHalves(arr, tmpArr, leftStart, rightEnd);
  }

  static void mergeHalves(int[] arr, int[] tmpArr, int leftStart, int rightEnd) {
    int leftEnd = (leftStart + rightEnd) / 2; //  get left end
    int rightStart = leftEnd + 1; //  get right start
    int size = rightEnd - leftStart + 1;

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

    System.arraycopy(arr, left, tmpArr, index, leftEnd - left + 1);
    System.arraycopy(arr, right, tmpArr, index, rightEnd - right + 1);
    System.arraycopy(tmpArr, leftStart, arr, leftStart, size);
  }

  public static void main(String[] args) {
    int[] arr = {30, 12, 24, 18, 6};

    mergeSort(arr);
    System.out.println(java.util.Arrays.toString(arr));
  }
}
