/**.
 * File: StackWithMin1.java
 * -----------------------
 */
package stackmin;
import java.util.Stack;

public class StackWithMin1 extends Stack<NodeWithMin>{

    public void push(int value) {
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }

    public int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return peek().min;
        }
    }
}
