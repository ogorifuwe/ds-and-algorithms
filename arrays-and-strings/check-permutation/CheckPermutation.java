/**.
 * File: CheckPermutation.java
 * ---------------------------
 * Given two strings, this program decides if
 * one is a permutation of the other.
 * ----------------------------------------------
 * | Compilation: javac CheckPermutation.java   |
 * | Exceution:   java CheckPermutation         |
 * ----------------------------------------------
 */
public class CheckPermutation {

    /** point of entry */
    public static void main(String[] args) {
            
        /* testing solutions*/
        System.out.println("Solution 1: " + permutation1("man", "amn"));
        System.out.println("Solution 2: " + permutation2("nam", "anm"));
    }

    /**.
     * Used to sort a string to perfect order.
     * @param str String to be sorted.
     */
    public static String sort(String str) {
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    /**. Solution 1
     * Used to decide if one string is a permutaion of the other by;
     * first sorting the strings to perfect order. Then comparing
     * their contents.
     * @pre Length of both string parameters must be equal.
     * @post Sorts two string parameters and check if their
     * characters are the same.
     * @param str1 The first string.
     * @param str2 The second string.
     * @return Returns true iff str2 is a permutation of str1;
     * returns false otherwise.
     */
    public static boolean permutation1(String str1, String str2) {
        /* permutations must be same length */
        if (str1.length() != str2.length()) return false;

        return sort(str1).equals(sort(str2));
    }

    /**. Solution 2
     * Used to decide if one string is a permutation of the other by;
     * initializing an int array, reading in the frequency of each character
     * of the string in the first iteration and decrementing in the second
     * iteration.
     * @pre Length of both string parameters must be equal.
     * @post Initializes an int array, keeps count of character frequency,
     * decrements frequency in the second iteration.
     * @param str1 The first string.
     * @param str2 The second string.
     * @return Returns true iff str2 is a permutation of str1;
     * returns false otherwise.
     */
    public static boolean permutation2(String str1, String str2) {
        /* permutations must be same length */
        if (str1.length() != str2.length()) return false;

        int[] letters = new int[128]; // Assumption: ASCII encoded characters
        for (int i = 0; i < str1.length(); ++i) {
            letters[str1.charAt(i)]++;
        }

        for (int j = 0; j < str2.length(); ++j) {
            letters[str2.charAt(j)]--;
            if (letters[str2.charAt(j)] < 0) {
                return false;
            }
        }
        return true;    /* i.e letters either has -ve or +ve values */
    }
    /**.
     * Time Complexity: O(N) 
     */   
}
