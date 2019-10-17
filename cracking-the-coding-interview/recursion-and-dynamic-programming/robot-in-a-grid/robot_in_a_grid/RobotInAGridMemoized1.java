package robot_in_a_grid;
import java.util.ArrayList;
import java.util.HashSet;

public class RobotInAGridMemoized1 {

    public static ArrayList<Point> getPath(boolean[][] maze) {
        if (maze == null || maze.length == 0) return null;
        ArrayList<Point> path = new ArrayList<Point>();
        HashSet<Point> failedPoints = new HashSet<Point>();
        if (getPath(maze, maze.length-1, maze[0].length-1, path, failedPoints)) {
            return path;
        }
        return null;
    }

    public static boolean getPath(boolean[][] maze, int row, int col,
                        ArrayList<Point> path, HashSet<Point> failedPoints) {
        /* if out of bounds, or point is not available, return false */
        if (col < 0 || row < 0 || !maze[row][col]) return false;

        Point p = new Point(row, col);
        if (failedPoints.contains(p)) {
            return false;
        }

        boolean isAtOrigin = ((row == 0) && (col == 0));
        if (isAtOrigin || getPath(maze, row, col, path, failedPoints)) {
            path.add(p);
            return true;
        }

        failedPoints.add(p);    // cache result
        return false;
    }
}
