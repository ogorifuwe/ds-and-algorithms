public class Playing {

    public static void main(String[] args) {
        int allOnes = ~0;
        System.out.print(toFullBinaryString(allOnes)+"\n");
    }

    static String toFullBinaryString(int a) {
        String str = "";
        Integer lsb = new Integer(a & 1);
        for (int i = 0; i < 31; ++i) {
            str = lsb.toString() + str;
            a = a >> 1;
        }
        return str;
    }
}
