import java.lang.*;
import java.util.Map;
import java.util.HashMap;

class MinStepsToOne {
  
  static int minStepsToOneRecursive(int num) {
    /* base case */
    if (num == 1) return 0;

    /* option 1: subtract 1 */
    int option = minStepsToOneRecursive(num - 1);

    /* option 2: divide by 3 */
    if (num % 3 == 0) {
      int divide3 = minStepsToOneRecursive(num / 3);
      option = Math.min(option, divide3);
    }

    /* option 3: divide by 2 */
    if (num % 2 == 0) {
      int divide2 = minStepsToOneRecursive(num / 2);
      option = Math.min(option, divide2);
    }

    return option + 1;
  }

  static int minStepsToOneMemoization(int num) {
    Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    if (cache.containsKey(num)) {
      return cache.get(num);
    }

    /* base case */
    if (num == 1) return 0;

    /* option 1: subtract */
    int option = minStepsToOneMemoization(num - 1);

    /* optioon 2: divide by 3 */
    if (num % 3 == 0) {
      int divide3 = minStepsToOneMemoization(num / 3);
      option = Math.min(option, divide3);
    }

    /* option 3: divide by 2 */
    if (num % 2 == 0) {
      int divide2 = minStepsToOneMemoization(num / 2);
      option = Math.min(option, divide2);  
    }

    cache.put(num, option + 1);
    return cache.get(num);
  }

  public static void main(String[] args) {
    int num = 1000; System.out.println("Number: "+num);
    
    /* recursive soln */
    long recSTime = System.currentTimeMillis();
    System.out.println("Recursive soln: "+minStepsToOneRecursive(num));
    long recETime = System.currentTimeMillis();
    long recRT = recETime - recSTime;
    System.out.println("recursive RT: "+recRT);

    /* memoized soln */
    long memSTime = System.currentTimeMillis();
    System.out.println("Memo soln: "+minStepsToOneMemoization(num));
    long memETime = System.currentTimeMillis();
    long memRT = memETime - memSTime;
    System.out.println("memoized RT: "+memRT);

  }
}
