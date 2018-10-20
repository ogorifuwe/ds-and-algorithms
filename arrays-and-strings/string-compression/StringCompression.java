/**
 * Please refer to StringCompressionReadMe.md for details
 * of this class and its behaviors.
 * @author oi August 29, 2018
 */
public class StringCompression {
    
    public static void main(String[] args) {
        /* entry point */
        System.out.println(compressBad("aabcccccaaa"));
    }

    /**
     * Solution 1
     * Naive algorithm used to compress a string. Please see 
     * ReadMe for details.
     * @param str The string to be compressed.
     * @return The compressed version of str.
     */
    public static String compressBad(String str) {
        String compressedString = "";
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); ++i) {
            countConsecutive++;

            /* if next character is different than
             * current, append this char to result */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }

        }
        return compressedString.length() < str.length() ? compressedString : str;
    }


    /**
     * Solution 2
     */
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); ++i) {
            countConsecutive++;

            /* if next character is different than current,
             * append this char to result */
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    /**
     * Solution 3
     */

    static int countCompression(String str) {
        int compressionLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); ++i) {
            countConsecutive++;

            /* if next character is different than current,
             * increase the length */
            if (i + 1 >= str.length()  )
        }
    }
}
