public class Coini {

    static int makeChange(int amount, int[] denoms, int idx) {
        if (idx >= denoms.length-1) return 1;

        int denomVal = denoms[idx];
        int nWays = 0;

        for (int val = 0; val * denomVal <= amount; ++val) {
            int bal = amount - val * denomVal;
            nWays += makeChange(bal, denoms, idx+1);
        }
        return nWays;
    }

    static int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        return makeChange(n, denoms, 0);
    }

    public static void main(String[] args) {
        int amount = 100;
        int nWays = makeChange(amount);
        System.out.print(nWays+"\n");
    }
}
