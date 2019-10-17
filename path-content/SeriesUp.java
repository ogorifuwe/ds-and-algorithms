public class SeriesUp {

  public static int[] seriesUp(int n) {
    int[] result = new int[(int) ((((n*n)+n)/2))];
    int k = 0;
    for (int i = 0; i <= n; ++i) {
      for (int j = 1; j < (i+1); ++j) {
        result[k] = j;
        k++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int n = 4;
    int[] result = seriesUp(n);
    String res = java.util.Arrays.toString(result);
    System.out.println(res);
  }
}
