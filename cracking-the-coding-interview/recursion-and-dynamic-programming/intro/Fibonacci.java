public class Fibonacci {

    public static void main(String[] args) {
        //System.out.print(fib(100)+"\n");
        System.out.print(fib1(100)+"\n");
    }

    private static int fib(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fib(i-1) + fib(i-2);
    }

    /**. optimizing with dynamic programming "memoization" **/
    private static int fib1(int n) {
        return fib1(n, new int[n+2]);
    }

    private static int fib1(int i, int[] memo) {
        if (i == 0 || i == 1) return i;
        /* array index == 0, i.e is not set to any value */
        if (memo[i] == 0) {
            memo[i] = fib1(i-1, memo) + fib1(i-2, memo);
        }
        return memo[i];
    }


}
