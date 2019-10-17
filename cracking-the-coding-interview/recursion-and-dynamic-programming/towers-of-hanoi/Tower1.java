import java.util.Stack;

public class Tower1 {

    protected Stack<Integer> disks;
    protected int index;
    private String name;

    public Tower(int idx) {
        disks = new Stack<Integer>();
        index = idx;
    }

    public int getIndex() { return index; }
    public void setName(String n) { name = n; }
    public String getName() { return name; }

    public void add(int d) {
        if (!disks.isEmpty() && disks.peek() <= d) {
            System.out.print("Error placing disk: " + d +"\n");
        } else {
            disks.push(d);
        }
    }

    public void moveTopTo(Tower t) {
        int top = disks.pop();
        t.add(top);
    }

    public void moveDisks(int n, Tower destination, Tower buffer) {
        moveDisks(n-1, buffer, destination);
        moveTopTo(destination);
        moveDisks(n-1, destination, this);
    }
}
