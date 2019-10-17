class LeftRotation {

  static int[] leftRotation(int[] a, int d) {
    int size = a.length;
    int[] rotatedArr = new int[size];

    int i = 0, rIdx = d;
    while (rIdx < size) {
      rotatedArr[i] = a[rIdx];
      ++i;
      ++rIdx;
    }

    System.out.println(java.util.Arrays.toString(rotatedArr));
    System.out.println("i: "+i);
    System.out.println("rIdx: "+rIdx);

    rIdx = 0;
    while (rIdx < d) {
      rotatedArr[i] = a[rIdx];
      ++i;
      ++rIdx;
    }

    System.out.println("i: "+i);
    System.out.println("rIdx: "+rIdx);
    System.out.println(java.util.Arrays.toString(rotatedArr));
    return rotatedArr;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int d = 2;
    int[] res = leftRotation(a, d);
    System.out.println(java.util.Arrays.toString(res));
  }
}
