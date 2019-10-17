public class Insertion {

    private static int updateBits(int n, int m, int i, int j) {
        // validation
        if (i > j || i < 0 || j >= 32) return 0;

        /* create a mask to clear bits i through j in n.
         * Example: i = 2, j = 4. Result should be 11100011.
         * For simplicity, we'll use just 8 bits for example.
         */
        int allOnes = ~0;   // will equal sequence of all 1s as in 11111111
        //System.out.print(toFullBinaryString(allOnes)+"\n");
        
        /* 1s before position j, then 0s. left = 11100000 */
        int left = j < 31 ? (allOnes << (j + 1)) : 0;
        //System.out.print(toFullBinaryString(allOnes << 5)+"\n");

        /* 1s after position i. right = 00000011 */
        int right = ((1 << i) - 1);
        //System.out.print(right+"\n");

        /* All 1s, except for 0s between i and j. mask = 11100011 */
        int mask = left | right;

        /* clear bits j through i then put m in there */
        int n_cleared = n & mask;   // clear bits j through i
        int m_shifted = m << i;     // move m into correct position

        return n_cleared | m_shifted;   // OR them, and we're done!
    }

    public static void main(String[] args) {
        int a = ~23423;
        System.out.print(toFullBinaryString(a)+'\n');
        int b = 5;
        System.out.print(toFullBinaryString(b)+'\n');
        int c = updateBits(a, b, 29, 31);
        System.out.print(toFullBinaryString(c)+'\n');
    }

    private static String toFullBinaryString(int a) {
        String str = "";
        for (int i = 0; i < 31; ++i) {
            Integer lsb = new Integer(a & 1);
            str = lsb.toString() + str;
            a = a >> 1;
        }

        return str;
    }
}
