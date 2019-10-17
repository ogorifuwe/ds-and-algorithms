/**.
 * File: ZeroMatrix.java
 * ---------------------
 * If an element of an M*N matrix is 0, this program changes its entire
 * row and column to zero.
 * ------------------------------------------
 * | Compilation:   javac ZeroMatrix.java   |
 * | Execution:     java ZeroMatrix         |
 * ------------------------------------------
 */
public class ZeroMatrix {

    private static final int M = 5;
    private static final int N = 4;
    private static final int MIN = 0;
    private static final int MAX = 9;

    public static void main(String[] args) {
        int[][] matrix = initMatrix(M,N);
        printMatrix(matrix);
        System.out.print("\n");

        nullifyMatrix(matrix);
        printMatrix(matrix);
        System.out.print("\n");
    }

    /**. Solution 1
     *  This method is used to nullify the rows and columns of a matrix.
     *  @pre Length of matrix is not 0.
     *  @post Sets the rows and columns of the matrix with cells containing zero.
     *  @param matrix The matrix to be nullified.
     */
    private static void nullifyMatrix(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        /* nullify rows */
        for (int i = 0; i < row.length; ++i) {
            if (row[i]) nullifyRow(matrix, i);
        }

        /* nullify columns */
        for (int j = 0; j < col.length; ++j) {
            if (col[j]) nullifyColumn(matrix, j);
        }
    }

    /**.
     * This method sets elements in the row of a matrix to zero.
     *
     */
    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; ++j) {
            matrix[row][j] = 0;
        }
    }

    /**.
     * This method sets elements in the column of a matrix to zero.
     */
    private static void nullifyColumn(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; ++i) {
            matrix[i][col] = 0;
        }
    }

    /**.
     * Initializes a new M*N matrix
     * @param M is the size of the rows of the matrix.
     * @param N is the size of the columns of the matrix.
     * @param MIN is the mininum value of the elements of the matrix.
     * @param MAX is the maximum value of the elements of the matrix. 
     */
    private static int[][] initMatrix(int M, int N) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                matrix[i][j] = randomIntInRange(MIN, MAX);
            }
        } 
        return matrix;
    }

    private static int randomIntInRange(int MIN, int MAX) {
        java.util.Random rgen = new java.util.Random();
        return rgen.nextInt(MAX + 1) + MIN;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
