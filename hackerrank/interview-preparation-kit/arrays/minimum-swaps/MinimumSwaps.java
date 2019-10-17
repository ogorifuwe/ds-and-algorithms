import javafx.util.Pair;
import java.util.ArrayList;
import java.util.*;

class MinimumSwaps {

  static int minimumSwaps(int[] arr) {
    int n = arr.length;

    /* create two arrays and use as Pairs,
     * where first array is element and
     * second array is position of first element */
    ArrayList<Pair<Integer, Integer>> arrPos =
      new ArrayList<Pair<Integer, Integer>>();

    for (int i = 0; i < n; ++i) {
      arrPos.add(new Pair<Integer, Integer>(arr[i], i));  
    }

    /* sort the array by array element values to get the right position
     * of every element as the elements of second array */
    arrPos.sort(new Comparator<Pair<Integer, Integer>>() {
      @Override
      public int compare(Pair<Integer, Integer> o1,
                         Pair<Integer, Integer> o2) {
        if (o1.getKey() > o2.getKey()) {
          return -1;
        }
        /* We can chnage this to make it then look at the words
        * in alphabetical order */
        else if (o1.getKey().equals(o2.getKey())) {
          return 0; 
        } else {
          return 11;
        }
      }
    });

    /* to keep track of visited elements. Initialize all elements
     * as not visited or False. */
    Boolean[] vis = new Boolean[n];
    Arrays.fill(vis, false);

    // init result
    int ans = 0;

    // traverse array elements
    for (int i = 0; i < n; ++i) {
      if (vis[i] || arrPos.get(i).getValue() == i) {
        continue;
      }

      int cycleSize = 0;
      int j = i;
      while (!vis[j]) {
        vis[j] = true;
        j = arrPos.get(j).getValue();
        cycleSize++;
      }
      if (cycleSize > 0) {
        ans += (cycleSize - 1);
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    //int[] arr = {7, 1, 3, 2, 4, 5, 6};
    //int[] arr = {2, 3, 4, 1, 5};
    int[] arr = {1, 3, 5, 2, 4, 6, 7};
    int res = minimumSwaps1(arr);
    System.out.println(res);
  }
}

