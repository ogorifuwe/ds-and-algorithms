import static java.lang.System.out;

class EqualizeTheArray {

  static int equalizeTheArray(int[] arr) {
    int count = 1;
    for (int i = 0; i < arr.length-1; ++i) {
      int tmpCount = 1;
      for (int j = i+1; j < arr.length; ++j) {
          out.println("i: "+arr[i] +" j: "+arr[j]);
        if (arr[i] == arr[j]) {
          ++tmpCount; System.out.println("tmpCount: "+tmpCount);
        }
        count = count < tmpCount ? tmpCount : count; System.out.println("count: "+count);
      }
    }
    return arr.length - count;
  }

  static int equalizeTheArray1(int[] arr) {
    java.util.Arrays.sort(arr);

    int base = arr[0], count = 1;
    for (int i = 0; i < arr.length; ++i) {
      ++count;
      if (!(base == arr[i])) break;
    }

    return arr.length - count;
  }

  static int equalizeTheArray2(int[] arr) {
    int count = 1;
    java.util.Map<Integer, Integer> freq = new java.util.HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length; ++i) {
      if (!freq.containsKey(arr[i])) {
          freq.put(arr[i], 1);
      } else {
        freq.put(arr[i], freq.get(arr[i])+1);
        count = count < freq.get(arr[i]) ? freq.get(arr[i]) : count;
      }
    }
    return arr.length - count;
  }

  public static void main(String[] args) {
    int[] arr = {3, 3, 2, 1, 3};
    int res = equalizeTheArray2(arr);
    System.out.println(res);
  }
}
