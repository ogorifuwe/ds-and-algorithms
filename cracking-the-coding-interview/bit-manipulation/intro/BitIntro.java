public class BitIntro {

    private static int repeatArithmeticShift(int x, int count) {
        for (int i = 0; i < count; ++i) {
            x >>= 1;   // arithmetic shift by 1
            //System.out.print(x + "\n");
        }
        return x;
    }

    private static int repeatLogicalShift(int x, int count) {
        for (int i = 0; i < count; ++i) {
            x >>>= 1;    // logical shift by 1
            //System.out.print(x + "\n");
        }
        return x;
    }

    public static void main(String[] args) {
        for (int i = 8; i >= -8; --i) {
            System.out.print(toFullBinaryString(i) + ": " + i +"\n");
        }

        int x = -93242;
        int resultArithmetic = repeatArithmeticShift(x, 40);
        int resultLogical = repeatLogicalShift(x, 40);
        System.out.print(toFullBinaryString(resultArithmetic) + ": " + resultArithmetic + "\n");
        System.out.print(toFullBinaryString(resultLogical) + ": " + resultLogical + "\n");
    }


    public static String toFullBinaryString(int a) {
    
        String s = "";
        for (int i = 0; i < 32; ++i) {
            Integer lsb = new Integer(a & 1);
            s = lsb.toString() + s;
            a = a >> 1;
        }

        return s;
    }

    public static String toBaseNString(int a, int base) {
        String s = "";
        while (true) {
            int lastdigit = a % base;
            s = lastdigit + s;
            a = a / base;
            if (a == 0) break;
        }

        return s;
    }
}
