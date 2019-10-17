/**.
 * File: URLify.java
 * -----------------
 * This program replaces the spaces in an input string with "%20".
 * Please see README.md for details.
 * --------------------------------------
 * | Compilation: javac URLify.java     |
 * | Execution:   java URLify.java      |
 * --------------------------------------
 */
public class URLify {

    private static final String SENTINEL = "exit";
    
    public static void main(String[] args) {
        /* introduce program  to user*/
        greetUser();
        /* prompt user for input */
        while (true) {
            String str = promptUser();
            if (str.equalsIgnoreCase(SENTINEL)) break;
            /* initialize a char array using str */
            char[] word = str.toCharArray();
            /* test solution 1 */
            replaceSpaces1(word, word.length);
        }
    }


    /**. Solution 1
     * Used to replace all spaces in a string with %20.
     * @post A transformed version of the input string.
     * @param inputString Character array of string to be transformed.
     * @param origLength Length of the character array.
     */
    private static void replaceSpaces1(char[] inputStr, int origLength) {
        int numSpaces = 0, newIdx, i = 0; 
        for (i = 0; i < origLength; i++) {
            if (inputStr[i] == ' ') {
                numSpaces++;
            }
        }
        try {
            newIdx = origLength + numSpaces * 2;
            if (origLength < inputStr.length) inputStr[origLength] = '\0'; // End array
            for (i = origLength - 1; i >= 0; i--) {
                if (inputStr[i] == ' ') {
                    inputStr[newIdx - 1] = '0';
                    inputStr[newIdx - 2] = '2';
                    inputStr[newIdx - 3] = '%';
                    newIdx = newIdx - 3;
                } else {
                    inputStr[newIdx - 1] = inputStr[i];
                    newIdx--;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
               //e.printStackTrace();
        }
        System.out.print(inputStr+"\n");
        //System.out.print(java.util.Arrays.toString(inputStr)+"\n");
    }
    /**.
     * Time complexity:     O(N)
     * Space complexity:    O(1)
     * NB: You might experience issues with this algorithm if you are a vim user.
     * Running on eclipse abstracts the issues.
     */


    /**.
     * Used to prompt user for input
     */
    public static String promptUser() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();
        return str;
    }

    public static void greetUser() {
        System.out.print("This program replaces the spaces in a string with \"%20\"\n");
        System.out.print("To quit program, simply enter \"exit\" at prompt, thanks :)\n");
        System.out.print("Please enter a sentence that you would like to URLify:\n");
    }


}
