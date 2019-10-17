import java.util.*;

public class RM {
    
    private static final int N = 5;
    private static final int MIN = 0;
    private static final int MAX = 9;
    public static void main(String[] args) {
        //rotateNinetyDegrees(matrix);
        int[][] matrix1 = initMatrix();
        printMatrix(matrix1);
        System.out.print("\n");
        rotate(matrix1);
        printMatrix(matrix1);
        System.out.print("\n");
    }

    private static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;
        for (int layer = 0; layer < n/2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i];

                // move left to top
                matrix[first][i] = matrix[last-offset][first];
                // move bottom to left
                matrix[last-offset][first] = matrix[last][last - offset];
                // move right to bottom
                matrix[last][last - offset] = matrix[i][last];
                // move top to right
                matrix[i][last] = top;
            }
        }   
        return true;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static int[][] initMatrix() {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                matrix[i][j] = randomInt1();
            }
        }
        return matrix;
    }

    private static int randomInt1() {
        java.util.Random rgen = new java.util.Random();
        return rgen.nextInt(MAX + 1) + MIN;
    }
}
