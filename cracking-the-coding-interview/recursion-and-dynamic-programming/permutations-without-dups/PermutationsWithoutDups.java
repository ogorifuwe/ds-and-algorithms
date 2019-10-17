import java.util.ArrayList;

public class PermutationsWithoutDups {

    static ArrayList<String> getPerms(String str) {
        /* edge case */
        if (str == null) return null;

        ArrayList<String> permutations =
                                new ArrayList<String>();
        /* base case */
        if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        /* recursive case */
        char first = str.charAt(0); // get first character
        String remainder = str.substring(1); // get remaining string
        ArrayList<String> words = getPerms(remainder);
        for (String word : words) {
            for (int j = 0; j <= word.length(); ++j) {
                String s = insertCharAt(word, first, j);
                permutations.add(s);
            }
        }
        return permutations;
    }

    static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }

    public static void main(String[] args) {
        ArrayList<String> list = getPerms("abcde");
        System.out.print("There are " + list.size() + " permutations.\n");
        for (String s : list) {
            System.out.print(s+"\n");
        }
    }
}
