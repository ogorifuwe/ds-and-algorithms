import java.util.Arrays;

public class TripleStepMemoized1 {

    public static int countWays(int n) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3); 
        }
    }

    public static int countWaysMemoized(int n) {
        int[] map = new int[n+1];
        Arrays.fill(map, -1);
        return countWaysMemoized(n, map); 
    }

    public static int countWaysMemoized(int n, int[] memo) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else if (memo[n] > -1) return memo[n];
        else {
            return countWaysMemoized(n-1, memo)
                + countWaysMemoized(n-2, memo)
                + countWaysMemoized(n-3, memo);
        }
    }

    public static BigInteger countWaysBigInteger(BigInteger n) {
        BigInteger map = new BigInteger[n+1];
        Arrays.fill(map, -1);
        return countWaysBigInteger(n, map);
    }

    public static BigInteger countWaysBigInteger(BigInteger n, BigInteger[] memo) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else if (memo[n] > -1) return memo[n];
        else {
            return countWaysBigInteger(n-1, memo)
                + countWaysBigInteger(n-2, memo)
                + countWaysBigInteger(n-3, memo);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int ways1 = countWays(n);
        int ways2 = countWaysMemoized(n);
        BigInteger ways3 = countWaysBigInteger(n);
        System.out.print(ways1+"\n");
        System.out.print(ways2+"\n");
        System.out.print(ways3+"\n");
    }
}
