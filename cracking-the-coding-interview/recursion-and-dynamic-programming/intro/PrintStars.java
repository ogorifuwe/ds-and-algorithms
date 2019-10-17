public class PrintStars {

    public static void main(String[] args) {
        printStars(10); // iterative
        System.out.print("\n");
        printStars1(10); // recursive
        System.out.print("\n");
    }

    /* iterative */
    private static void printStars(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print("*");
        }
    }
    
    /* recursive */
    private static void printStars1(int n) {
        if (n == 1) {
            System.out.print("*");
        } else {
            System.out.print("*");
            printStars1(n-1);
        }
    }
}
