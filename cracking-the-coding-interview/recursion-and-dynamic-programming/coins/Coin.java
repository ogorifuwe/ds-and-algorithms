public class Coin {

    /*static int makeChangeHelper(int total, int[] denoms, int index) {
        int coin = denoms[index];
        if (index == denoms.length-1) {
            int remaining = total % coin;
            return remaining == 0 ? 1 : 0;
        }

        int ways = 0;*/
        /* try 1 coin, then 2 coins, then 3, ... recursing each time on rest  */
        /*for (int amount = 0; amount <= total; amount += coin) {
            ways += makeChangeHelper(total - amount, denoms, index+1);
        }
        return ways;
    }

    static int makeChange(int amount, int[] denoms) {
        return makeChangeHelper(amount, denoms, 0);
    }

    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        int ways = makeChange(10, denoms);
        System.out.print(ways+"\n");
    }*/

    static int makeChange(int amount, int[] coins, int index) {
        if (index >= coins.length-1) return 1;   // last denom

        int coinValue = coins[index];
        int ways = 0;
        for (int i = 0; i * coinValue <= amount; ++i) {
            int remainingAmount = amount - (i * coinValue);
            ways += makeChange(remainingAmount, coins, index+1);
        }
        return ways;
    }

    static int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        return makeChange(n, denoms, 0);
    }

    public static void main(String[] args) {
        int ways = makeChange(100);
        System.out.print(ways+"\n");
    }

}
