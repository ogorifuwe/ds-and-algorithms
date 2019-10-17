/**. File: CheckBalancedUtility.java
 * ---------------------------------
 */
package checkbalanced;

public class CheckBalancedUtility {

    public static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int randomIntInRange(int min, int max) {
        return randomInt(max + 1 - min) + min;
    }
}
