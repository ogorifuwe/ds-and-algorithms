public class Coin1 {

    static int makeChange(int amount, int[] denoms, int index, int[][] map) {
        if (map[amount][index] > 0) { // retrieve precomputed values
            return map[amount][index];
        }

        if (index >= denoms.length-1) return 1;
        int denomVal = denoms[index];
        int nWays = 0;

        for (int val = 0; val * denomVal <= amount; ++val) {
            int bal = amount - val * denomVal;
            nWays += makeChange(bal, denoms, index+1, map);
        }

        map[amount][index] = nWays;
        return nWays;
    }

    static int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        int[][] map = new int[n+1][denoms.length];
        return makeChange(n, denoms, 0, map);
    }

    public static void main(String[] args) {
        int n = 100;
        int nways = makeChange(n);
        System.out.print(nways+"\n");
    }
}
