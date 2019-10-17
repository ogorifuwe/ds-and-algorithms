public class Solution {

  static int minIndex(int[] a) {
    if (a.length == 0)
      throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
      
    int idx = 0;

    for (int i = 1; i < a.length; ++i) {
      if (a[i] < a[idx])
        idx = i;
    }

    return idx;
  }

  static class TestDataEmpty {
    public static int[] getArray() {
      return new int[]{};
    }

  static class TestDataUniqueValues {
    public static int[] getArray() {
      return new int[]{1,2,3,4,5};
    }


    public static int getExpectedResult() {
      return minIndex(getArray());
    }
  }

  static class TestDataExactlyTwoDifferentMinimums {
    public static int[] getArray() {
      return new int[]{1,2,3,4,3,2,1};
    }

    public static int getExpectedResult() {
      return minIndex(getArray());
    }
  }
}
