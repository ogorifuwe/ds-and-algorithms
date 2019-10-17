class MergeSort5 {
  
  static void mergeSort(int[] arr) {
    mergeSort(arr, new int[arr.length], 0, arr.length-1);
  }

  static void mergeSort(int[] arr, int[] tmpArr, int leftStart, int rightEnd) {
    /* edge case check */
    if (leftStart >= rightEnd) return;

    /* get midpoint of array */
    int middle = (leftStart + rightEnd) / 2;
    
    /* sort left half of the array */
    mergeSort(arr, tmpArr, leftStart, middle);

    /* sort right of the array */
    mergeSort(arr, tmpArr, middle + 1, rightEnd);

    /* merge sorted left half woth sort right half */
    mergeHalves(arr, tmpArr, leftStart, rightEnd);
  }

  static void mergeHalves(int[] arr, int[] tmpArr, int leftStart, int rightEnd) {
    int leftEnd = (leftStart + rightEnd) / 2;
    int rightStart = leftEnd + 1;
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
    int[] arr = {45, 685, 74, 4536, 2, 35, 98};
    mergeSort(arr);
    System.out.println(java.util.Arrays.toString(arr));
  }
}
