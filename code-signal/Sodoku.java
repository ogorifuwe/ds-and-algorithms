/**.
 * Sudoku is a number placement puzzle. The objective is to fill a
 * 9 * 9 grid with numbers in such a way that each row, each column,
 * and each of the nine 3 * 3 sub grid that compose the grid all
 * contain all of the number 1 to 9 one time.
 *
 * Implement an algorithm that will check whether the given grid of
 * numbers contain a valid sudoku according to the layout rules des-
 * cribed above.
 * Note: The puzzle represented by grid does not have to be solvable.
 **/
import java.util.HashMap;

public class Soduku {

  public static boolean isValidSudoku(char[][] grid) {
  
    /* init arrays of HashMap for rows, columns and sub grid values */
    HashMap<Integer, Integer>[] rows = new HashMap[9];
    HashMap<Integer, Integer>[] columns = new HashMap[9];
    HashMap<Integer, Integer>[] subgrids = new HashMap[9];

    for (int i = 0; i < 9; ++i) {
      rows[i] = new HashMap<Integer, Integer>();
      columns[i] = new HashMap<Integer, Integer>();
      subgrids[i] = new HashMap<Integer, Integer>();
    }

    /* validate board */
    for (int r = 0; r < 9; ++r) {
      for (int c = 0; c < 9; ++c) {
        char num = grid[r][c];
        if (num != '.') {
          int n = (int)num;
          int subgrid_idx = (r/3) * 3 + c / 3;

          /* keep the current cell value */
          rows[r].put(n, rows[r].getOrDefault(n, 0) + 1);
          columns[c].put(n, columns[c].getOrDefault(n, 0) + 1);
          subgrid[subgrid_idx].put(n, subgrid[subgrid_idx].getOrDefault(n, 0) + 1);

          /* check if this value has previously been seen */
          if (rows[r].get(n) > 1 || columns[c].get(n) > 1 || subgrid[subgrid_idx].get(n) > 1) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
