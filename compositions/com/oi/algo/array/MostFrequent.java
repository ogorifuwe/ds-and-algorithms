import java.util.Map;
import java.util.HashMap;

class MostFrequent {

  public static void main(String[] args) {
    
    int[] tstArr = { 1, 3, 1, 3, 2, 1 };

    int[] tstArr1 = { 3, 3, 1, 3, 2, 1 };

    int[] tstArr2 = {};

    int[] tstArr3 = { 0 };

    int[] tstArr4 = { 0, -1, 10, 10, -1, 10, -1, -1, -1, 1 };

    int res = mostFrequent(tstArr);
    int res1 = mostFrequent(tstArr1);
    int res2 = mostFrequent(tstArr2);
    int res3 = mostFrequent(tstArr3);
    int res4 = mostFrequent(tstArr4);

    System.out.println("res: " + res);
    System.out.println("res1: " + res1);
    System.out.println("res2: " + res2);
    System.out.println("res3: " + res3);
    System.out.println("res4: " + res4);
  }
  
  public static int mostFrequent(int[] numArr) {
    
    int maxCount = -1, mostFrequentItem = Integer.MIN_VALUE;
    Map<Integer, Integer> numCount = new HashMap<>();

    for (int i = 0; i < numArr.length; ++i) {
      if (numCount.containsKey(numArr[i])) {
        int val = numCount.get(numArr[i]);
        numCount.put(numArr[i], ++val);
      } else {
        numCount.put(numArr[i], 1);
      }

      if (numCount.get(numArr[i])  > maxCount) {
        maxCount = numCount.get(numArr[i]);
        mostFrequentItem = numArr[i];
      }

    }

    return mostFrequentItem;
  }
}
