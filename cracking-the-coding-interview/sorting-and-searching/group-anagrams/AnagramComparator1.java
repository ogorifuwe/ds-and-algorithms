import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator1 implements Comparator<String> {
    
    private String sortChars(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }
}
