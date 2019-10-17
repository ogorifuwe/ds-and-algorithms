package robots_in_a_grid;
import java.util.ArrayList;

public class RobotInAGrid {
    
    public static ArrayList<Point1> getPath(boolean[][] maze) {
        if (maze == null || maze.length-1 < 0 || maze[0].length < 0)
            return null;
        ArrayList<Point1> path = new ArrayList<Point1>();
        if (getPath(maze, maze.length-1, maze[0].length-1, path)) {
            return path;
        } else {
            return null;
        }
    }

    public static boolean getPath(boolean maze, int row, int col,
                                                ArrayList<Point1> path) {
        /* if out of bounds or not avaiable, return false */
        if (row < 0 || col < 0 || !maze[row][col])
           return false;
        
        boolean isAtOrigin = ((row == 0) && (col == 0)); 
        /* check if path is available, add path and return true if it is,
         * return false otherwise */
        if (isAtOrigin || getPath(maze, row, col-1, path)
                                    || getPath(maze, row-1, col, path)) {
            path.add(row, col);
            return true;            
        } else {
            return false;
        }
    } 
}
