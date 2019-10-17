//package recursive_multiply;

public class RecursiveMultiply2 {

    public static int minProduct(int a, int b) {
        int smaller = a < b ? a : b;
        int bigger = a < b ? b : a;
        return minProductHelper(smaller, bigger);
    }

    public static int minProductHelper(int smaller, int bigger) {
        if (smaller == 0) return 0;
        else if (smaller == 1) return bigger;

        int s = smaller >> 1; // divide by 2
        int halfProd = minProductHelper(s, bigger);

        if (smaller % 2 == 0)
            return halfProd + halfProd;
        else
            return halfProd + halfProd + bigger;
    }

    public static void main(String[] args) {
        int a = 13494;
        int b = 22323;
        
        int product = a * b;
        int minProduct = minProduct(a, b);
        
        if (product == minProduct) {
            System.out.print("Success: " + a + " * " + b + " = " + product +"\n");
        } else {
            System.out.print("Failure: " + a + " * " + b + " = " + product
                    + " instead of " + minProduct +"\n");
        }
    }
}
