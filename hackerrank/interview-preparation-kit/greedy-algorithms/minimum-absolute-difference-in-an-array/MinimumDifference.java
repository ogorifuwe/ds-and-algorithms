import java.util.Arrays;

class MinimumDifference {

  static int minimumDifference(int[] arr) {
    
    int n = arr.length;
    int[] dp = new int[n];
    dp[0] = arr[0];

   int absMin = Integer.MAX_VALUE;

    for (int i = 1; i < n; ++i) {
      dp[i] = Math.abs(Math.min(dp[i-1], 0) - arr[i]);
      absMin = Math.min(absMin, dp[i]);
    }
    return absMin;
  }

  static int minimumDifference1(int[] arr) {
    Arrays.sort(arr);
    int k = Integer.MAX_VALUE;
    for (int i = arr.length-1; i > 0; --i) {
      if (arr[i] - arr[i-1] == 0) return 0;
      if (arr[i] - arr[i-1] < k) {
        k = arr[i] - arr[i-1];
      }
    }
    return k;
  }

  public static void main(String[] args) {
    //int[] arr = {3, -7, 0};
    int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
    int res = minimumDifference1(arr);
    System.out.println(res);
  }
}
