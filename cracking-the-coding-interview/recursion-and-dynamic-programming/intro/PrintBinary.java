/**.
 * Prints the given integer's binary representation
 * Example: printBinary(43) outputs 101011
 **/
public class PrintBinary {

    public static void main(String[] args) {
    
        printBinary(-43);
        System.out.print("\n");
        printBinary(2);
        System.out.print("\n");
        printBinary(43);
        System.out.print("\n");
        printBinary(-500);
        System.out.print("\n");
    }

    private static void printBinary(int n) {
        if (n < 0) {
            System.out.print("-");
            printBinary(-n);
        }
        else if (n < 2) {
            System.out.print(n);
        } else {
            int lastDigit = n % 2;
            int restOfDigits = n / 2;
            printBinary(lastDigit);
            printBinary(restOfDigits);
        }
    }
}
