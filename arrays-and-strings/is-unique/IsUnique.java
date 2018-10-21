/**.
 * File: IsUnique.java
 * -------------------
 * This program implements an algorithm to determine if a string
 * has all unique characters. Please see README.md for more details.
 * ------------------------------------
 * | To Compile:  javac IsUnique.java |
 * | To Run:  java IsUnique       |
 * ------------------------------------
 */


public class IsUnique {
    
    private static final String SENTINEL = "exit";

    /** point of entry */
    public static void main(String[] args) {
        /* program introduction */
        greetUser();
        
        while (true) {
            /* prompt user */
            String str = promptUser();
            if (str.equalsIgnoreCase(SENTINEL)) break;

            /* testing implementations */
            // solution 1
            System.out.print("Test for Solution 1: " + isUniqueCharacters1(str) +"\n");
            // solution 2
            System.out.print("Test for Solution 2: " + isUniqueCharacters2(str) + "\n");
            // solution 3
            System.out.print("Test for Solution 3: " + isUniqueCharacters3(str) +"\n");
            // solution 4
            System.out.print("Test for Solution 4: " + isUniqueCharacters4(str) + "\n");
        }
    }


    /**. Solution 1
     * Checks if a string has all unique characters.
     * @param str The string to be determined if it has all unique characters.
     * @pre str.lenght() <= 128, denoting ASCII string.
     * @post Instantiates a boolean array, checks if character has been
     *       previously, return false or true accordingly.
     * @return Returns false iff str.length() > 128 or
     *         iff int equivalent of character has been previously seen,
     *         returns true otherwise.
     */
    public static boolean isUniqueCharacters1(String str) {
        if (str.length() > 128) return false;
        
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
    /**.
     * Time Complexity: O(n), where n is the length of the string.
     * Space Complexity: O(1)
     * It could be argued that that time complexity is O(c), where
     * c is the size of the character set (The loop never iterates
     * through more than 128 characters and not assuming a fixed
     * character set helps us come to that concluson).
     */


    /**. Solution 2
     * Using bit vector, we can reduce space usage by a factor of 8
     * NB: This algorithm assumes that the string entered only uses
     * lowercase letters a through z.
     */
    public static boolean isUniqueCharacters2(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';
           if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    /**. Soluton 3
     * Using a hash set, we iterate through the string and check if we
     * have previously seen the character at that index. If we have we 
     * return false, other we add it to the hash set and move to the
     * next character, repeating the previous step until we reach the
     * end of the string.
     * @pre String <=  128 characters.
     * @post Takes a String and checks if it has all unique characters.
     * @param str String to be checked if all characters are unique or not.
     * @return Returns true iff str has all unique characters, returns false 
     * otherwise
     */
    public static boolean isUniqueCharacters3(String str) {
        if (str.length() > 128) return false;

        java.util.HashSet charSet = new java.util.HashSet(128);
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (charSet.contains(ch)) return false;
            charSet.add(ch);
        }
        return true;
    }
    /**.
     * Time complexity: O(s) where s is the length of the string.
     */


    /**. Solution 4
     * Comparing every character of the string to every other character
     * of the string.
     */
    public static boolean isUniqueCharacters4(String str) {
        if (str.length() > 128) return false;

        for (int i = 0; i < str.length(); ++i) {
            char ch1 = str.charAt(i);
            for (int j = i+1; j < str.length(); ++j) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2) return false;
            }
        }
        return true;
    }
    /**.
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     */

    /**. Used to prompt user */
    public static String promptUser() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        return str;
    }

    /**. Simple introduction to program */
    public static void greetUser() {
        System.out.print("This program is used to determine if a string of"
                + "ASCII characters\n");
        System.out.print("has all unique characters.\n");
        System.out.print("Enter a string to find out if they have all unique"
                + " characters\n");
        System.out.print("To quit this program, please enter \"exit\" \n");
    }

}
