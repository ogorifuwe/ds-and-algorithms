/**.
 * File: StringCompression.java
 * ----------------------------
 * This program compresses a string input by replace consecutive
 * repeating characters with the character the count(number of times)
 * of the character.
 * Example:
 * Input: "aaaabbbbbcccccddddddee"
 * Output: "a4b5c5d6e2""
 * ------------------------------------------------
 * | Compliation: javac StringCompression.java    |
 * | Execution:   java StringCompression          |
 * ------------------------------------------------
 *
 * Please see README.md for details and performance of the algorithms
 */
public class StringCompression {
    
    public static void main(String[] args) {
        /* entry point */
        System.out.print(compressString1("abbcccddddeeeeeffffffeeeeeee")+"\n");
        System.out.print(compressString1("abbcc")+"\n");
        System.out.print(compressString2("abbcccddddeeeeeffffffeeeeeee")+"\n");
        System.out.print(compressString2("abbcc")+"\n");
        System.out.print(compressString3("abbcccddddeeeeeffffffeeeeeee")+"\n");
        System.out.print(compressString3("abbcc")+"\n");




    }

    /**. Solution 1
     * @param str The string to be compressed.
     * @param csv Compressed String Version of str.
     * @param ccc Consecutive Count of Character.
     * @return The compressed string Version(csv).
     */
    private static String compressString1(String str) {
        String csv = "";
        int ccc = 0;
        for (int i = 0; i < str.length(); ++i) {
            ccc++;

            /* if next character is different than
             * current, append this char to result */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                csv += "" + str.charAt(i) + ccc;
               ccc = 0;
            }

        }
        return csv.length() < str.length() ? csv : str;
    }


    /**. Solutiopn 2
     * This method uses a string builder object to append consecutive
     * characters and count(for performance optimization reasons), 
     * instead of string concatenation which has a complexity of O(n^2).
     * Otherwise, algorithm, mechanisms and varaibles are as Solution 1.
     */
    private static String compressString2(String str) {
        StringBuilder csv = new StringBuilder();
        int ccc = 0;
        for (int i = 0; i < str.length(); ++i) {
            ccc++;

            /* if next character is different than current,
             * append this char to result */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                csv.append(str.charAt(i));
                csv.append(ccc);
                ccc = 0;
            }
        }
        return csv.length() < str.length() ? csv.toString() : str;
    }

    /**. Solution 3
     * This method also uses a string builder object as in Solution,
     * but with gets the capacity ahead of time which helps with
     * tradeoffs of overhead cost for large enough string objects.
     * See README for additional details.
     * @param str The string to be compressed.
     * @param csl compressed String Length.
     * @param ccc Consecutive Count of Characters.
     * @param csv Compressed String Version.
     * @Return csv The Compressed Version of String.
     */
    private static String compressString3(String str) {
        int initialCapacity = countOfCSV(str);
        if (initialCapacity >= str.length()) return str;

        StringBuilder csv = new StringBuilder(initialCapacity);
        int ccc = 0;
        for (int i = 0; i < str.length(); ++i) {
            ccc++;
            /* if next charcter is different than current,
             * append this char to result */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                csv.append(str.charAt(i));
                csv.append(ccc);
                ccc = 0;
            }
        }
        return csv.toString();
    } 

    /**.
     * This method is used to get the character count of the
     * compressed string version of a string.
     * @param str The string whose compressed verson length is to be
     * determined.
     * @param csl compressed String Length.
     * @param ccc Consecutive Count of Characters.
     * @return csl The length of the compressed string.
     */
    static int countOfCSV(String str) {
        int csl = 0;
        int ccc = 0;
        for (int i = 0; i < str.length(); ++i) {
            ccc++;

            /* if next character is different than current,
             * increase the length */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                ccc++;
                csl += 1 + String.valueOf(ccc).length();
                ccc = 0;
            }
        }
        return csl;
    }
}
