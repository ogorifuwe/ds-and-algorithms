import java.util.ArrayList;

public class PermutationsWithoutDups2 {
    
    static ArrayList<String> getPerms(String str) {
        ArrayList<String> result = new ArrayList<String>();
        getPerms("", str, result);
        return result;
    }

    static void getPerms(String prefix, String str, 
                                            ArrayList<String> result) {
        int len = str.length();
        /* base case */
        if (len == 0) {
            result.add(prefix);
        }

        for (int i = 0; i < len; ++i) {
            String before = str.substring(0, i);
            String after = str.substring(i+1, len);
            char c = str.charAt(i);
            getPerms(prefix + c, before + after, result);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = getPerms("abc");
        
        System.out.print("There are " + list.size() + " permutations\n");
        
        for (String s : list) {
            System.out.print(s+"\n");
        }
    }
}
