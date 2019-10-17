//import library.UtilityMethods;

public class QuickSort {

    static void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index-1) {   // sort left half
            quickSort(arr, left, index-1);
        }

        if (index < right) {    // sort right half
            quickSort(arr, index, right);
        }
    }

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left+right)/2];    // pick pivot point
        while (left <= right) {
            /* find element on left that should be on right */
            while (arr[left] < pivot) left++;

            /* find element on right that should be on left */
            while (arr[right] > pivot) right--;

            /* swap elements, and move left and rght indices */
            if (left <= right) {
                swap(arr, left, right); // swap elements
                left++;
                right--;
            }
        }
        return left;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = randomArray(20, 0, 6);
        printIntArray(arr);
        quickSort(arr, 0, arr.length-1);
        printIntArray(arr);
    }

    public static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int randomIntInRange(int min, int max) {
        return randomInt(max + 1 - min) + min;
    }

    public static int[] randomArray(int N, int min, int max) {
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = randomIntInRange(min, max);
        }
        return arr;
    }

    public static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "");
        }
        System.out.print(""+"\n");
    } 
}
