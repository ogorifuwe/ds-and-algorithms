/**
 * Question: Write a method to replace all spaces in a string with
 * '%20'. You may assume that the string has sufficient space at the
 * end to hold the additional characters, and that you are given the
 * "true" length of the string. (NB: Please use a character array so
 * that you can perform this operation in place.)
 */
public class URLify {

    public static void main(String[] args) {
        /*java.util.Scanner stdIn = new java.util.Scanner(System.in);
        String input = stdIn.nextLine();
        System.out.println(urlIfy(input));     
        */
        char[] word = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h'};
        replaceSpaces(word, 13);
    }

    /**
     * Used to replace all spaces in a string with %.
     * @pre Length of the string is known.
     * @post replaces all spaces within the string with %20.<br>
     * @param str The string to be examined for spaces.
     * @param content A char array used to perform the replacement
     *        operation in place.<br>
     * @return A string with modified spaces as %20.
     */
    public static String urlIfy(String str) {
        char[] content = str.toCharArray();
        for (int i = 0; i < content.length; ++i) {
            if (content[i] == ' ')
                content[i] = '%';
        }
        return new String(content);
        // return content.toString();
    }

    /**
     *Used to replace all spaces in a string with %20.
     */
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; ++i) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0'; // End array
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

    }
}
