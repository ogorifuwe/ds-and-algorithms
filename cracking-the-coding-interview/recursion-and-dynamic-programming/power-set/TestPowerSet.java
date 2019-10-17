import power_set.PowerSet;
import java.util.ArrayList;

public class TestPowerSet {

    public static void main(String[] args) {
    
        //PowerSet ps = new PowerSet();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; ++i) {
            list.add(i);
        }
        ArrayList<ArrayList<Integer>> subsets = PowerSet.getSubsets(list, 0);
        System.out.print(subsets.toString()+"\n");
    }
}
