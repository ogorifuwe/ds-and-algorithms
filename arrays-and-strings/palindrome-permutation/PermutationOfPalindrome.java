/**
 * see PalindromePermutationReadMe.md for details
 * @author oi August 27, 2018.
 */

public class PermutationOfPalindrome {

    /* entry point of program */
    public static void main(String[] args) {
        /* method calls */
        System.out.println(isPermutationOfPalindrome1("Tact Coa"));
        System.out.println(isPermutationOfPalindrome2("Tact Coa"));
        //isPermutationOfPalindrome3("Tact Coa");
    }


    /**
     * Solution #1 -- see ReadMe.md Solution1 for more details.
     * used to check if a phrase is a permutation of a palindrome
     * @param phrase The string to be checked
     * @return returns true iff it is a permutation of a palindrome
     *         and false otherwise
     * This algorithm takes O(N) time, where N is the length of
     * the string.
     */
    public static boolean isPermutationOfPalindrome1(String phrase) {
        int[] table = buildCharFrequency(phrase);
        return checkMaxOneOdd(table);
    }

    /**
     * used to check that no more than one character has an odd count.
     * @param table The frequency table to check for the number of odd
     *        char count
     * @return returns false iff more than one char count is found,
     *         true otherwise
     */
    public static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count: table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    /**
     * Used to map each character to a number. a:0, b:1, c:2; etc.
     * This is case insensitive. Non letter characters map to -1.
     * @param c The character to be mapped to a number.
     * @return The int value of the character.
     */
    public static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    /**
     * Used to count how many times each character appears.
     * @param phrase The string to count character occurence of.
     * @return Table with frequency count.
     */
    public static int[] buildCharFrequency(String phrase) {
        int[] table = new int[Character.getNumericValue('z') -
                              Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }


    /**
     * Solution #2
     */
    public static boolean isPermutationOfPalindrome2(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') -
                              Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }
}
