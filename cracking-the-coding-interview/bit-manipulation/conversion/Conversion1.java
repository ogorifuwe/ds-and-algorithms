public class Conversion1 {

    public static int bitSwapRequired(int a, int b) {
        int count = 0;
        int c = a ^ b;
        while (c != 0) {
            count += c & 1; // Increment count if c ends with a 1
            c >>>= 1;   // shift right by 1
        }

        return count;
    }

    public static void main(String[] args) {
        int a = -23432;
        int b = 512132;
        System.out.print(a + ": " + toFullBinaryString(a)+"\n");
        System.out.print(b + ": " + toFullBinaryString(b)+"\n");
        System.out.print("Required number of bits: " + bitSwapRequired(a,b)+"\n");
    }

    private static String toFullBinaryString(int num) {
        String str = "";
        for (int i = 0; i < 31; ++i) {
            Integer lsb = new Integer(num&1);
            str = lsb.toString() + str;
            num >>= 1;
        }

        return str;
    }
}
