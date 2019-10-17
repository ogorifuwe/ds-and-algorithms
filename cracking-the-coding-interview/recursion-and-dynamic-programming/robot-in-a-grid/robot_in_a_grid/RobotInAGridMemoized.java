package robot_in_a_grid;
import java.util.ArrayList;
import java.util.HashSet;

public class RobotInAGridMemoized {

    public static ArrayList<Point> getPath(boolean[][] maze) {
        if (maze == null || maze.length == 0) return null;
        ArrayList<Point> path = new ArrayList<Point>();
        HashSet<Point> failedPoints = new HashSet<Point>();
        if (getPath(maze, maze.length-1, maze[0].length-1, path, failedPoints)) {
            return true;
        } else {
            false;
        }
    }

    public static boolean getPath(boolean[][] maze, int row, int col,
                        ArrayList<Point> path, HashSet<Point> failedPoints) {
        if (col < 0 || row < 0 || !maze[row][col]) return false;
        
        Point p = new Point(row, col);

        /* if we 've already visited this cell, return */
        if (failedPoints.contains(p)) {
            return false;
        }
        
        boolean isAtOrigin = ((row == 0) && (col == 0));

        /* if there's a path from start to my current locaton,
         * add my current location */
        if (isAtOrigin || getPath(maze, row, col, path, failedPoints)) {
            path.add(row, col);
            return true;
        }

        failedPoints.add(p);    // cache result
        return false;
    }
}
