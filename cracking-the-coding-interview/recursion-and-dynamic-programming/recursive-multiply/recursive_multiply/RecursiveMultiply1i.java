public class RecursiveMultiply1i {

    public static int minProduct(int a, int b, int[] memo) {
        int smaller = a < b ? a : b;
        int bigger = a < b ? b : a;
        int[] memo = new int[smaller+1];
        return minProduct(smaller, bigger, memo);
    }

    public static int minProduct(int smaller, int bigger, int[] memo) {
        /* base case */
        if (smaller == 0) { // 0 * bigger = 0
            return 0;
        } else if (smaller == 1) {  // 1 * bigger = bigger
            return bigger;
        } else if (memo[smaller] > 0) {
            return memo[smaller];
        }

        int s = smaller >> 1; // divide by 2
        int side1 = minProduct(s, bigger, memo);
        int side2 = side1;
        if (smaller % 2 == 1) {
            side2 = minProduct(smaller-s, bigger, memo);
        }

        /* sum and cache */
        memo[smaller] = side1 + side2;
        return memo[smaller]
    }
}
