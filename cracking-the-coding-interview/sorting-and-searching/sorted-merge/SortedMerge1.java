public class SortedMerge1 {

    public static void merge(int[] a, int[] b, int lastA, int lastB) {
        int idxA = lastA - 1;
        int idxB = lastB - 1;
        int idxMerged = lastA + lastB - 1;

        while (idxB >= 0) {
            if (idxA >= 0 && a[idxA] > b[idxB]) {
                a[idxMerged] = a[idxA];
                idxA--;
            } else {
                a[idxMerged] = b[idxB];
                idxB--;
            }
            idxMerged--;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 7, 4, 0, 0, 0, 0};
        int[] b = {1, 3, 9, 15};
        merge(a, b, 4, 4);
        System.out.print(arrayToString(a)+"\n");
    }

    static String arrayToString(int[] a) {
        return arrayToString(a, 0, a.length-1);
    }

    static String arrayToString(int[] a, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; ++i) {
            int val = a[i];
            sb.append(val + ", ");
        }
        return sb.toString();
    }
}
