/**.
 * File: Stack.java
 * ----------------
 * An implementation of stack data structure for stack of plates algorithm
 */
package stacksofplates;
import java.util.EmptyStackException;

public class Stack {
    
    protected int capacity;
    protected Node top;
    protected Node bottom;
    protected int size = 0;

    /**. 
     * @post initializes a new stack with capacity
     * @param capacity is the maximum number of plates
     * the stack can hold
     */
    public Stack(int capacity) {
        this.capacity = capacity;
    }

    /**.
     * @retun true iff the stack is at full capacity 
     */
    public boolean isFull() {
        return capacity == size;
    }

    /**.
     * @post creates reference the nodes(plates) in the stack
     * @param above is the node(plate) above/ontop another
     * @param below is the node(plate) below/underneath another
     */
    public void join(Node above, Node below) {
        if (below != null) below.above = above;
        if (above != null) above.below = below;
    }

    /**.
     * @pre stack is not full
     * @post increments the size of the stack by 1 and adds a node(plate)
     * to the top of the stack. Node(plate) is next to be removed(popped)
     * from stack if no intervening push.
     * @return true iff the node was successfully added to stack
     */
    public boolean push(int v) {
        if (size == capacity) return false;
        /* increment size of stack*/
        size++;
        Node n = new Node(v);   // initialize node
        /* add node to stack */
        if (size == 1) bottom = n;
        join(n, top);
        top = n;
        return true;
    }

    /**.
     * @pre stack is not empty
     * @post removes node(plate) from the stack, decrements the size by 1
     * @return value of the node(plate) removed from stack
     */
    public int pop() {
        if (top == null) throw new EmptyStackException();
        Node temp = top;
        top = top.below;
        size--;
        return temp.value;
    }

    /**.
     * @return true iff the stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**.
     * @post removes the node(plate) at the bottom of stack and 
     * decrements size by 1
     * @return value of the node(plate) removed from stack
     */
    public int removeBottom() {
        Node temp = bottom;
        bottom = bottom.above;
        if (bottom != null) bottom.below = null;
        size--;
        return temp.value;
    }

}
