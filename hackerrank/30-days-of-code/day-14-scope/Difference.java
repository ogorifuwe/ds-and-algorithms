class Difference {
  
  /*public Difference(int[] elements) {
    this.elements = elements;
  }*/

  /* O(n2) */
  /*public int computeDifference() {
    int tmp = 0;
    for (int i = 0; i < elements.length-1; ++i) {
      for (int j = i+1; j < elements.length; ++j) {
        tmp = Math.abs(elements[i] - elements[j]);
        maximumDifference = maximumDifference < tmp ? tmp : maximumDifference;
      }
    }
    return maximumDifference;
  }*/

  /* O(nlogn) */
  /*public int computeDifference1() {
    java.util.Arrays.sort(elements);
    maximumDifference = Math.abs(elements[0] - elements[arr.length-1]);
    return maximumDifference;
  }*/

  /* O(n) */
  public static int computeDifference2(int[] elements) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < elements.length; ++i) {
      max = max < elements[i] ? elements[i] : max; System.out.println(i + " max: "+max);
      min = min > elements[i] ? elements[i] : min; System.out.println(i + " min: "+min);
    }

    return Math.abs(max - min);
  }

  static void computeDifference3(int[] arr) {
    int max = 0;
    int min = 0;

    for (int i = 0; i < arr.length-1; ++i) {
      //int len = arr.length-1; System.out.println(len);
      if (arr[i] < arr[i+2]) {
        min = arr[i];
      } else {
        min = arr[i+2];
      }
      
      if (arr[i] > arr[i+1]) {
        max = arr[i];
      } else {
        max = arr[i+1];
      }
    }

    //return Math.abs(max - min);
    System.out.println("min: "+min + "\tmax: "+max);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 5};
    //int res = computeDifference3(arr);
    int res = computeDifference2(arr);
    //System.out.print(res+"\n");
  }
}
