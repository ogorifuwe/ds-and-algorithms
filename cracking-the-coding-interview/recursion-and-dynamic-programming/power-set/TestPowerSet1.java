import power_set.PowerSet1;
import java.util.ArrayList;

public class TestPowerSet1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 3; ++i) {
            list.add(i);
        }

        ArrayList<ArrayList<Integer>> subsets = PowerSet1.getSubsets(list, 0);
        System.out.print(subsets.toString()+"\n");
    }
}
