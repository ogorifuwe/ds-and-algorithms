package power_set;
import java.util.ArrayList;

public class PowerSet1 {

    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int idx) {
        ArrayList<ArrayList<Integer>> allsubsets;
        if (set.size() == idx) {
            allsubsets = new ArrayList<ArrayList<Integer>>();
            allsubsets.add(new ArrayList<Integer>());
        } else {
            allsubsets = getSubsets(set, idx+1);
            int item = set.get(idx);
            ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> subset : allsubsets) {
                ArrayList<Integer> newsubset = new ArrayList<Integer>();
                newsubset.addAll(subset);
                newsubset.add(item);
                moresubsets.add(newsubset);
            }
            allsubsets.addAll(moresubsets);
        }
        return allsubsets;
    }
}
