/**.
 * File: RotateMatrix.java
 * -----------------------
 * This program is used to rotate a matrix by 90 degrees.
 * Please see README.md for details of algorithm.
 * ------------------------------------------
 * | Compilation: javac RotateMatrix.java   |
 * | Execution:   java RotateMatrix         |
 * ------------------------------------------
 */
import java.util.*;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = randomMatrix(5,5,0,9);
        printMatrix(matrix1);
        System.out.print("\n");
        rotate(matrix1);
        System.out.print("\n");
        printMatrix(matrix1);
        System.out.print("\n");

        int[][] matrix2 = randomMatrix(4,4,0,9);
        printMatrix(matrix2);
        System.out.print("\n");
        rotate(matrix2);
        System.out.print("\n");
        printMatrix(matrix2);
        System.out.print("\n");
    }

    /**.
     * This method rotates an N*N matrix by 90 degrees. 
     * @pre matrix is an N*N.
     * @post Rotates parsed matrix by 90 degrees.
     * @param matrix Is the 2D matrix to be rotated by 90 degrees
     * @return Returns true iff matrix was rotated by 90 degrees.
     */
    private static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i]; // save top

                /* left -> top */
                matrix[first][i] = matrix[last - offset][first];

                /* bottom -> left */
                matrix[last - offset][first] = matrix[last][last - offset];

                /* right -> bottom */
                matrix[last][last - offset] = matrix[i][last];

                /* top -> right */
                matrix[i][last] = top;  // right <- saved top
            }
        }
        return true;
    }

    /**. Prints the matrix to console */
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] < 10 && matrix[i][j] > -10) {
                    System.out.print(" ");
                }
                if (matrix[i][j] < 100 && matrix[i][j] > -100) {
                    System.out.print(" ");
                }
                if (matrix[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(" " + matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    private static int[][] randomMatrix(int M, int N, int min, int max) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                matrix[i][j] = randomIntInRange(min, max);
            }
        }
        return matrix;
    }

    private static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    private static int randomIntInRange(int min, int max) {
        return randomInt(max + 1 - min) + min;
    }
}
