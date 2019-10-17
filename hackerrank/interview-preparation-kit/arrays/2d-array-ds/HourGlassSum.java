class HourGlassSum {


  static int hourGlassSum(int[][] arr) {
    int maxSum = Integer.MIN_VALUE;
    int tmpSum = Integer.MIN_VALUE;

    for (int i = 1; i < 5; ++i) {
      for (int j = 1; j < 5; ++j) {
        tmpSum = (arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]) +
                 (arr[i][j]) +
                 (arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]);
        maxSum = maxSum < tmpSum ? tmpSum : maxSum;
        tmpSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[][] arr = createArray(6, -9, 9);
    int res = hourGlassSum(arr);
    System.out.println(res);
  }

  /* utility function for creating 2-d array */
  static int[][] createArray(int size, int min, int max) {
    int[][] arr = new int[size][size];
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        arr[i][j] = randomIntInRange(min, max);
      }
    }
    return arr;
  }

  static int randomIntInRange(int min, int max) {
    return randomInt(max + 1 - min) + min;
  }

  static int randomInt(int n) {
    return (int)(Math.random() * n);
  }

} 
