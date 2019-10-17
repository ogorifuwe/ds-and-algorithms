import stackmin.*;

public class TestStackMin {

    public static void main(String[] args) {
    
        StackWithMin1 stack1 = new StackWithMin1();
        StackWithMin2 stack2 = new StackWithMin2();
        int[] arr = {2, 1, 3, 1};
        for (int value : arr) {
            stack1.push(value);
            stack2.push(value);
            System.out.print(value + ", ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print("Popped " + stack1.pop().value + ","
                    + stack2.pop()+"\n");
            System.out.print("New min is " + stack1.min() + ", "
                    + stack2.min()+"\n");
        }
    }
}
