public class MergeSort1 {

    static void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length-1);
    }

    static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle-1);
            mergeSort(arr, helper, middle+1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        /* copy both halves into helper arr */
        for (int i = 0; i < arr.length; ++i) {
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = middle+1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            /* copy left half of helper array */
            if (helperLeft <= helperRight) {
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i < remaining; ++i) {
            arr[current+1] = helper[leftHelper+i];
        }
    }
    
     
}

