public class RM1 {

    public static void main(String[] args) {
        int[][] matrix = initMatrix(4, 0, 9);
        printMatrix(matrix);
        System.out.print("\n");
        rotateMatrix90Clockwise(matrix);
        printMatrix(matrix);
        System.out.print("\n");
        //rotateMatrix90AntiClockwise(matrix);
        //printMatrix(matrix);
        //System.out.print("\n");
        rotateMatrix180Clockwise(matrix);
        printMatrix(matrix);

    }

    private static boolean rotateMatrix180Clockwise(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;
        for (int layer = 0; layer < n/2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i];
                int right = matrix[i][last];
                
                // move bottom to top
                matrix[first][i] = matrix[last][last-offset];
                
                // move top to bottom
                matrix[last][last-offset] = top;

                // move left to right
                matrix[i][last] = matrix[last-offset][first];

                // move right to left
                matrix[last-offset][first] = right; 
            }
        }
        return true;
    }

    private static boolean rotateMatrix90Clockwise(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;
        for (int layer = 0; layer < n/2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i];

                /* move left layer to top layer */
                matrix[first][i] = matrix[last-offset][first];

                /* move bottom layer to left layer */
                matrix[last-offset][first] = matrix[last][last-offset];

                /* move right layer to bottom layer */
                matrix[last][last-offset] = matrix[i][last];

                /* move top layer to right layer */
                matrix[i][last] = top;
            }
        }
        return true;
    }

    private static boolean rotateMatrix90AntiClockwise(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        
        int n = matrix.length;
        for (int layer = n ; layer > n/2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                //int top = matrix[first][i];
                int top = matrix[first][last-offset];

                /* move right layer to top layer */
                //matrix[first][i] = matrix[i][last];
                matrix[first][last-offset] = matrix[last-offset][last];

                /* move bottom layer to right layer */
                //matrix[i][last] = matrix[last][last-offset];
                matrix[last-offset][last] = matrix[last][i];
                
                /* move left layer to bottom layer */
                //matrix[last][last-offset] = matrix[last-offset][first];
                matrix[last][i] = matrix[last-offset][first];

                /* move top layer to left layer */
                //matrix[last-offset][first] = top;
                matrix[last-offset][first] = top;
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

    private static int[][] initMatrix(int N, int min, int max) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
               matrix[i][j] = randomInt(min, max);
            }
        }
        return matrix; 
    }

    private static int randomInt(int min, int max) {
        java.util.Random rgen = new java.util.Random();
        return rgen.nextInt(max + 1) + min;
    }
}
