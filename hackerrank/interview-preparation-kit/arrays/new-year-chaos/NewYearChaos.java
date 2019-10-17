class NewYearChaos {

  // wrong naive soln...failed test cases on hacker rank
  /*static void minimumBribes(int[] q) {
    
    int count = 0, len = q.length;

    for (int i = 0; i < len; ++i) {
      if (i < len-1) {
        
        if (q[i] > q[i+1] && q[i] - q[i+1] > 2) {
          System.out.println("Too Chaotic");
          return;
        } else if (q[i] > q[i+1]) {
          ++count;
        }
      }
    }

    System.out.println(count);
    return;
  }*/

  static void minimumBribes1(int[] q) {
    int bribes = 0, len = q.length;

    for (int i = len-1; i >= 0; --i) {
      if (q[i] - (i+1) > 2) {
        System.out.println("Too chaotic");
        return;
      }

      for (int j = Math.max(0, q[i]-2); j < i; ++j) {
        if (q[j] > q[i]) {
          ++bribes;
        }
      }
    }
    System.out.println(bribes);
    return;
  }

  public static void main(String[] args) {
    int[] q = {2, 5, 1, 3, 4};
    //int[] q = {2, 1, 5, 3, 4};
    minimumBribes1(q);
  }
}
