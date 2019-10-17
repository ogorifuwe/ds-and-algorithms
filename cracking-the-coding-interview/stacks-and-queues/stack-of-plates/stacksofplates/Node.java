/**.
 * File: Node.java
 * ---------------
 * A node class for a stack implementation
 */
package stacksofplates;

public class Node {
    
    protected Node above;
    protected Node below;
    protected int value;

    public Node(int value) {
        this.value = value;
    }
}
