package magic_index;

public class MagicIndex {

    public static int magicIndex(int[] arr) {
    
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public static int magicIndexFast(int[] arr) {
        return magicIndex(arr, 0, arr.length-1);
    }

    public static int magicIndexFast(int[] arr, int start, int end) {
        if (end < start) return -1;

        int mid = (start+end)/2;
        if (arr[mid] == mid)
            return mid;
        else if (arr[mid] < mid)
            return magicIndexFast(arr, start, mid-1);
        else
            return magicIndexFast(arr, mid+1, end);
    }

    /**. follow up: what if the values are distinct? **/
    public static int magicIndexFast1(int[] arr) {
        if (end < start) return -1;

        int midIndex = (start+end)/2;
        int midValue = arr[midIndex];
        if (arr[midIndex] == midValue)
           return midValue;

       /* search left */
       int leftIndex = Math.min(midIndex-1, midValue);
       int left = magicIndexFast1(arr, start, leftIndex);
       if (left > 0)
           return left;

       /* search right */
       int rightIndex = Math.max(MidIndex+1, midValue);
       int right = magicIndexFast1(arr, rightIndex, end);
       return right;
    }
}
