public class Mystery {

    public static void main(String[] args) {
        System.out.print(mystery(648)+"\n");
    }

    private static int mystery(int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            return mystery(a + b);
        }
    }
}
