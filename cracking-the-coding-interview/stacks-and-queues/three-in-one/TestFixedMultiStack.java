/**.
 * File: TestFixedMultiStack.java
 * ------------------------------
 * Tests the algorithm implemented in FixedMultiStack
 * See FixedMultiStack.java for details.
 * ------------------------------------------------------------------
 * | To Compile: javac TestFixedMultiStack.java                     |
 * | To Run:    java      TestFixedMultiStack                       |
 * ------------------------------------------------------------------
 */
import threeinone.*;

public class TestFixedMultiStack {
    
    public static void printStacks(FixedMultiStack stacks) {
        System.out.print(arrayToString(stacks.getValues())+"\n");
    }

    public static void main(String[] args) throws FullStackException {
        FixedMultiStack stacks = new FixedMultiStack(4);
        printStacks(stacks);
        stacks.push(0, 10);
        printStacks(stacks);
        stacks.push(1, 20);
        printStacks(stacks);
        stacks.push(2, 30);
        printStacks(stacks);
        
        stacks.push(1, 21);
        printStacks(stacks);
        stacks.push(0, 11);
        printStacks(stacks);
        stacks.push(0, 12);
        printStacks(stacks);

        stacks.pop(0);
        printStacks(stacks);

        stacks.push(2, 31);
        printStacks(stacks);

        stacks.push(0, 13);
        printStacks(stacks);
        stacks.push(1, 22);
        printStacks(stacks);

        stacks.push(2, 31);
        printStacks(stacks);
        stacks.push(2, 32);
        printStacks(stacks);
    }

    static String arrayToString(int[] arr) {
        if (arr == null) return "";
        return arrayToString(arr, 0, arr.length-1);
    }

    static String arrayToString(int[] arr, int start, int end) {
        StringBuffer sb = new StringBuffer();
        for (int i = start; i <= end; ++i) {
            int v = arr[i];
            sb.append(v + ", ");
        }
        return sb.toString();
    }
}
