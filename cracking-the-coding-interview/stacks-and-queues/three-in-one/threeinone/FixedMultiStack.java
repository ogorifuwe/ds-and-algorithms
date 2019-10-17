/**.
 * File: FixedMultiStack.java
 * --------------------------
 * We can divide the array in three equal parts and allow the
 * individuals stacks to grow in that limited space.
 * 
 * * For stack 1, we will use [0, n/3).
 * * For stack 2, we will use [n/3, 2n/3).
 * * For stack 3, we will use [2n/3, n).
 */
package threeinone;
import java.util.EmptyStackException;

public class FixedMultiStack {
    private int numberOfStacks = 3;// the no. of stacks in array
    private int stackCapacity;  // the capacity of individaul stack
    private int[] values;       // stacks -> value of elements of the stacks
    private int[] sizes;        // sizes of each stacks

    public FixedMultiStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    /**.
     * @pre stack is not full
     * @post adds value at the top position of the stack in consideration;
     * value is next to be pop if no intervening push
     * @param stackNum is the identifier of stack in consideration
     * @param value is the int value of element to be added to stack with
     * stackNum
     */
    public void push(int stackNum, int value) throws FullStackException {
        /* check that we have space for the next element */
        if (isFull(stackNum)) {
            throw new FullStackException();
        }

        /* increment stack pointer and then update top value */
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    /**.
     * @pre stack is not empty
     * @post removes and returns the value at the top of stack with stackNum
     * @param stackNum is the identifier of the stack in consideration
     * @return returns the value at the top of the stack with stackNum
     */
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }
        
        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];   // get top
        values[topIndex] = 0;   // clear
        sizes[stackNum]--;
        return value;
    }

    /**.
     * @param stackNum is the identifier of the stack in consideration
     *  @return Value of the element at top of stack with stackNum
     */
    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }
        return values[indexOfTop(stackNum)];
    }

    /**.
     * @param stackNum is the identifier of stack in consideration
     * @return returns true iff stack with stackNum is empty
     */
    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    /**.
     * @param stackNum is the identifier of stack in consideration
     * @return returns true iff stack with stackNum is full 
     */
    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    /**.
     * @param stackNum is the identifier of stack in consideration
     * @return index of the top of the stack with stackNum
     */
    public int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size-1;
    }

    /**. getter for values */
    public int[] getValues() {
        return values;
    }
    
    /**. reads the values of stack with stackNum to items */
    public int[] getStackValues(int stackNum) {
        int[] items = new int[sizes[stackNum]];
        for (int i = 0;  i < items.length; ++i) {
            items[i] = values[stackNum * stackCapacity + i];
        }
        return items;
    }

    public String stackToString(int stackNum) {
        int[] items = getStackValues(stackNum);
        return stackNum + ": " + arrayToString(items);
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
