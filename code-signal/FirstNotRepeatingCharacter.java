public class FirstNotRepeatingCharacter {

    static char firstNotRepeatingCharacter(String s) {
        int[] chars = new int[128];

        for (int i = 0; i < s.length(); ++i) {
            chars[s.charAt(i)]++;    
        }

        int idx = 0;

        for (int i = 0; i< s.length(); ++i) {
            if (chars[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String s = "abacabad";
        char fnrc = firstNotRepeatingCharacter(s);
        System.out.println(fnrc);
    }
}
