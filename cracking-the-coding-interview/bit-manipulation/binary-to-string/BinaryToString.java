public class BinaryToString {

    public static String printBinary1(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }

        StringBuilder binary = new StringBuilder();
        binary.append(".");
        while (num > 0) {
            /* setting a limit on length: 32 characters */
            if (binary.length() > 32) {
                return "ERROR";
            }
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

    public static String printBinary2(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }

        StringBuilder binary = new StringBuilder();
        double frac = 0.5;
        binary.append(".");
        while (num > 0) {
            /* setting a limit on length: 32 characters */
            if (binary.length() >= 32) {
                return "ERROR";
            }
            if (num >= frac) {
                binary.append(1);
                num -= frac;
            } else {
                binary.append(0);
            }
            frac /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        String bs = printBinary1(.125);
        System.out.print(bs+"\n");

        for (int i = 0; i < 1000; ++i) {
            double num = i / 1000.0;
            String binary1 = printBinary1(num);
            String binary2 = printBinary2(num);
            if (!binary1.equals("ERROR") || !binary2.equals("ERROR")) {
                System.out.print(num + ": " + binary1 + " " + binary2+"\n");
            }
        }
    }
}
