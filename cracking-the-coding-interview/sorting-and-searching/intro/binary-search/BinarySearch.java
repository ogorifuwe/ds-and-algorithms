public class BinarySearch {

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

    static int binarySearchRecursive(int[] arr, int x, int low, int high) {
        if (low > high) return -1;  // error

        int mid = (low + high) / 2;
        if (arr[mid] < x) {
            return binarySearchRecursive(arr, x, low, mid-1);
        } else if (arr[mid] > x) {
            return binarySearchRecursive(arr, x, mid+1, high);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 18};
        for (int i = 0; i < 20; ++i) {
            int loc = binarySearch(arr, i);
            int loc1 = binarySearchRecursive(arr, i, 0, arr.length-1);
            System.out.print(i + ": " + loc + " " + loc1 + " " + "\n");
        }
    }
}
