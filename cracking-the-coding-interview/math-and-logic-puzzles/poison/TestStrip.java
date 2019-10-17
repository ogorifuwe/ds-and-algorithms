import java.util.ArrayList;

public class TestStrip {
    
    public static int DAYS_FOR_RESULT = 7;
    private ArrayList<ArrayList<Bottle>> dropsByDay
                        = new ArrayList<ArrayList<Bottle>>();
    private int id;

    public TestStrip(int id) {
        this.id = id;
    }

    public int getId() { return id; }

    /* resize list of days/drops to be large enough */
    private void sizeDropsForDay(int day) {
        while (dropsByDay.size() <= day) {
            dropsByDay.add(new ArrayList<Bottle>());
        }
    }

    /* add drop from bottle on specific day */
    public void addDropOnDay(int day, Bottle bottle) {
        
    }
}
