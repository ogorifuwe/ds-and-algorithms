public class Conversion2 {

    public static int bitSwapRequired(int a, int b) {
        int count = 0;
        int c = a ^ b;

        System.out.print("****\n");
        System.out.print(c + ": " + toFullBinaryString(c));

        while (c != 0) {
            System.out.print("c - 1: " + c + ": " + toFullBinaryString(c-1)+"\n");
            c = c & (c-1);
            System.out.print("c: " + c + ": " + toFullBinaryString(c)+"\n");
            count++;
            System.out.print("****");
        }

        return count;
    }

    public static void main(String[] args) {
        int a = -23432;
        int b = 512132;
        System.out.print(a + ": " + toFullBinaryString(a)+"\n");
        System.out.print(b + ": " + toFullBinaryString(b)+"\n");
        System.out.print("Required number of bits: " + bitSwapRequired(a, b)+"\n");
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
