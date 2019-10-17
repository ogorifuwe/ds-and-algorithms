/**.
 * File: MyQueue.java
 * ------------------
 */
import java.util.Stacks;

public class MyQueue {

    Stack<T> stackNewest, stackOldest;

    public MyQueue() {
        stacknewest = new Stack<T>();
        stackOldest = new Stack<T>();
    }

    public int size() {
        return stackNewest.size() + stackOldest.size();
    }

    public void add(T value) {
        // push onto stack1
        stackNewest.push(value);
    }

    /* move elements from stackNewest into stackOldest,
     * this is done so that we can do operations on stackOldest */
    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public T peek() {
        shiftStacks();
        return stackOldest.peek();  // retrieve the oldest item.
    }

    public T remove() {
        shiftStacks();
        return stackOldest.pop();   // pop the oldest item.
    }
}
