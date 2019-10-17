/**.
 * File: TestStack.java
 * --------------------
 * Used to test Stack.java
 *
 * --------------------------------------------------------------
 * | To Compile : javac -cp ../../CtCILibrary TestStack.java    |
 * | To Run     : java TestStack                                |
 * --------------------------------------------------------------
 */
import stacksandqueues.MyStack;
import CtCILibrary.AssortedMethods;
import java.util.Stack;
import java.util.EmptyStackException;

public class TestStack {

    public static void main(String[] args) {
        int[] array = AssortedMethods.randomArray(100, -100, 100);
        MyStack<Integer> stack1 = new MyStack<Integer>();        
        Stack<Integer> stack2 = new Stack<Integer>();

        for (int a : array) {
            if (a < 0) {
                int top1, top2;
            
                try {
                    top1 = stack1.pop();
                } catch (EmptyStackException e) {
                    top1 = Integer.MIN_VALUE;
                }

                try {
                    top2 = stack2.pop();
                } catch (EmptyStackException e) {
                    top2 = Integer.MIN_VALUE;
                }

                if (top1 != top2) {
                    System.out.print("ERROR: mismatching tops\n");
                } else {
                    System.out.print("SUCCESS: matching tops: " + top1 +"\n");
                }
            } else {
                stack1.push(a);
                stack2.push(a); 
            }
        }

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int top1, top2;
            
            try {
                top1 = stack1.pop();
            } catch (EmptyStackException e) {
                top1 = Integer.MIN_VALUE;
            }

            try {
                top2 = stack2.pop();
            } catch (EmptyStackException e) {
                top2 = Integer.MIN_VALUE;
            }

            if (top1 != top2) {
                System.out.print("ERROR: mismatching tops\n");
            } else {
                System.out.print("SUCCESS: matching tops: " + top1 + "\n");
            }
        }

    }
}
