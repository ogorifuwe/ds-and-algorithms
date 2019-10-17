class Solution {

  private static void solution(int[][] arr) {
    
    int maxSum = Integer.MIN_VALUE, tmpSum = 0;

    for (int i = 1; i < 5; ++i) {
      for (int j = 1; j < 5; ++j) {
        tmpSum = (arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]) +
                                (arr[i][j]) +
                 (arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]); 
        maxSum = maxSum < tmpSum ? tmpSum : maxSum;
        tmpSum = 0;
      }
    }
    System.out.print(maxSum+"\n");
  }

  public static void main(String[] args) {
    
    java.utilScanner stdIn = new java.util.Scanner(System.in);

    int[][] arr = new int[6][6];
    
    for (int i = 0; i < 6; ++i) {
      String[] arrRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < 6; ++j) {
        int arritem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }
    }

    solution(arr);
    stdIn.close();
  }

}
