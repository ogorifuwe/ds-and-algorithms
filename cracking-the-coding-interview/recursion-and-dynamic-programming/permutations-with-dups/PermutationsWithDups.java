import java.util.ArrayList;
import java.util.HashMap;

public class PermutationsWithDups {

    static ArrayList<String> printPerms(String str) {
        ArrayList<String> result = new ArrayList<String>();
        HashMap<Character, Integer> map = buildFreqTable(str);
        printPerms(map, "", str.length(), result);
        return result;
    }

    static HashMap<Character, Integer> buildFreqTable(String str) {
        HashMap<Character, Integer> map =
                        new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }

            map.put(c, map.get(c)+1);
        }
        return map;
    }

    static void printPerms(HashMap<Character, Integer> map, String prefix,
                            int remaining, ArrayList<String> result) {
        /* base case...permutation has been completed */
        if (remaining == 0) {
            result.add(prefix);
            return;
        }

        /* try remaining letters fo next char, and generate
         * remaining permutations. */
        for (Character c : map.keySet()) {
            int count = map.get(c);
            if (count > 0) {
                map.put(c, count-1);
                printPerms(map, prefix + c, remaining-1, result);
                map.put(c, count);
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabbccc";
        ArrayList<String> result = printPerms(str);
        System.out.print("Count: " + result.size());
        for (String s : result) {
            System.out.print(s+"\n");
        }
    }
}
