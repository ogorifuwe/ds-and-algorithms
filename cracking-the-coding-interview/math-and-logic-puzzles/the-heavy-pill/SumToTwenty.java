public class SumToTwenty {

    private static int sumToNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; ++i) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        System.out.print(sumToNumber(20)+"\n");
    }
}
