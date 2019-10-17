package binarymethods;

public class BinaryMethods {
    
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
            int lastDigit = a % base;
            s = lastDigit + s;
            a = a / base;
            if (a == 0) break;
        }

        return s;
    }
}
