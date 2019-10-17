public class Coin1i {
    
    static int makeChange(int amount, int[] coins, int index, int[][] map) {
        if (map[amount][index] > 0) { // cached values
            return map[amount][index];
        }

        /* base case */
        if (index >= coins.length-1) return 1; // last coin

        int coinVal = coins[index];
        int nways = 0;

        for (int val = 0; val * coinVal <= amount; ++val) {
            int bal = amount - (val * coinVal);
            nways += makeChange(bal, coins, index+1, map);
        }

        map[amount][index] = nways;
        return nways;
    }

    static int makeChange(int n) {
        int[] coins = {25, 10, 5, 1};
        int[][] map = new int[n+1][coins.length];
        return makeChange(n, coins, 0, map);
    }

    public static void main(String[] args) {
        int amount = 1000;
        int nways = makeChange(amount);
        System.out.print(nways+"\n");
    }
}
