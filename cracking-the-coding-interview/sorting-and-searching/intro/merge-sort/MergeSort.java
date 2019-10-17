public class MergeSort {
    
    static void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length-1);
    }

    static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle);    // sort left half
            mergeSort(arr, helper, middle+1, high); // sort right half
            merge(arr, helper, low, middle, high);  // merge them
        }
    }

    static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        /* copy both halves into helper array */
        for (int i = low; i <= high; ++i) {
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        /* iterate through helper array. Compare the left and right half, copying back
         * the smaller element from the two halves into the original array. */
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helperRight) {
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {    // if right element is smaller than left element
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        /* copy the rest of the left side of the array into the target array */
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; ++i) {
            arr[current+1] = helper[helperLeft+1];
        }
    }

    
    public static void main(String[] args) {
        int size = 20;
        int[] arr = randomArray(size, 0, size-1);
        int[] validate = new int[size];
        printIntArray(arr);
        for (int i = 0; i < size; ++i) {
            validate[arr[i]]++;
        }
        mergeSort(arr);
        for (int i = 0; i < size; ++i) {
            validate[arr[i]]--;
        }
        printIntArray(arr);
        for (int i = 0; i < size; ++i) {
            if (validate[i] != 0 || (i < (size) && arr[i] > arr[i+1])) {
                System.out.print("ERROR\n");
            }
        }
    }

    static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    static int randomIntInRange(int min, int max) {
        return randomInt(max + 1 - min) + min;
    }

    static int[] randomArray(int N, int min, int max) {
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = randomIntInRange(min, max);
        }
        return arr;
    }

    static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "");
        }
        System.out.print(""+"\n");
    }
}
