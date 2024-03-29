/**.
 * File: MyStack.java
 * ------------------
 * An implementation of stack data structure.
 * LIFO - Last In First Out
 */
package stacksandqueues;
import java.util.EmptyStackException;

public class MyStack<T> {
    
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }

        public T getData() { return data; }
    }

    private StackNode<T> top;

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();

        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (top == null) throw new NullStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
