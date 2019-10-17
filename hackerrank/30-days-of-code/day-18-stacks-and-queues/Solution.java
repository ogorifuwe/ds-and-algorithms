import java.util.Stack;
import java.util.Queue;

class Solution {

  static Stack<Character> stack = new Stack<Character>();
  static Queue<Character> queue = new LinkedList<Character>();

  static void pushCharacter(char ch) {
    stack.push(ch);
  }

  static void enqueueCharacter(char ch) {
    queue.add(ch);
  }

  static char popCharacter() {
    return (char)stack.pop();
  }

  static char dequeueCharacter() {
    return (char)queue.remove();
  }

  
}
