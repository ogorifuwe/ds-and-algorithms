package com.oi.algo.array;

import java.util.Arrays;
/**
 * Problem Statement: Implement a function that assigns correct numbers in
 * a field of Minesweeper, which is represented as a 2 dimensional array.
 *
 * Example: The size of the field is 3*4, and there are bombs at the
 * positions[[0,0],[0,1]].
 * The resulting field should be:
 * [[-1, -1, 1, 0],
 *  [ 2,  2, 1, 0],
 *  [ 0,  0, 0, 0]]
 *
 *  Your function should return the resulting2D array after taking the following
 *  three arguments:
 *  1. bombs: A list of bombs locations. Given as an array of arrays, Assume that
 *     there are no duplicates
 *  2. numRows: The number of rows in the resulting field
 *  3. numCols: The number of columns in the resulting field
 *
 *  In the resulting field:
 *   * -1 represents that there is a bomb in that location.
 *   * 1, 2, 3..., etc represents that there are 1, 2, 3, ..., n-1, n bombs in
 *     the sorruonding cells (including diagonally adjacent cells).
 *   * 0 represents that there are no bombs in the surrounding cells.
 */
public class MineSweeper {
  
  public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
    int[][] field = new int[numRows][numCols];
    
    for (int[] bomb : bombs) {
      int rowIndex = bomb[0]; //System.out.println("rowIdex: " + rowIndex);
      int colIndex = bomb[1]; //System.out.println("colIndex: " + colIndex);
      field[rowIndex][colIndex] = -1;
      for (int i = rowIndex - 1; i < rowIndex + 2; ++i) {
        for (int j = colIndex - 1; j < colIndex + 2; ++j) {
          if (0 <= i && i < numRows &&
              0 <= j && j < numCols &&
              field[i][j] != -1) {
                ++(field[i][j]);
              }
        }
      }
    }

    return field;
  }

  public static void main(String[] args) {

    int[][] bombs1 = {{0, 2}, {2, 0}};
    int[][] field1 = mineSweeper(bombs1, 3, 3);
    System.out.println("field1: " + Arrays.deepToString(field1));
    // should retureturn:
    // [[0, 1, -1],
    //  [1, 2, 1],
    //  [-1, 1, 0]]

    int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
    //mineSweeper(bombs2, 3, 4);
    // should retureturn:
    // [[-1, -1, 2, 1],
    //  [2, 3, -1, 1],
    //  [0, 1, 1, 1]]

    int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
    //mineSweeper(bombs3, 5, 5);
    // should retureturn:
    // [[1, 2, 2, 1, 0],
    //  [1, -1, -1, 2, 0],
    //  [1, 3, -1, 2, 0],
    //  [0, 1, 2, 2, 1],
    //  [0, 0, 1, -1, 1]]
  }
}
