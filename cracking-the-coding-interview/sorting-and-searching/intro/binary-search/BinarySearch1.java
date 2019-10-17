class BinarySearch1 {

  static int binarySearch(int[] arr, int x) {
    int low = 0;
    int high = arr.length-1;
    int mid;

    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] < x) {
        low = mid + 1;
      } else if (arr[mid] > x) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;  // error
  }

  public static void main(String[] args) {
    int[] arr = {3, 6, 9, 12, 15, 18};
  }
}
