public class PairWiseSwap {
    
    public static int swapOddEvenBits(int x) {
        return ( ((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1) );
    }

    public static void main(String[] args) {
        int a = 234321;
        System.out.print(a + ": " + toFullBinaryString(a)+"\n");
        int b = swapOddEvenBits(a);
        System.out.print(b + ": " + toFullBinaryString(b)+"\n");
    }

    private static String toFullBinaryString(int x) {
        String s = "";
        for (int i = 0; i < 31; ++i) {
            Integer lsb = new Integer(x&1);
            s = lsb.toString() + s;
            x >>= 1;
        }

        return s;
    }
}
