public class Power {

    public static void main(String[] args) {
    
        System.out.print(power(2, 3)+"\n");
        System.out.print(power1(2, 3)+"\n");
    }

    /**.
     * @pre exp > 0
     * @return base^exp
     **/
    private static int power(int base, int exp) {
    
        int result = 1;
        for (int i = 1; i <= exp; ++i) {
            result *= base;
        }
        return result;
    }

    /**.
     * @pre exp > 0
     * @return base^exp
     **/
    private static int power1(int base, int exp) {
        /* base case*/
        if (exp == 0) {
            return 1;
        /*} else if (exp == 1) {
            return base;*/
        } else {
            /* recursive case :::: 3 ^ 7 == (3 ^ 6) * (3 ^ 1) */
            return base * power1(base, exp-1);
        }
    }
}
