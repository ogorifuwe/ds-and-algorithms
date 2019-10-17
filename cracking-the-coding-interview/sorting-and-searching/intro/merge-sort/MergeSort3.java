class MergeSort3 {
  
  static void mergeSort(int[] arr) {
    mergeSort(arr, new int[arr.length], 0, arr.length-1);  
  }

  static void mergeSort(int[] arr, int[] tmpArr, int leftStart, int rightEnd) {
    if (leftStart >= rightEnd) return;

    int middle = (leftStart + rightEnd) / 2;  // get middle
    mergeSort(arr, tmpArr, leftStart, middle); // sort left half of arr
    mergeSort(arr, tmpArr, middle + 1, rightEnd);  // sort right half of arr
    mergeHalves(arr, tmpArr, leftStart, rightEnd);  // merge left half with right half
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
    int[] arr = {20, 84, 12, 1, 107, 56, 21, 19, 15};

    mergeSort(arr);
    System.out.println(java.util.Arrays.toString(arr));
  }
}
