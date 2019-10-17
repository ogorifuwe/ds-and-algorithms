/**.
 * File: Palindrome.java
 * ---------------------
 * Given the string, check if it is a palindrome.
 */
public class Palindrome {

    public static boolean isPalindrome(String str) {
        int len = str.length();
        String reverse = "";

        for (int i = len-1; i >= 0; --i) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    static boolean isPalindrome1(String str) {
        int len = str.length();
        int start = 0, end = len-1;
        
        while (end > start) {
            /*if (str.charAt(start) != str.charAt(end)) {*/
                //return false;
                char charStart = str.charAt(start++);
                char charEnd = str.charAt(end--);
                if (charStart != charEnd) return false;
           /* }
            start++;
            end--;*/
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome1("aabaa"));
        System.out.println(isPalindrome1("abc"));
    }
}
