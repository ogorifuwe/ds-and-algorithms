/**.
 * File: OneAway.java
 * ------------------
 * This program is used to determine if a string is one edit away from
 * another string.
 * Example
 * apples, aples -> true
 * apple, apples -> true
 * apple, bpple -> true
 * apple, apklex -> false
 * e
 * Please see README.md for details of this class.
 * @author Ogor Ifuwe, August 27, 2018.
 */
public class OneAway {

    /* entry point */
    public static void main(String[] args) {
        /* method calls */
        System.out.println(oneEditAway1("pale", "ple"));
        System.out.println(oneEditAway1("pales", "pale"));
        System.out.println(oneEditAway1("pale", "bale"));
        System.out.println(oneEditAway1("pale", "bae"));
    }

    /**. Solution 1.
     * @param str1 First String
     * @param str2 Second String
     * @return Returns true iff str1 is one edit away from
     * str2. 
     */
    public static boolean oneEditAway1(String first, String second) {
        if (first.length() == second.length()) {
            return OneEditReplace(first, second);        
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsertRemove(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsertRemove(second, first);
        }
        return false;
    }

    /**.
     * Used to check if str2 is one edit away from str1 by replacing a
     * character in str1.
     * @param str1 The string from which str2 might be derivable from
     * (one edit away) by replacing a character.
     * @param str2 The string one edit away from str1, by replacing a character.
     * @return Returns true iff str2 is one edit away from str1 by replacing
     * one character.
     */
    public static boolean OneEditReplace(String str1, String str2) {
        boolean foundDifference = false;
        for (int i = 0; i < str1.length(); ++i) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    /**.
     * Used to check if you can insert/remove a character into/from
     * strings.
     * @param str1 The string that a character will be inserted into
     * or removed from.
     * @param str2 The new string formed after the character has been
     * inserted into or removed from.
     * @return Returns true, if s2 is a string derived after the
     * insertion/removal operation.
     * Please see README.md for runtime analysis
     */
    public static boolean oneEditInsertRemove(String str1, String str2) {
        int idx1 = 0;
        int idx2 = 0;
        while (idx2 < str2.length() && idx1 < str1.length()) {
            if (str1.charAt(idx1) != str2.charAt(idx2)) {
                if (idx1 != idx2) {
                    return false;
                }
                idx2++;
            } else {
                idx1++;
                idx2++;
            }
        }
        return true;
    }


    /**. Solution 2.
     * This method is used to check for replacement, insertion and
     * deletion, please see README.md for details of algorithm.
     *
     */
    public static boolean oneEditAway(String str1, String str2) {
        /* length checks. */
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        /* get shorter and longer string */
        String s1 = str1.length() < str2.length() ? str1 : str2;
        String s2 = str1.length() < str2.length() ? str2 : str1;

        int idx1 = 0;
        int idx2 = 0;
        boolean foundDifference = false;
        while (idx2 < str2.length() && idx1 < str1.length()) {
            if (str1.charAt(idx1) != str2.charAt(idx2)) {
                /* ensure that this is the first difference found */
                if (foundDifference) return false;
                foundDifference = true;
                // on replace, move shorter pointer
                if (str1.length() == str2.length()) {
                    idx2++;
                }
            } else {
                idx1++;   // if matching,  move shorter pointer
            }
            idx2++;       // always move pointer for longer string
        }
        return true;
    }
}
