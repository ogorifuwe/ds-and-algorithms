/**
 * Please see OneAwayReadMe.md for details of this class.
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
    /**
     * Solution 1.
     * Please see OneAwayReadMe.md for details.
     * @param first 
     * @param second
     * @return Returns true iff second is derivable from
     *         oneEditReplace() or oneEditInsertRemove() 
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

    /**
     * Used to check if s2 is derived from s1 by replacing a
     * character in s1.
     * @param s1 The string by which s2 can be derived by replacing
     *           a character.
     * @param s2 The string derived from s1, by replacing a character.
     * @return Returns true iff s2 is derivable from s1 by replacing
     *         one character.
     */
    public static boolean OneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    /** Used to check if you can insert/remove a character into/from
     *  s1 to make s2.
     *  @param s1 The string that a character will be inserted into
     *            or removed from.
     *  @param s2 The new string formed after the character has been
     *            inserted or removed from.
     *  @return Returns true, if s2 is a string derived after the
     *          insertion/removal operation.
     */
    public static boolean oneEditInsertRemove(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }


    /**
     * Solution 2.
     *
     */
    public static boolean oneEditAway(String first, String second) {
        /* length checks. */
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        /* get shorter and longer string */
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                /* ensure that this is the first difference found */
                if (foundDifference) return false
                foundDifference = true;
                // on replace, move shorter pointer
                if (s1.length() == s2.length()) {
                    index++;
                }
            } else {
                index1++;   // if matching,  move shorter pointer
            }
            index2++;       // always move pointer for longer string
        }
        return true;
    }
}
