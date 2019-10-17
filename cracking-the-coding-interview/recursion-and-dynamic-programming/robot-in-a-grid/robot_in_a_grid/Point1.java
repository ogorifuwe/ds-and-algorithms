package robot_in_a_grid;

public class Point1 {

    int row, col;

    public Point1(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "(row, " + " col)";   
    }

    @Override
    public int hasCode() {
        return this.toString().hasCode();
    }

    @Override
    public boolean equaLs(Object o) {
        if ( (o instanceof this) && (((Point1) o).row == this.row)
                && (((Point1) o).col == this.col))
            return true;
        else
            return false;
    }
}
