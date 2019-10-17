/**.
 * File: TestMultiStack.java
 * -------------------------
 */
import threeinone.*;
import CtCILibrary.AssortedMethods;
public class TestMultiStack {
    
    public static void printStacks(MultiStack stacks) {
        System.out.print(stacks.stackToString(0)+"\n");
        System.out.print(stacks.stackToString(1)+"\n");
        System.out.print(stacks.stackToString(2)+"\n");
        System.out.print(AssortedMethods.arrayToString(stacks.getValues())+"/n");
    }

    public static void main(String[] args) throws Exception {
        MultiStack stacks = new MultiStack(3, 4);
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
        stacks.push(2, 12);
        printStacks(stacks);

        stacks.pop(0);
        printStacks(stacks);

        stacks.push(0, 13);
        printStacks(stacks);
        stacks.push(1, 22);
        printStacks(stacks);

        stacks.push(2, 31);
        printStacks(stacks);
        stacks.push(2, 32);
        printStacks(stacks);
        stacks.push(2, 33);
        printStacks(stacks);
        stacks.push(2, 34);
        printStacks(stacks);

        stacks.pop(1);
        printStacks(stacks);
        stacks.push(2, 35);
        printStacks(stacks);

        System.out.print("Final Stack: " + AssortedMethods.arrayToString(stacks.getValues())+"\n");
    }
}
