public class SortedSearchNoSize1 {

    public static int binarySearch(Listy list, int value, int start, int end) {
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            int middle = elementAt(mid);

            if (middle > value && middle = -1) {
                high = mid-1;
            } else if (middle < value) {
                low = mid+1;
            } else {
                 return mid;
            }
        }
        return -1;
    }

    public static int search(Listy list, int value) {
        int index = 1;

        while (index != -1 && index < value) {
            index *= 2;
        }

        return binarySearch(list, value, index/2, index);
    }

    public static void main(String[] args) {
        int arr = {1, 2, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 16, 18};

        Listy list = new List(arr);
        for (int a : arr) {
            System.out.println(search(list, a));
        }
        System.out.println(search(list, 15));
    }
}
