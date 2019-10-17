import java.util.List;
import java.util.LinkedList;

class MyStack {
  
  static List stack;

  public MyStack() {
    stack = new LinkedList();
  }

  static boolean isEmpty() {
    return stack.isEmpty();
  }

  static int size() {
    return stack.size();
  }

  static void push(int val) {
    stack.add(val);
  }

  static int pop() {
    int idx = stack.size()-1;
    return (int)stack.remove(idx);
  }

  static int peek() {
    int top = stack.size()-1;
    return (int)stack.get(top);
  }

  public static void main(String[] args) {
    MyStack ms = new MyStack();

    ms.push(1);
    ms.push(2);
    ms.push(3);
    System.out.println(ms.pop());
    System.out.println(ms.pop());
    System.out.println(ms.isEmpty());
    System.out.println(ms.size());
  }
}
