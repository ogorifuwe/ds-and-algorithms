public class SortedMerge {

    static void merge(int[] a, int[] b, int lastA, int lastB) {
        int indexA = lastA-1;   /* index of last element in array a */
        int indexB = lastB-1;   /* index of last element in array b */
        int indexMerged = lastB + lastA-1;  /* end of merged array */

        /* merge a and b, starting from the last element in each */
        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] > b[indexB]) {
                a[indexMerged] = a[indexA]; // copy elements
                indexA--;
            } else {
                a[indexMerged] = b[indexB]; // copy elements
                indexB--;
            }
            indexMerged--;  // move indices
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 4, 7, 6, 7, 7};
        merge(a, b, 8, 6);
        System.out.print(arrayToString(a)+"\n");
    }

    static String arrayToString(int[] array) {
        if (array == null) return "";
        return arrayToString(array, 0, array.length-1);
    }

    static String arrayToString(int[] array, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; ++i) {
            int val = array[i];
            sb.append(val + ", ");
        }
        return sb.toString();
    }
}
