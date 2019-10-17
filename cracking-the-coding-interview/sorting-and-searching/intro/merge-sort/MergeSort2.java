public class MergeSort2 {

    public static void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0; arr.length-1);
    }

    public static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle-1);
            mergeSort(arr, helper, middle+1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    public static void merger(int[] arr, int[] helper, int low, int middle, int high) {
        /* copy elements into helper array */
        for (int i = 0; i < arr.length; ++i) {
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = middle+1;
        int current = low;

        /* merge both halves into array */
        while (helperLeft <= middle && helperRight <= high) {
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
        for (int i = 0; i < middle; ++i) {
            arr[current+1] = helper[helperLeft+i];
        }
    }
}
