/**.
 * File: PermutationOfPalindrome.java
 * ----------------------------------
 * This program checks a word or phrase to determine if its a permutation
 * of a palindrome. Please see README.md for details of algorithm. 
 * ----------------------------------------------------
 * | Compilation: javac PermutationOfPalindrome.java  |
 * | Execution:   java PermutationOfPalindrome        |
 * ----------------------------------------------------
 */

public class PermutationOfPalindrome {

    private static final String SENTINEL = "exit";
    /* entry point of program */
    public static void main(String[] args) {
        /* program introduction */
        greetUser();
        
        while (true) {
            String str = promptUser();
            if (str.equalsIgnoreCase(SENTINEL)) break;
            System.out.print("Solution 1: "
                    + isPermutationOfPalindrome1(str)+"\n");
            System.out.print("Solution 2: "
                    + isPermutationOfPalindrome2(str)+"\n");
        }
    }


    /**. Solution 1
     * Used to check if a phrase is a permutation of a palindrome
     * @param phrase The string to be checked
     * @return Returns true iff it is a permutation of a palindrome
     *         and false otherwise.
     * Time Complexity: algorithm takes O(N) time, where N is the 
     * length of the string.
     */
    public static boolean isPermutationOfPalindrome1(String phrase) {
        int[] table = buildCharFrequency(phrase);
        return checkMaxOneOdd(table);
    }

    /**.
     * used to check that no more than one character has an odd count.
     * @param table The frequency table that contains count of chars.
     * @return returns false iff more than one char with odd count is 
     * found, true otherwise.
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

    /**.
     * Used to map each character to a number. a:0, b:1, c:2; etc.
     * It is case insensitive. Non letter characters map to -1.
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

    /**.
     * Used to count the number of occurrence of each character appears.
     * @param phrase The string whose characters are to be analyzed..
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


    /**. Solution #2
     * Please see README.md for details.
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

    /**. Used to prompt user */
    private static String promptUser() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print(": ");
        String str = sc.nextLine();
        return str;
    }

    /**. Used to introduce program */
    private static void greetUser() {
        System.out.print("Hello, welcome!\n");
        System.out.print("This program checks a word or phrase"
                + " to determine if its a permutaion of a palindrome\n");
        System.out.print("To quit, enter \"exit\"\n");
        System.out.print("Enter a word/phrase below to check\n");
    }

}
