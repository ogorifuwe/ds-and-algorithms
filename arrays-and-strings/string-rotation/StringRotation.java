/**.
 * File: StringRotation.java
 * --------------------------
 * This program checks if one word is a substring of another.
 * Example: "waterbottle" is a rotation of "erbottlewat".
 * -------------------------------------------
 * | Compilation: javac StringRotation.java  |
 * | Execution:   java StringRotation        |
 * -------------------------------------------
 */
public class StringRotation {
    
    public static void main(String[] args) {
        System.out.print(isRotation("waterbottle", "erbottlewat")+"\n");
    }

    private static boolean isRotation(String str1, String str2) {
        /* check that str1 and str2 are equal in length and are not empty */
        if (str1.length() == str2.length() && str1.length() > 0) {
            /* concatenate str1 and str1 within a new buffer */
            String str1str1 = str1 + str1;
            //return str1str1.contains(str2);
            if (str1str1.indexOf(str2) != -1)
                return true;
        }
        return false;
    }

}
