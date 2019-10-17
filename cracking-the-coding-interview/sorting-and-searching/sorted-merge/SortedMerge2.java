public class SortedMerge2 {

    static void merge(int[] a, int[] b, int lastA, int lastB) {
        int indexA = lastA-1;
        int indexB = lastB-1;
        int indexMerged = lastA + lastB - 1;

        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] >= b[indexB]) {
                a[indexMerged] = a[indexA];
                indexA--;
            } else {
                a[indexMerged] = b[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 4, 6, 8, 10, 0, 0, 0, 0, 0};
        int[] b = {1, 3, 5, 7, 9};
        merge(a, b, 7, 5);
        System.out.print(arrayToString(a)+"\n");
    }

    static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ++i) {
            int val = arr[i];
            sb.append(val + ", ");
        }
        return sb.toString();
    }
}
