/**
 * Question: Given two strings, write a method to decide if one
 *           is a permutation of the other.
 */


public class CheckPermutation {
    
    /** entry point */
    public static void main(String[] args) {
        // method calls
        System.out.println(permutation1("man","amn"));
        System.out.println(permutation2("man","amn"));
    }


    /**
     * Used to sort a string to perfect order.
     * @param s A string to be sorted
     */
    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }


    /**
     * Used to decide if one string is a permutaion of the other
     * @param s the first string.
     * @param t the second string.
     */
    public static boolean permutation1(String s, String t) {
        // permutations must be same length
        if (s.length() != t.length()) return false;

        return sort(s).equals(sort(t));
    }


    /**
     * Used to decide if one string is a permutation of the other
     * @param s The first string.
     * @param t The second string.
     */
    public static boolean permutation2(String s, String t) {
        // permutations must be same length
        if (s.length() != t.length()) return false;

        int[] letters = new int[128]; // Assumption: ASCII
        for (int i = 0; i < s.length(); ++i) {
            letters[s.charAt(i)]++;
        }

        for (int j = 0; j < t.length(); ++j) {
            letters[t.charAt(j)]--;
            if (letters[t.charAt(j)] < 0) {
                return false;
            }
        }
        return true;    /* letters has no neg values, and therefore
        no pos values either */
    }   
}
