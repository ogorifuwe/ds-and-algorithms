public class ZM {

    private static final int M = 5;
    private static final int N = 4;
    private static final int MIN = 0;
    private static final int MAX = 9;

    public static void main(String[] args) {
        int[][] matrix = initMatrix();
        printMatrix(matrix);
        System.out.print("\n");

        nullifyMatrix(matrix);
        printMatrix(matrix);
        System.out.print("\n");
    }

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
    

        /* nullify row */
        for (int i = 0; i < row.length; ++i) {
            if (row[i]) nullifyRow(matrix, i);
        }

        /* nullify column */
        for (int j = 0; j < col.length; ++j) {
            if (col[j]) nullifyColumn(matrix, j);
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; ++j) {
            matrix[row][j] = 0;
        }
    }

    private static void nullifyColumn(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; ++i) {
            matrix[i][col] = 0;
        }
    }


    private static int[][] initMatrix() {
        int[][] matrix = new int[M][N];
        
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                matrix[i][j] = randomInt();
            }
        }
        return matrix;
    }

    private static int randomInt() {
        java.util.Random rgen = new java.util.Random();
        return rgen.nextInt(MAX + 1) + MIN;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
