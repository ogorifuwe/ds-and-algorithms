public class CommonBitTasks {

    /**. Get Bit */
    static boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    static int setBit(int num, int i) {
        return num | (1 << i);
    }

    static int clearBit(int num, int i) {
         int mask = ~(1 << i);
         return num & mask; 
    }

    static int clearBitsMSBthroughI(int num, int i) {
        int mask = (1 << i) - 1;
        return num & mask;
    }

    static int clearBitsIthrough0(int num, int i) {
        int mask = (-1 << (i + 1));
        return num & mask;
    }

    static int updateBit(int num, int i, boolean bitIs1) {
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }

    public static void main(String[] args) {
         int number = 59;
         System.out.print("Testing with number: " + number +"\n");

        /* call to get bit */
        System.out.print("Get Bit\n");
        System.out.print(toFullBinaryString(number) + "\n");
        for (int i = 31; i >=0; --i) {
            int res = getBit(number, i) ? 1 : 0;
            System.out.print(res);
        }

        /* call to update bit */
        System.out.print("\n\nUpdate Bit\n");
        int num1 = 1578;    // arbitrary number
        for (int i = 31; i >= 0; --i) {
            num1 = updateBit(num1, i, getBit(number, i));
        }
        System.out.print(num1 + "\n");

        /* set and clear bit */
        System.out.print("\nSet and Clear Bit\n");
        int num2 = 1578;    // arbitrary number
        for (int i = 31; i >= 0; --i) {
            if (getBit(number, i)) {
                num2 = setBit(num2, i);
            } else {
                num2 = clearBit(num2, i);
            }
        }
        System.out.print(num2 + "\n");

        /* clear bits MSB through i */
        number = 13242352;
        int clearMSBThrough = 4;
        System.out.print("\nClear bits MSB through " + clearMSBThrough + "\n");
        System.out.print(toFullBinaryString(number)+"\n");
        int num3 = clearBitsMSBthroughI(number, clearMSBThrough);
        System.out.print(toFullBinaryString(num3) + "\n");

        /* clear bits i through 0 */
        int clearToLSB = 2;
        System.out.print("\nClear bits " + clearToLSB + " through 0\n");
        number = -1;
        System.out.print(toFullBinaryString(number) + "\n");
        int num4 = clearBitsIthrough0(number, clearToLSB);
        System.out.print(toFullBinaryString(num4) + "\n");
        
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
}
