public class AlmostIncreasingSequence {

  static boolean almostIncreasingSequence(int[] s) {
    int count = 0;
    java.util.Set<Integer> set = new java.util.HashSet<Integer>();

    for (int i = 0; i < s.length-1; ++i) {
      System.out.println("sequence[" + i + "] = " + s[i]);
      if (set.contains(s[i]) && s[i] >= s[i+1]) {
        count++;
        System.out.println("count = " + count);
      }
      set.add(s[i]);
    }

    if (count >= 1) {
      return false;
    }

    return true;
  } 

  static boolean almostIncreasingSequence1(int[] s) {
    int start = 0;
    int end = s.length-1;
    int count = 0;

    while (end > start) {
      System.out.println("start: " + s[start] + " end: " + s[end]);
      if (s[start] >= s[end] || s[start] > s[start+1] || s[end-1] > s[end]) {
        count++;
        System.out.println("count: " + count);
      }
      start++;
      end--;
    }
    
    System.out.println("final count val: " + count);
    if (count < 1) {
      return true;
    }

    return false;
  }

  static int findDecreasingElement(int[] sequence) {
    for (int i = 1; i < sequence.length; ++i) {
      if (sequence[i-1] >= sequence[i]) {
        return i;
      }
    }

    return sequence.length;
  }

  int increasingCount = findDecreasingElement(sequence);
  if (increasingCount == sequence.length) {
    /* the whole sequence is increasing */
    return true;
  }

  /* if increasingCout is 1, then we can't check index -1
   * but the desired relationship is true */
  if (increasingCount == 1 || sequence[increasingCount-2] < sequence[increasingCount]) {
    /* the element at increasingCount - 1 is exceptionally big, so remove that */
    return findDecreasingElement(sequence, increasingCount) == sequence.length;
  }

  if (sequence[increasingCount-1] < sequence[increasingCount+1]) {
      /* the element at increasingCount is exceptionally small, so remove it */
      return findDecreasingElement(sequence, inceasingCount+1) == sequence.length;
  }

  /* neither removing at increasingCount-1 nor increasingCount helps */
  return false;

  /* we now have tweo simple problems. we find the longest strictly increasing
   * sequence from start. if that's the whole sequence, we're done. if not, we check
   * to see if we can delete either of the offending elements. if we can, check if the
   * remainder of the sequence is increasing. */

  static int findDecreasingElement(int[] sequence, int start) {
    for (int i = start+1; i < sequence.length; ++i) {
      if (sequence[i-1] >= sequence[i]) {
        return i;
      }
    }
    /* if there are no deceasing elements, return the index of the end */
    return sequence.length;
  }

  static int findDecreasingElement(int[] sequence) {
    return findDecreasingElement(sequence, 0);
  }
  

  public static void main(String[] args) {
    //int[] arr = {40, 50, 60, 10, 20, 30};
    //int[] arr = {1, 2, 1, 2};
    //int[] arr = {3, 6, 5, 8, 10, 20, 15};
    //int[] arr = {1, 3, 2, 1};
    //int[] arr = {1, 3, 2};
    int[] arr = {1, 4, 10, 4, 2};
    boolean ais = almostIncreasingSequence1(arr);
    System.out.print(ais + "\n");
  }
}
