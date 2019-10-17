//package recursive_multiply;

public class RecursiveMultiply1 {

    public static int counter = 0;
    
    public static int minProduct(int a, int b) {
        int smaller = a < b ? a : b;
        int bigger = a < b ? b : a;
        int[] memo = new int[smaller+1];
        return minProduct(smaller, bigger, memo);
    }

    public static int minProduct(int smaller, int bigger, int[] memo) {
        /* base case */
        if (smaller == 0) { // 0 * bigger = 0
            return 0;
        } else if (smaller == 1) { // 1 * bigger = bigger
            return bigger;
        } else if (memo[smaller] > 0) {
            return memo[smaller];
        }

        /* compute half. if uneven, compute other half. if even, double it */
        int s = smaller >> 1;   // double it
        int side1 = minProduct(s, bigger, memo);
        int side2 = side1;
        if (smaller % 2 == 1) {
            counter++;
            side2 = minProduct(smaller-s, bigger, memo);
        }

        /* sum and cache */
        counter++;
        memo[smaller] = side1 + side2;
        return memo[smaller];
    }

    public static void main(String[] args) {
        int a = 13494;
        int b = 22323;
        int product = a * b;
        int minProduct = minProduct(a, b);
        if (product == minProduct) {
            System.out.println("Success: " + a + " * " + b + " = " + product);
        } else {
            System.out.println("Failure: " + a + " * " + b + " = "
                    + minProduct + " instead of" + product);
        }
        System.out.println("Adds: " + counter);
    }
}
