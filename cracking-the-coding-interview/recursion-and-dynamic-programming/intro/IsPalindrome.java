public class IsPalindrome {

    public static void main(String[] args) {
        System.out.print(isPalindrome("racecar")+"\n");
        System.out.print(isPalindrome("Step on no pets")+"\n");
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.length() < 2) {
            return true;
        } else {
            char first = s.charAt(0);
            char last = s.charAt(s.length()-1);
            if (first == last) {
                String middle = s.substring(1, s.length()-1);
                return isPalindrome(middle);
            } else {
                return false;
            }
        }
    }
}
