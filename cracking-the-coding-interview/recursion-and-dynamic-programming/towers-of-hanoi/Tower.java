import java.util.Stack;

public class Tower {
    
    public Stack<Integer> disks;
    public int index;
    public String name;

    public Tower(int idx) {
        disks = new Stack<Integer>();
        index = idx;
    }

    public int getIndex() { return index; }
    public int getName() { return name; }
    public void setName(String n) {  name = n; }

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

    public void print() {
        System.out.print("Contents of Tower " + name
                + ": " + disks.toString() +"\n");
    }

    public void moveDisks(int n, Tower destination, Tower buffer) {
        if (n > 0) {
            moveDisks(n-1, buffer, destination);
            moveTopTo(destination);
            buffer.moveDisks(n-1, destination, this);
        }
    }
}
