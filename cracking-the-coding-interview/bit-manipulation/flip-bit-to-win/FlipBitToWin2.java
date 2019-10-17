public class FlipBitToWin2 {

    public static int SEQUENCE_LENGTH = 32;

    public static boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    public static int longestSequence(int n) {
        int maxSeq = 0;

        for (int i = 0; i < SEQUENCE_LENGTH; ++i) {
            maxSeq = Math.max(maxSeq, longestSequenceOf1s(n, i));
        }

        return maxSeq;
    }

    public static int longestSequenceOf1s(int n, int indexToIgnore) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < SEQUENCE_LENGTH; ++i) {
            if (i == indexToIgnore || getBit(n, i)) {
                counter++;
                Math.max(counter, max);
            } else {
                counter = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int originalNumber = Integer.MAX_VALUE;
        int newNumber = longestSequence(originalNumber);

        System.out.print(Integer.toBinaryString(originalNumber)+"\n");
        System.out.print(newNumber+"\n");
    }

    public static String toBinaryString(int n) {
        String s = "";
        for (int i = 0; i < 31; ++i) {
            Integer lsb = new Integer(n & 1);
            s = lsb + s;
            n = n >> 1;
        }

        return s;
    }
}
