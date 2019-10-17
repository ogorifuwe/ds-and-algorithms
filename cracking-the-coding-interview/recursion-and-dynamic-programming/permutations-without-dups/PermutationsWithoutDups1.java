import java.util.ArrayList;

public class PermutationsWithoutDups1 {
    
    static ArrayList<String> getPerms(String remainder) {
        int len = remainder.length();
        ArrayList<String> result =
                    new ArrayList<String>();
        if (len == 0) {
            result.add("");
            return result;
        }

        for (int i = 0; i < len; ++i) {
            /* remove char i and find permutation of remaining chars */
            String before = remainder.substring(0, i);
            String after = remainder.substring(i+1, len);
            ArrayList<String> partials = getPerms(before + after);
            /* prepend char i to each permutation */
            for (String s : partials) {
                result.add(remainder.charAt(i) + s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = getPerms("abc");
        System.out.print("There are " + list.size() + " permutations.\n");
        for (String s : list) {
            System.out.print(s + "\n");
        }
    }

}
