/**.
 * Given two strings, base and remove, return a version of the base string
 * where all instances of the remove string have been removed (not case
 * sensitive). You may assume that the remove string is length 1 or more.
 * Remove only non-overlapping instances, so with "xxx" with "xx" leaves "x".
 *
 * withoutString("Hello there", "llo") --:~ "He there"
 * withoutString("Hello there", "e")   --:~ "Hllo thr"
 * withoutString("Hello there", "x")   --:~ "Hello there"
 **/
public class WithoutString {

    public static String withoutString(String base, String remove) {
        String result = ""; // initialize new string
        int index = base.toLowerCase().indexOf(remove.toLowerCase());
        while(index != -1) {
            result += base.substring(0, index);
            base = base.substring(index + remove.length());
            index = base.toLowerCase().indexOf(remove.toLowerCase());
        } 
        result += base;
        return result;
    }

    public static void main(String[] args) {
        String base = "Hello there", remove = "llo";
        String str = withoutString(base, remove);
        System.out.println(str);
    }
}
