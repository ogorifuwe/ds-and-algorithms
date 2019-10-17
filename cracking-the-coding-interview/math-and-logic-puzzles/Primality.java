/**.
 * File: Primality.java
 * --------------------
 * This class is used to check if a number is a Prime.
 * Prime: A number that is only divisible by itself and 1.
 **/
public class Primality {

    private static boolean isPrime1(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; ++i) {
            if ((n % i) == 0)
                return false;
        }

        return true;
    }

    private static boolean isPrime2(int n) {
        if (n < 2) return false;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i < sqrt; ++i) {
            if ((n % i) == 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        /* call to isPrime1 */
        int num1 = 54;
        System.out.print(isPrime1(num1)+"\n");
        
        /* call to isPrime2 */
        int num2 = 67;
        System.out.print(isPrime2(num2)+"\n");
    }
}
