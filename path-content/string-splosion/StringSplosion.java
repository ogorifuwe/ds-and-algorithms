/**.
 * Given a non-empty string like "Code" return a string like "CCoCodCode"
 *
 * stringSplosion("Code") --:~ "CCoCodCode"
 * stringSplosion("abc")  --:~ "aababc"
 * stringSplosion("ab")   --:~ "aab"
 **/

public class StringSplosion {
    
    static String stringSplosion(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); ++i) {
            str += str.substring(0, i);
        }
        return str1.concat(str);
    }

    static String stringSplosion1(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); ++i) {
            sb.append(str.substring(0, i));
        }
        return sb.toString().concat(str);
    }

    public static void main(String[] args) {
        String str = "Code";
        String newStr = stringSplosion1(str);
        System.out.print(newStr + "\n");
    }
}
